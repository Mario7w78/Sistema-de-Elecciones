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
public class RegistroMesa {
    private final static int MAX = 1000;
    private Mesa[] array;
    private int num;

    public RegistroMesa() {
        this.array = new Mesa[MAX];
        num = 0;
    }

    

    public boolean agregar(Mesa mesa) {
        if (num < MAX) {
            array[num] = mesa;
            num++;
            return true;
        } else {
            return false;
        }
    }

    public Mesa[] getListaMesas() {
        Mesa[] listamesas = new Mesa[num];
        int j = 0;

        for (int i = 0; i < num; i++) {
            listamesas[j] = array[i];
            j++;
        }

        return listamesas;
    }
    
    public void BorrarIndice(int index){
        for (int i = 0; i < num; i++) {
            if(i >= index){
            array[i]= array[i+1];
            }
        }
        num--;
        
    }
    
    
    
    public boolean ActualizarIndice(Mesa mesa,int index){

            array[index] = mesa;
            return true;
        
    }

    public int getNum() {
        return num;
    }
}
