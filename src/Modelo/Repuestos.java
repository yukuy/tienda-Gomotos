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


/**
 *
 * @author JHONNY
 */
public class Repuestos {
    
    private int idRepuestos;
    private String nombre;
    private int cantidad;
    private String tipo;
    private int precio;
    

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    
    public int getIdRepuestos() {
        return idRepuestos;
    }

    public void setIdRepuestos(int idRepuestos) {
        this.idRepuestos = idRepuestos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   
    @Override
    public String toString() {
        return "Repuestos{" + "nombre=" + nombre + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Repuestos other = (Repuestos) obj;
        return this.idRepuestos == other.idRepuestos;
    }
    
    public Iterator<Repuestos> listar(){
        ArrayList<Repuestos> losrepuestos = new ArrayList<>();
        try{
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("SELECT * FROM "+this.getClass().getSimpleName());
            ResultSet rs = sql.executeQuery();
            Repuestos unrepuesto;
            while (rs.next()){
                unrepuesto = new Repuestos();
                unrepuesto.setIdRepuestos(  rs.getInt("idRepuestos"));
                unrepuesto.setNombre(      rs.getString("nombre"));
                unrepuesto.setCantidad(    rs.getInt("cantidad"));
                unrepuesto.setTipo(        rs.getString("tipo"));
                unrepuesto.setPrecio(      rs.getInt("precio"));
              
                losrepuestos.add(unrepuesto);
            }
        }catch (SQLException ex){
            System.err.println("Error al listar "+ex.getMessage());
        }
        if(losrepuestos.isEmpty()){
            Repuestos misrepuestos = new Repuestos();
            misrepuestos.setNombre("No hay repuestos");
            losrepuestos.add(misrepuestos);
        }
        return losrepuestos.iterator();
    }
    
    public void insertar(){
        try{
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("INSERT INTO "+this.getClass().getSimpleName()+ " VALUES(NULL,?,?,?,?)");
            sql.setString(1, this.getNombre());
            sql.setInt(2, this.getCantidad());
            sql.setString(3, this.getTipo());
            sql.setInt(4, this.getPrecio());
           
            sql.executeUpdate();
            System.out.println(this.getClass().getSimpleName()+ " insertado correctamente");
        }catch (SQLException ex){
            System.err.println("Error al insertar "+this.getClass().getSimpleName()+": "+ex.getMessage());
        }
        
    }
    
    public void modificar() {
    try {
        PreparedStatement sql = ConexionBD.conexion.prepareStatement("UPDATE "+this.getClass().getSimpleName() + 
            " SET nombre = ?, cantidad = ?, tipo = ?, precio = ? WHERE idRepuestos = ?");
        sql.setString(1, this.getNombre());
        sql.setInt(2, this.getCantidad());
        sql.setString(3, this.getTipo());
        sql.setInt(4, this.getPrecio());
        sql.setInt(5, this.getIdRepuestos());
        
        int filasAfectadas = sql.executeUpdate(); // Utilizamos executeUpdate() para sentencias de actualización
        
        if (filasAfectadas > 0) {
            System.out.println(this.getClass().getSimpleName() + " modificado correctamente");
        } else {
            System.out.println("No se realizó ninguna modificación");
        }
    } catch (SQLException ex) {
        System.err.println("Error al modificar " + this.getClass().getSimpleName() + ": " + ex.getMessage());
    }
}

    
//    public void modificar(){
//        try{
//            PreparedStatement sql = ConexionBD.conexion.prepareStatement("UPDATE "+this.getClass().getSimpleName()+ 
//                    " SET nombre = ?, cantidad = ?, tipo = ?, precio = ? WHERE idRepuestos = ?");//
//            sql.setString(1, this.getNombre());
//            sql.setString(2, this.getCantidad());
//            sql.setString(3, this.getTipo());
//            sql.setString(4, this.getPrecio());
//            sql.setInt(5, this.getIdRepuestos());
//            sql.executeQuery();
//            System.out.println(this.getClass().getSimpleName()+ " isertado correctamente");
//        }catch ( SQLException ex){
//            System.err.println("Error al modificar "+this.getClass().getSimpleName()+": "+ex.getMessage());
//        }
//    }
    
    public void eliminar(){
        try{
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("DELETE FROM "
                    +this.getClass().getSimpleName()+" WHERE idRepuestos = ?");
            sql.setInt(1, this.getIdRepuestos());
            sql.executeUpdate();
            System.out.println(this.getClass().getSimpleName()+ " eliminado correctamente");
        }catch (SQLException ex){
            System.err.println("Error al eliminar "+this.getClass().getSimpleName()+": "+ex.getMessage());
        }
    }
    
    public Iterator<Repuestos> buscar(String busqueda){
        ArrayList<Repuestos> losrepuestos = new ArrayList<>();
        try{
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("SELECT * FROM "+this.getClass().getSimpleName()
                    +" WHERE nombre LIKE ? OR cantidad LIKE ? OR tipo LIKE ? OR precio LIKE ? ");
            sql.setString(1, "%"+busqueda+"%");
            sql.setString(2, "%"+busqueda+"%");
            sql.setString(3, "%"+busqueda+"%");
            sql.setString(4, "%"+busqueda+"%");
            ResultSet rs = sql.executeQuery();
            Repuestos unrepuesto;
            while (rs.next()){
                unrepuesto = new Repuestos();
                unrepuesto.setIdRepuestos( rs.getInt("idRepuestos"));
                unrepuesto.setNombre(     rs.getString("nombre"));
                unrepuesto.setCantidad(   rs.getInt("cantidad"));
                unrepuesto.setTipo(       rs.getString("tipo")); 
                unrepuesto.setPrecio(     rs.getInt("precio"));
                
                losrepuestos.add(unrepuesto);
            }
        }catch (SQLException ex){
            System.err.println("Error al buscar "+this.getClass().getSimpleName()+": "+ex.getMessage());
        }
        return losrepuestos.iterator();
    }
    public Repuestos bucarPorId(int elId){
        Repuestos unrepuesto = new Repuestos();
        unrepuesto.setNombre("no hay repuestos");
        try{
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("SELECT * FROM "
                    +this.getClass().getSimpleName()+" WHERE idRepuestos");
            sql.setInt(1, elId);
            ResultSet rs = sql.executeQuery();
            while (rs.next()){
                unrepuesto.setIdRepuestos( rs.getInt("idRepuestos"));
                unrepuesto.setNombre(     rs.getString("nombre"));
                unrepuesto.setCantidad(   rs.getInt("cantidad"));
                unrepuesto.setTipo(       rs.getString("tipo")); 
                unrepuesto.setPrecio(     rs.getInt("precio"));
                
            }
        }catch (SQLException ex){
            System.err.println("Error al buscar por id "+ex.getMessage());
        }
        return unrepuesto;
    }
}
    
  