/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Modelo.Candidato;

/**
 *
 * @author vleos
 */
public class RegistroCandidato {
    private final static int MAX = 1000;
    private Candidato[] array;
    private int num;

    public RegistroCandidato() {
        this.array = new Candidato[MAX];
        num = 0;
    }

    public boolean agregar(Candidato candidato) {
        if (num < MAX) {
            array[num] = candidato;
            num++;
            return true;
        } else {
            return false;
        }
    }

    public Candidato[] getListaCandidatos() {
        Candidato[] listaCandidatos = new Candidato[num];
        int j = 0;

        for (int i = 0; i < num; i++) {
            listaCandidatos[j] = array[i];
            j++;
        }

        return listaCandidatos;
    }
    
    public void BorrarIndice(int index){
        for (int i = 0; i < num; i++) {
            
            if(i >= index){
            array[i]= array[i+1];
            
            }
        }
        num--;
        
    }
    
    
    public boolean ActualizarIndice(Candidato candidato,int index){

            array[index] = candidato;
            return true;
        
    }

    
    public int getNum() {
        return num;
    }
    
    
}
