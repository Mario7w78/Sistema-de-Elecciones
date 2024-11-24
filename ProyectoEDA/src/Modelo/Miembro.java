/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author vleos
 */
public class Miembro {
    private String nombre;
    private String apellido;
    private String tipo;

    public Miembro(String nombre, String apellido, String tipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTipo() {
        return tipo;
    }
    
    public String getFullName() {
    return this.nombre + " " + this.apellido;
    }
    
}
