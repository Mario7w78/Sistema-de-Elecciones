/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author vleos
 */
public class Candidato {
    private String nombre;
    private String Apellido;
    private int DNI;
    private String PartidoPolitico;
    private int numVotos;

    public Candidato(String nombre, String Apellido, int DNI, String PartidoPolitico) {
        this.numVotos = 0;
        
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.DNI = DNI;
        this.PartidoPolitico = PartidoPolitico;
    }

    public String getNombre() {
        return nombre;
    }

    public void addVote(){
        numVotos++;
    }
    
   public String getFullName() {
    return this.nombre + " " + this.Apellido;
    }
    
    public String getApellido() {
        return Apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public String getPartidoPolitico() {
        return PartidoPolitico;
    }

   


    
    
}
