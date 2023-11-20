package Contenido;

import java.util.Scanner;
import tda1.*;


public class Historial<T> {

    // Atributos 
    private NodoHistorial<T> cabeza1;
    private NodoHistorial<T> ultimo1;
    
    
    // Metodos
    // Constructor sin parametros
    
    public Historial() {
        cabeza1 = null;
        ultimo1 = null;
    }

    public boolean esVacia1() {
        if (cabeza1 == null) {
            return true;
        } else {
            return false;
        }
    }

    public void agregar(NodoHistorial<T> nuevoNodo) {
        // Caso 1: Cuando la lista esta vacia
        if (esVacia1() == true) {
            cabeza1 = nuevoNodo;
            ultimo1 = nuevoNodo;
        } else { // tiene uno o mas elementos
            // aux haga referencia a lo mismo que esta referenciando cabeza
            ultimo1.setSgteNodo(nuevoNodo);
            ultimo1 = nuevoNodo;
        }
    }

    public void mostrar() {
        NodoHistorial<T> aux = cabeza1;

        while (aux != null) {
            System.out.print(
                    aux.getCodDOC()+"\n"+
                    aux.getAsuntoDOC()+ "\n"+
                    aux.getCodUSER()+"\n"+
                    aux.getFecha()+"\n"+        
                    aux.getEstadoDOC()+"\n"+
                    aux.getDestinoEMP()+"\n"+
                    aux.getDestinoArea()+"\n"+"\n");

            aux = aux.getSgteNodo();  
        }
        System.out.println("");
    }
    
    public void mostrardocumentos(String CodUSER){
        NodoHistorial<T> aux = cabeza1;
       
        while (aux != null){
            
            if(aux.getCodUSER() == CodUSER){
                System.out.println(
                        aux.getCodDOC()+"\n"+
                        aux.getAsuntoDOC()+"\n");
            }
            aux = aux.getSgteNodo();
        }
    }
    
    public void mostrarhistorialdeldocumento(String CodDOC){
        NodoHistorial<T> aux = cabeza1;
        while (aux != null){
            if(aux.getCodDOC() == CodDOC){
                System.out.println(
                aux.getCodDOC()+"\n"+
                aux.getAsuntoDOC()+"\n"+
                aux.getEstadoDOC()+"\n"+
//                aux.getCodUSER()+"\n"+
                aux.getFecha()+"\n"+
                aux.getDestinoEMP()+"\n"+
                aux.getDestinoArea()+"\n"+"\n");
            }
            aux = aux.getSgteNodo();
        }
        
    }
    
    public int longitud(){
        int num = 0;
        NodoHistorial<T> aux = cabeza1;
        while(aux != null){
            aux = aux.getSgteNodo();
            num++;
        }
        return num;
    }
    
    public NodoHistorial<T> obtenerNodo(int posicion) {
        if (cabeza1 == null && posicion < 0) {
            return null;
        }

        NodoHistorial<T> actual = cabeza1;
        int contador = 0;

        while (actual != null) {
            if (contador == posicion) {
                return actual;
            }
            actual = actual.getSgteNodo();
            contador++;
        }

        // Si la posición no existe en la lista
        return null;
    }
    
    public Historial<T> getListaEnlazada(Historial H1){
        return H1;
    }
}
