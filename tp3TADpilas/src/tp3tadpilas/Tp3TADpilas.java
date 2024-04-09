/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3tadpilas;
// hola soy nico
// Sumamos al companiero Fabricio Zalazar: FabricioZalazar
// 
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
public class Tp3TADpilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila p1 = new Pila();
        
        for(int i = 0; i<=4;i++){
        p1.push(i);
            System.out.println(p1);
        }
        p1.push(54);
        System.out.println(p1);
        System.out.println(p1.verElemento());
        System.out.println(p1.pop()); 
        System.out.println(p1);
        System.out.println(p1.pilaVacia());
        System.out.println(p1.PilaLlena());
        
        
    }
    
}
