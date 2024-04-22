/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author JHONNY
 */
public class Cliente {
    
    private int idCliente;
    private String nombre;
    private String documento;
    private String telefono;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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
        return nombre;
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
        final Cliente other = (Cliente) obj;
        return this.idCliente == other.idCliente;
    }
    
    public Iterator<Cliente> listar(){
        ArrayList<Cliente> losClientes = new ArrayList<>();
        try{
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("SELECT * FROM "+this.getClass().getSimpleName());
            ResultSet rs = sql.executeQuery();
            Cliente unCliente;
            while (rs.next()){
                unCliente = new Cliente();
                unCliente.setIdCliente( rs.getInt("idCliente"));
                unCliente.setNombre(    rs.getString("nombre"));
                unCliente.setDocumento( rs.getString("documento"));
                unCliente.setTelefono( rs.getString("telefono"));
                losClientes.add(unCliente);
            }
        }catch (SQLException ex){
            System.err.println("Error al listar clientes");
        }
        
        if (losClientes.isEmpty()){
            Cliente micli = new Cliente();
            micli.setNombre("No hay clientes");
            losClientes.add(micli);
        }
        return losClientes.iterator();
    }
    
    public void insertar(){
        try{
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("INSERT INTO "
                    +this.getClass().getSimpleName()+" (nombre, documento, telefono) VALUES(?,?,?)");
            sql.setString(1, this.getNombre());
            sql.setString(2, this.getDocumento());
            sql.setString(3, this.getTelefono());
            sql.executeUpdate();
            System.out.println(this.getClass().getSimpleName()+ " insertado corrertamente");
        }catch (SQLException ex){
            System.err.println("Error al insertar "+this.getClass().getSimpleName()+":"+ex.getMessage());
        }
    }
    
    public void modificar(){
        try{
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("UPDATE "+this.getClass().getSimpleName()+
            " SET nombre = ?, documento = ?, telefono = ? WHERE idCliente = ? ");
            sql.setString(1, this.getNombre());
            sql.setString(2, this.getDocumento());
            sql.setString(3, this.getTelefono());
            sql.setInt(4, this.getIdCliente());
            sql.executeUpdate();
            System.out.println(this.getClass().getSimpleName()+ " modificado correctamente");
        }catch (SQLException ex){
            System.err.println("Error al modificar "+ this.getClass().getSimpleName()+": "+ex.getMessage());
        }
    }
    
    public void eliminar(){
        try{
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("DELETE FROM "
                    +this.getClass().getSimpleName()+" WHERE idCliente = ?");
            sql.setInt(1, this.getIdCliente());
            sql.executeUpdate();
            System.out.println(this.getClass().getSimpleName()+ " Eliminado correctamente");
        }catch (SQLException ex){
            System.err.println("Error al eliminar "+this.getClass().getSimpleName()+": "+ex.getMessage());
        }
    }
    
    public Iterator<Cliente> buscar(String busqueda){
        ArrayList<Cliente> losClientes = new ArrayList<>();
        try{
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("SELECT * FROM "+
                    this.getClass().getSimpleName()+" WHERE nombre LIKE ? OR documento LIKE ? OR telefono LIKE ?");
            sql.setString(1,"%"+busqueda+"%");
            sql.setString(2,"%"+busqueda+"%");
            sql.setString(3,"%"+busqueda+"%");
            ResultSet rs = sql.executeQuery();
            Cliente unCliente;
            while (rs.next()){
                unCliente = new Cliente();
                unCliente.setIdCliente( rs.getInt("idCliente"));
                unCliente.setNombre(    rs.getString("nombre"));
                unCliente.setDocumento( rs.getString("documento"));
                unCliente.setTelefono(  rs.getString("telefono"));
                losClientes.add(unCliente);
            }
        }catch (SQLException ex){
            System.err.println("Error al buscar "+this.getClass().getSimpleName()+":"+ex.getMessage());
        }
        return losClientes.iterator();
    }
    public Cliente buscarPorId(int elId){
        Cliente unCliente  = new Cliente();
        unCliente.setNombre("cliente no existe");
        try{
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("SELECT * FROM "
                    +this.getClass().getSimpleName()+" WHERE idCliente = ?");
            sql.setInt(1, elId);
            ResultSet rs  = sql.executeQuery();
            while (rs.next()){
                unCliente.setIdCliente(  rs.getInt("idCliente"));
                unCliente.setNombre(     rs.getString("nombre"));
                unCliente.setDocumento(  rs.getString("documento"));
                unCliente.setTelefono(   rs.getString("telefono"));
            }
        }catch (SQLException ex){
            System.out.println("Error al buscar por id "+ex.getMessage());
        }
        return unCliente;
    }
}
