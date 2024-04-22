/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Connection;
/**
 *
 * @author JHONNY
 */
public class Proveedor {

    public Proveedor(Connection conexion11) {
    }
    
    Connection conexion;
    ConexionBD cnbd;
    PreparedStatement ps;
    ResultSet rs;
    

    
    private int idProveedor;
    private String nombre;
    private String documento;
    private String telefono;

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "nombre=" + nombre + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.idProveedor;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Proveedor other = (Proveedor) obj;
        return this.idProveedor == other.idProveedor;
    } 
    
    public Iterator<Proveedor> listarProveedore() throws SQLException{
        ArrayList<Proveedor> losproveedores = new ArrayList<>();
        try{
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("SELECT * FROM "+this.getClass().getSimpleName());
            ResultSet rs = sql.executeQuery();
            Proveedor unproveedor;
            while(rs.next()){
                unproveedor = new Proveedor(conexion);
                unproveedor.setIdProveedor(   rs.getInt("idProveedor"));
                unproveedor.setNombre(        rs.getString("nombre"));
                unproveedor.setDocumento(     rs.getString("documento"));
                unproveedor.setTelefono(      rs.getString("telefono"));
                losproveedores.add(unproveedor);
            }
        }catch(SQLException ex){
            System.err.println("Error al listar proveedores "+ex.getMessage());
        }
        if (losproveedores.isEmpty()){
            Proveedor mipro = new Proveedor(conexion);
            mipro.setNombre("no hay proveedores");
            losproveedores.add(mipro);
        }
        return losproveedores.iterator();
    }
    
    public void insertar(){
        try{
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("INSERT INTO "
                    +this.getClass().getSimpleName()+" (nombre, documento, telefono) VALUES(?,?,?)");
            sql.setString(1, this.getNombre());
            sql.setString(2, this.getDocumento());
            sql.setString(3, this.getTelefono());
            sql.executeUpdate();
            System.out.println(this.getClass().getSimpleName()+ " Insertado correctamente");
        }catch (SQLException ex){
            System.err.println("Error al insertar "+this.getClass().getSimpleName()+":"+ex.getMessage());
        }
    }
    
    public void modificar(){
        try{
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("UPDATE "+this.getClass().getSimpleName()+
                    " SET nombre = ?, documento = ?, telefono = ? WHERE idProveedor = ?");
            sql.setString(1, this.getNombre());
            sql.setString(2, this.getDocumento());
            sql.setString(3, this.getTelefono());
            sql.setInt(4, this.getIdProveedor());
            sql.executeUpdate();
            System.out.println(this.getClass().getSimpleName()+ " modificado correcctamente");
        }catch (SQLException ex){
            System.err.println("Error al modificara "+this.getClass().getSimpleName()+": "+ex.getMessage());
        }
    }
    
    public void eliminar() {
        try {
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("DELETE FROM "+
                this.getClass().getSimpleName()+ " WHERE idProveedor =?");
            sql.setInt(1, this.getIdProveedor());
            sql.executeUpdate();
            System.out.println(this.getClass().getSimpleName()+ " eliminado correctamente");
        
        } catch (SQLException e) {
            System.err.println("error al eliminar "+this.getClass().getSimpleName()+": "+e.toString());
        }
        
   }
    
    
    public Iterator<Proveedor> buscar(String busqueda){
        ArrayList<Proveedor> losproveedores = new ArrayList<>();
        try{
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("SELECT * FROM "+this.getClass().getSimpleName()
                    +" WHERE nombre LIKE ? OR documento LIKE ? OR telefono LIKE ?");
            sql.setString(1,"%"+busqueda+"%");
            sql.setString(2,"%"+busqueda+"%");
            sql.setString(3,"%"+busqueda+"%");
            ResultSet rs = sql.executeQuery();
            Proveedor unproveedor;
            while(rs.next()){
                unproveedor = new Proveedor(conexion);
                unproveedor.setIdProveedor(  rs.getInt("idProveedor"));
                unproveedor.setNombre(       rs.getString("nombre"));
                unproveedor.setDocumento(    rs.getString("documento"));
                unproveedor.setTelefono(     rs.getString("telefono"));
                losproveedores.add(unproveedor);
            }
        }catch (SQLException ex){
            System.err.println("Error al buscar "+this.getClass().getSimpleName()+":"+ex.getMessage());
        }
        return losproveedores.iterator();
    }
    
    public Proveedor buscarPorID(int elId){
        Proveedor unproveedor = new Proveedor(conexion);
        unproveedor.setNombre("Proveedor no existe");
        try{
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("SELECT * FROM "
                    +this.getClass().getSimpleName()+" WHERE idProveedor = ?");
            sql.setInt(1, elId);
            ResultSet rs = sql.executeQuery();
            while(rs.next()){
                unproveedor.setIdProveedor( rs.getInt("idProveedor"));
                unproveedor.setNombre(      rs.getString("nombre"));
                unproveedor.setDocumento(   rs.getString("documento"));
                unproveedor.setTelefono(    rs.getString("telefono"));
            }
        }catch (SQLException ex){
            System.err.println("Error al buscar por id "+ex.getMessage());
        }
        return unproveedor;
    }
   
}
