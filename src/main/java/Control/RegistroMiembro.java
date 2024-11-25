/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Modelo.*;

/**
 *
 * @author vleos
 */
public class RegistroMiembro {
    private final static int MAX = 1000;
    private Miembro[] array;
    private int num;

    public RegistroMiembro() {
        this.array = new Miembro[MAX];
        num = 0;
    }

    public boolean agregar(Miembro miembro) {
        if (num < MAX) {
            array[num] = miembro;
            num++;
            return true;
        } else {
            return false;
        }
    }

    public Miembro[] getListaMiembros() {
        Miembro[] listaMiembros = new Miembro[num];
        int j = 0;

        for (int i = 0; i < num; i++) {
            listaMiembros[j] = array[i];
            j++;
        }

        return listaMiembros;
    }
    
    public void BorrarIndice(int index){
        for (int i = 0; i < num; i++) {
            if(i >= index){
            array[i]= array[i+1];
            }
        }
        num--;
        
    }
    
    
    
    public boolean ActualizarIndice(Miembro miembro,int index){

            array[index] = miembro;
            return true;
        
    }

    public int getNum() {
        return num;
    }
    
}
