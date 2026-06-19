/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciopagina406;

import javax.swing.JOptionPane;


/**
 *
 * @author Samuel Lopez y James Gutierrez
 */
public class Vendedor {
    public String nombre; 
    public String apellido; 
    public int edad; 

Vendedor(String nombre, String apellidos) {
    this.nombre = nombre;
    this.apellido = apellido;
}  

void imprimir() {
    
    JOptionPane.showMessageDialog(null, "nombre","Nombre del vendedor", JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null, "apellido","Apellido del vendedor", JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null, "edad","Edad del vendedor", JOptionPane.INFORMATION_MESSAGE);
    }

public int verificarEdad(int edad) {
    if (edad < 18) {
        JOptionPane.showMessageDialog(null,
            "El vendedor debe ser mayor de 18 años.", "Error de Validación de Edad",
            JOptionPane.WARNING_MESSAGE);
        return -1; 
    }

        
    else if (edad >= 18 && edad < 120) {
        this.edad = edad;
        JOptionPane.showMessageDialog(null, "Edad registrada con éxito: " + edad);
        return edad;
    }
    
    else {
        JOptionPane.showMessageDialog(null,
            "La edad no puede ser negativa ni mayor a 120",
            "Error de Rango",
            JOptionPane.ERROR_MESSAGE);
        return -1;
    }
        
    }
}


