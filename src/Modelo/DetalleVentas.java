
package Modelo;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.sql.ResultSet;


public class DetalleVentas {
    
   
    
    private  int idRepuestos;
    private int idFacturas;
    private int cantidad;
    private double sutTotal;
    private double precioU;
   
    //esta de mas
    private String nombre;
    
     // constructor sobrecargado

    public DetalleVentas(int idRepuestos, int idFactura, int cantidad, double sutTotal, double precioU, String nombre) {
        this.idRepuestos = idRepuestos;
        this.idFacturas = idFactura;
        this.cantidad = cantidad;
        this.sutTotal = sutTotal;
        this.precioU = precioU;
        this.nombre = nombre;
    }
    
    public double getPrecioU() {
        return precioU;
    }

    //set an get
    public void setPrecioU(double precioU) {    
        this.precioU = precioU;
    }

    public int getIdRepuestos() {
        return idRepuestos;
    }

    public void setIdRepuestos(int idRepuestos) {
        this.idRepuestos = idRepuestos;
    }

    public int getIdFactura() {
        return idFacturas;
    }

    public void setIdFactura(int idFactura) {
        this.idFacturas = idFactura;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSutTotal() {
        return sutTotal;
    }

    public void setSutTotal(double sutTotal) {
        this.sutTotal = sutTotal;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "DetalleFactura{" + "idRepuestos=" + idRepuestos + ", idFactura=" + idFacturas + ", cantidad=" + cantidad + ", sutTotal=" + sutTotal + ",  nombre=" + nombre + '}';
    }
    
    
    
    //metodo para insertar los detalles de la factura
    public void insertar(){
        try{
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("INSERT INTO Detalle_factura VALUES(?,?,?,?,?,?)");
            sql.setInt(1, this.getIdRepuestos()); // Corregido de 0 a 1
            sql.setInt(2, this.getIdFactura());
            sql.setInt(3, this.getCantidad());
            sql.setDouble(4, this.getSutTotal());
            sql.setDouble(5, this.getPrecioU());
            sql.setString(6, this.getNombre());
            sql.executeUpdate();
            System.out.println(this.getClass().getSimpleName() + " Insertado correctamente");
        } catch (SQLException ex) {
            System.err.println("Error al insertar " + this.getClass().getSimpleName() + ":" + ex.getMessage());
        }
    }
}
