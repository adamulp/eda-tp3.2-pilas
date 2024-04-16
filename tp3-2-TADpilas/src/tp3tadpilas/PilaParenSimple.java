/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3tadpilas;

import java.util.Objects;

/**
 *
 * @author adam
 */
public class PilaParenSimple extends Pila {
    private Boolean esEquilibrada;
    private static char[][] parentesis = {{'(',')'},{'{','}'},{'[',']'},{'<','>'}};
//    private static char[][] parenPila = PilaParen.parentesis;
    
    public PilaParenSimple(int size) {
        super(size);
    }

    public PilaParenSimple(int size, Object[] objeto) {
        super(size, objeto);
    }
    
    public PilaParenSimple(String cadena){
        super(calcularSize(cadena));
        if(cadena == null || "".equals(cadena) || this.size < 1){
            esEquilibrada = null;
        }
        for(char car: cadena.toCharArray()){
            if(esParenApertura(car)){
                this.push(car);
            }
            if(esParenCierre(car)){
                if(pilaVacia()){
                    esEquilibrada = false;
                    return;
                }
                if(car != getParenCierre((char)pop())){
                    esEquilibrada = false;
                    return;
                }
            }
        }
        if(pilaVacia()){
            esEquilibrada = true;
        }
    }

    public Boolean getEsEquilibrada() {
        return esEquilibrada;
    }
    
    
    
    public static Character getParenApertura(char parenCierre){
        int i = 0;
        for(char[] paren: parentesis){
            if(parenCierre == paren[1]){
                return parentesis[0][i];
            }
            i++;
        }
        return null;
    }
    
    public static Character getParenCierre(char parenApertura){
        int i = 0;
        for(char[] paren: parentesis){
            if(parenApertura == paren[0]){
                return parentesis[1][i];
            }
            i++;
        }
        return null;
    }
    
    public static boolean esParenApertura(char car){
        for (char[] paren : parentesis) {
            if (car == paren[0]) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean esParenCierre(char car){
        for (char[] paren : parentesis) {
            if (car == paren[1]) {
                return true;
            }
        }
        return false;
    }
    
    public static int contarParenApertura(String cadena){
        int cantidadParen=0;
        char[] charCadena = cadena.toCharArray();
        for(char car:charCadena){
            if(esParenApertura(car)){
                cantidadParen++;
            }
        }
        return cantidadParen;
    }
    
    public static int contarParenCierre(String cadena){
        int cantidadParen=0;
        char[] charCadena = cadena.toCharArray();
        for(char car:charCadena){
            if(esParenCierre(car)){
                cantidadParen++;
            }
        }
        return cantidadParen;
    }
    
    public static int calcularSize(String cadena){
        int cantidadParenApertura = contarParenApertura(cadena);
        int cantidadParenCierre = contarParenCierre(cadena);
        if(cantidadParenApertura > cantidadParenCierre){
            return 2 * cantidadParenApertura;
        }
        return 2 * cantidadParenCierre;
    }
}
