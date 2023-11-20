/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;
import Contenido.*;
import tda1.*;

/**
 *
 * @author alexander
 */
public class pruebaHistorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Historial<String> hist1 = new Historial<>();
        Fecha fecha = new Fecha(12,12,2023);
        NodoHistorial<String> nodo1 = new NodoHistorial<>("doc001","abcd","Finalizado","user10",fecha.toString(),"emp5","Sistemas", null);
        NodoHistorial<String> nodo2 = new NodoHistorial<>("doc002","abcd","Finalizado","user12",fecha.toString(),"emp5","Sistemas", null);
        hist1.agregar(nodo1);
        hist1.agregar(nodo2);
        hist1.mostrar();
        hist1.mostrardocumentos("user10");
        hist1.mostrarhistorialdeldocumento("doc001");
        System.out.println("Cant. elementos hist1 = " + hist1.longitud() + "\n");
        
        NodoHistorial<String> nodoPrueba = hist1.obtenerNodo(1);
        String codUser = nodoPrueba.getCodUSER();
        System.out.println(codUser);
        System.out.println("");
        
        Historial<String> hist2 = hist1.getListaEnlazada(hist1);
        hist2.mostrar();
    }
    
}
