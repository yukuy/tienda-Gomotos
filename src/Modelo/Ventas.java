
package Modelo;

import Modelo.ConexionBD;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author JHONNY
 */
public class Ventas {
    
    //ATRIVUTOS
    private int idFacturas;
    private int idCliente;
    private String fecha;
    private int totalPagar;

    public Ventas(int idCliente, String fecha, int totalPagar) {
        this.idCliente = idCliente;
        this.fecha = fecha;
        this.totalPagar = totalPagar;
    }
 
    
    //GET AND SET   

    public int getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(int totalPagar) {
        this.totalPagar = totalPagar;
    }

    
    public int getIdFacturas() {
        return idFacturas;
    }

    public void setIdFacturas(int idFacturas) {
        this.idFacturas = idFacturas;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    //TO STRING

        @Override
        public String toString() {
            return idFacturas+"";
        }


        
    //metodo para listar
    public Iterator<Ventas> listar(){
        List<Ventas> facturas = new ArrayList<>();
        try {
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("SELECT * FROM factura where idFactura = ?");
            ResultSet rs = sql.executeQuery();
           Ventas miFac;
           if(rs.next()){
               miFac = new Ventas(idCliente, fecha, totalPagar);
               miFac.setIdFacturas(rs.getInt("idFactura"));
               miFac.setIdCliente(rs.getInt("idCliente"));
               miFac.setFecha(rs.getString("fecha"));
               miFac.setTotalPagar(rs.getInt("totalPagar"));
           }else{
               System.out.println("No se encontraron facturas con el id especificado.");
               
           }
        } catch (SQLException e) {
            System.out.println("Error al listar facturas "+e.toString());
        }
        
        return facturas.iterator();
        
     }
    
    //metodo insertar factura
    public int insertar(){
        try{
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("INSERT INTO factura VALUES(null,?,?,?)",Statement.RETURN_GENERATED_KEYS);
            sql.setInt(1, this.getIdCliente());        
            sql.setString(2, this.getFecha());
            sql.setInt(3, this.getTotalPagar());
            System.out.println("sql "+sql);
            sql.executeUpdate();
            System.out.println(this.getClass().getSimpleName()+ " Insertado correctamente");
            ResultSet generatedKeys = sql.getGeneratedKeys();
            if (generatedKeys.next()) {
                System.out.println(generatedKeys.getInt(1));
                return generatedKeys.getInt(1);
            }
        }catch (SQLException ex){
            System.err.println("Error al insertar "+this.getClass().getSimpleName()+":"+ex.getMessage());
        }
        return 0;
    }

   
}
