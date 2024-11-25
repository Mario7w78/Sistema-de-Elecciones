/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import TDA.Stack;
import java.util.Arrays;

/**
 *
 * @author vleos
 */
public class Eleccion {
    private String fecha;
    private String tipo;
    private Candidato[] candidatos;
    private Mesa[] mesas;
    
    private int num, num2,num3;
    private final static int MAX = 1000;

  
    public Eleccion(String fecha, String tipo) {
        this.fecha = fecha;
        this.tipo = tipo;
        this.candidatos = new Candidato[MAX];
        
        this.mesas = new Mesa[MAX];
        this.num = 0;
        this.num2 = 0;
    }

     public void setCandidatos(Candidato[] candidatos) {
        this.candidatos = candidatos;
        // Contar los candidatos no nulos para establecer num
        int count = 0;
        for (Candidato c : candidatos) {
            if (c != null) count++;
        }
        this.num = count;
    }
    
    public void setMesa(Mesa[] mesa) {
        this.mesas = mesa;
    }
    
     public String getFecha() {
        return fecha;
    }

    public String getTipo() {
        return tipo;
    }

   public void agregarCandidato(Candidato candidato) {
        if (num < MAX) {
            
            candidatos[num] = candidato;
            num++;
        }
    }
    
   public void agregarMesa(Mesa mesa) {
    if (num2<MAX) {
       mesas[num2] = mesa;
       num2++;
    }
    
} 

    public int getNum2() {
        return num2;
    }
    
    
    
    
    
    public Candidato[] getCandidatos() {
        
        Candidato[] resultado = new Candidato[num];
        int j = 0;
        
        for (int i = 0; i < candidatos.length && j < num; i++) {
            if (candidatos[i] != null) {
                resultado[j] = candidatos[i];
                j++;
            }
        }
        return resultado;
    }  
    
    
    public Mesa[] getMesas() {
    if (mesas == null || num2 == 0) {
        return new Mesa[0];
    }
    
    Mesa[] listamesas = new Mesa[num2];
    
    int j = 0;

    for (int i = 0; i < num2; i++) {
        if (mesas[i] != null) {
            listamesas[j] = mesas[i];
            j++;
        }
    }
    
    return Arrays.copyOf(listamesas, j);
}
    
    
    public void decrementarNumCandidatos() {
        this.num--;
    }
    
    public void decrementarNumMesas() {
        this.num2--;
    }
    public void resetCandidatos(Candidato[] nuevos, int nuevoNum) {
        this.candidatos = nuevos;
        this.num = nuevoNum;
    }
    public void resetMesas(Mesa[] nuevos, int nuevoNum) {
        this.mesas = nuevos;
        this.num2 = nuevoNum;
    }

    public void setMesas(Mesa[] mesas) {
        this.mesas = mesas;
    }

    

    
   
    
}
