/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Proveedor;
import java.awt.event.ActionEvent;

/**
 *
 * @author JHONNY
 */
public class ControladorProveedor {

        public void controlarAccion(ActionEvent evento, Proveedor unproveedor){
        String opcion = evento.getActionCommand().toLowerCase();
        System.out.println("antes del switch "+opcion);
        System.out.println("unproveedor "+unproveedor);
        switch(opcion){
            case "insertar" -> {
                System.out.println("insertar");
                unproveedor.insertar();
                }
            
            case "modificar" -> {
                System.out.println("modificar");
                unproveedor.modificar();
                }
            case "eliminar" -> {
                System.out.println("eliminar");
                unproveedor.eliminar(); 
                }
           
        }    
    }
    
}
