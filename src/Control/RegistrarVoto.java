/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;


import Modelo.Voto;
import TDA.Stack;

/**
 *
 * @author Mario
 */
public class RegistrarVoto {
    private Stack Voto;
    private RegistroEleccion objregistroeleccion;
    

    public RegistrarVoto(RegistroEleccion objregistroeleccion) {
        this.Voto = new Stack(1000);
        this.objregistroeleccion = objregistroeleccion;
        
    }
    
    public boolean Votar(Voto votante) {
    try {
        Voto.push(votante);
        
        return true; 
    } catch (Exception e) {
        return false; 
        }
    }
    
    
    
   
    
    
}
