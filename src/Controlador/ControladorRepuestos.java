/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Repuestos;
import java.awt.event.ActionEvent;

/**
 *
 * @author JHONNY
 */
public class ControladorRepuestos {
    
    public void controlarAccion(ActionEvent evento, Repuestos unrep){
    String opcion = evento.getActionCommand().toLowerCase();
    System.out.println("antes del switch "+opcion);
    switch(opcion){
            case "insertar" -> {
                System.out.println("insertar");
                unrep.insertar();
            }
            
            case "modificar" -> {
                System.out.println("modificar");
                unrep.modificar();
            }
            
            case "eliminar" -> {
                System.out.println("eliminar");
                unrep.eliminar();
            }
        }            
    }            
}
