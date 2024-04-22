/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import Modelo.Ventas;
import java.awt.event.ActionEvent;

/**
 *
 * @author JHONNY
 */
public class ControladorFactura {
    public void controlarAccion(ActionEvent evento, Ventas unFacturas){
        String accion=evento.getActionCommand().toLowerCase();
        System.out.println("antes del switch "+accion);
        switch(accion){
            case "Nueva factura" -> {
                System.out.println("insertar");
                unFacturas.insertar();
                break;
            }
        }
    }
}
