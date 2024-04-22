/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.awt.event.ActionEvent;
import Modelo.Cliente;

/**
 *
 * @author JHONNY
 */
public class ControladorCliente {
    
    public void controlarAccion(ActionEvent evento, Cliente unCliente){
        String accion=evento.getActionCommand().toLowerCase();
        System.out.println("antes del switch "+accion);
        switch(accion){
            case "insertar" -> {
                System.out.println("insertar");
                unCliente.insertar();
                break;
            }
            
            case "modificar" -> {
                System.out.println("modificar");
                unCliente.modificar();
                break;
            }
            
            case "eliminar" -> {
                System.out.println("eliminar");
                unCliente.eliminar();
                break;
            }
        }
    }
    
}
