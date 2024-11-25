/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TDA;

import Modelo.Voto;

/**
 *
 * @author Mario
 */
public class Stack {
    
    private Voto[] S;
    private int size, top;

    public Stack(int size) {
        this.size = size;
        this.S = new Voto[size];
        top = -1;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
    public void push(Voto value){
        
        if (isEmpty()) {
            top = 0;
        }else if (isFull()) {
            System.out.println("Full Stack");
        }else{
            top++;
        }
        S[top] = value;
        
    }
    
    
    public Voto pop(){
        Voto popValue = null;
        if (isEmpty()) {
            System.out.println("Empty Stack");
        }else{
            popValue = S[top];
            top--;
        }
        
        return popValue;
    }
    
    public boolean isEmpty(){
        
        return top == -1;
        
    }
    
    
    public boolean isFull(){
        
        return top == size-1;
        
    }

    public Voto[] getS() {
        return S;
    }

    public void setS(Voto[] S) {
        this.S = S;
    }
    
}
