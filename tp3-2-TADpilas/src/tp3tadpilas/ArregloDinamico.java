/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3tadpilas;

/**
 *
 * @author adam
 * @param <T>
 */
public class ArregloDinamico<T> {
    private Object[] arreglo;
    private int size;

    public ArregloDinamico() {
        this.arreglo = new Object[8];
        this.size = 0;
    }

    public ArregloDinamico(int capacidadInicial) {
        this.arreglo = new Object[capacidadInicial];
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public void agregar(T elemento) {
        asegurarDeCapacidad();
        arreglo[size++] = elemento;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Indice: " + index + ", Tamanio: " + size);
        }
        return (T) arreglo[index];
    }

    private void asegurarDeCapacidad() {
        if (size == arreglo.length) {
            int capacidadNueva = arreglo.length * 2;
            Object[] arregloNuevo = new Object[capacidadNueva];
            System.arraycopy(arreglo, 0, arregloNuevo, 0, arreglo.length);
            arreglo = arregloNuevo;
        }
    }

}

