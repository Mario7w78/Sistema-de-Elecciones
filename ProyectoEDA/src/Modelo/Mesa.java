/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import TDA.Stack;

/**
 *
 * @author vleos
 */
public class Mesa {
    private String ubicacion;
    private String nmesa;
    private Miembro[] miembros;
    private Stack votos;
    private ActaElectoral acta;
    private int num;
    private final static int MAX = 1000;

    public Mesa(String ubicacion, String nmesa) {
        this.ubicacion = ubicacion;
        this.nmesa = nmesa;
        this.miembros = new Miembro[MAX];
        this.num = 0;
        this.votos = new Stack(MAX);
    }
    
    public void agregarMiembro(Miembro miembro) {
    if (miembros == null || num >= miembros.length) {
       
        Miembro[] nuevoArray = new Miembro[MAX];
        
        if (miembros != null) {
            
            System.arraycopy(miembros, 0, nuevoArray, 0, miembros.length);
        }
        
        miembros = nuevoArray;
    }
    
    miembros[num] = miembro;
    num++;
}

    public String getUbicacion() {
        return ubicacion;
    }

    public String getNmesa() {
        return nmesa;
    }

    public int getNum() {
        return num;
    }

    public Miembro[] getMiembros() {
        return miembros;
    }

    public static int getMAX() {
        return MAX;
    }

    public void setMiembros(Miembro[] miembros) {
        this.miembros = miembros;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    public void resetMiembro(Miembro[] nuevos, int nuevoNum) {
        this.miembros = nuevos;
        this.num = nuevoNum;
    }
    
    
    public void agregarVoto(Voto voto) {
        if (votos != null) {
            votos.push(voto);
        }
    }
    
    public Stack getVotos() {
        return votos;
    }

    public ActaElectoral getActa() {
        return acta;
    }

    public void setActa(ActaElectoral acta) {
        this.acta = acta;
    }

    
    
    
}
