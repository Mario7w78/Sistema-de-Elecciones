/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Mario
 */
public class ConteoVoto {
    private String nombreCandidato;
    private int cantidadVotos;
    
    public ConteoVoto(String nombreCandidato) {
        this.nombreCandidato = nombreCandidato;
        this.cantidadVotos = 1;
    }
    
    public String getNombreCandidato() {
        return nombreCandidato;
    }
    
    public int getCantidadVotos() {
        return cantidadVotos;
    }
    
    public void incrementarVotos() {
        this.cantidadVotos++;
    }
}
