/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3tadpilas;

import java.util.ArrayList;
//import java.util.Stack;

/**
Ejercicio 1 Implemente la clase pila, se trata de una pila de enteros, 
la misma debe contener

los métodos: push(), pop(), pilaVacia(), PilaLlena(), verElemento()
Cree un objeto de la clase y verifique sus métodos.

Ejercicio 2

Agregue a la clase un método invierteSimple que usando la pila original 
y 2 pilas vacía deje en la pila original los elementos invertidos

Agregue a la clase un método invierteEficiente que usando la pila 
original y 1 pila vacía y una variable deje en la pila original los 
elementos invertidos
 */
public class Pila {
    private Object[] pila;
    protected int size;
    private int cursor;

    public Pila(int size) {
        this.pila = new Object[size];
        this.size = size;
        this.cursor = -1;
    }
    
    public Pila(int size, Object objeto[]){
        this.pila = objeto;
        this.size = objeto.length;
        this.cursor = -1;
    }
    
    //    private Stack<Integer> test;
    
    public void push(Object objeto){
        if(!PilaLlena()){
            cursor++;
            pila[cursor] = objeto;
//            pila.add(entero);
        }else{System.out.println("La pila esta llena y no se puede agregar mas elementos");}
    }
    public Object pop(){
        if(!pilaVacia()){
            Object retorno = verElemento();
            pila[cursor] = null;
            cursor--;
            return retorno;
        }
        System.out.println("La pila esta vacia y no se puede quitar mas elementos");
        return null;
    }
    
    public boolean pilaVacia(){
        return cursor < 0;
    }
    
    public boolean PilaLlena(){
        return cursor == size -1;
    }
    
    public Object verElemento(){
        if(!pilaVacia()){
            System.out.println(pila[cursor]);
            return pila[cursor];
        }
        
        System.out.println("La pila esta vacia y no se puede quitar mas elementos");
        return null;
    }
    
    public Pila invierteEficiente(){
        Pila pilaAux = new Pila(this.size);
        for (int i = 0; i < this.size; i++) {
            pilaAux.push(pop());
        }
        return pilaAux;
    }
    
    public void invierteSimple(){
        Pila pilaAux1 = new Pila(this.size);
        Pila pilaAux2 = new Pila(this.size);
        for(int i = 0; i < this.size; i++){
            pilaAux1.push(pop());
        }
        for(int i=0; i< this.size; i++){
            pilaAux2.push(pilaAux1.pop());
        }
        for(int i=0; i< this.size; i++){
            push(pilaAux2.pop());
        }
    }

    @Override
    public String toString() {
        String retorno = "";
        if(!pilaVacia()){
            int i = 0;
            while(i < size && pila[i] != null){
                retorno += pila[i].toString();
                retorno += ", ";
                i++;
            }
        return "Pila {" + retorno + '}';
        }
        return "";
    }
    

    
}
