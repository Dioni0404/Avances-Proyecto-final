package tda1;
import java.util.LinkedList;
import tda1.*;

public class Cola<T> {

    // Atributos

    private Nodo<T> frente;
    private Nodo<T> ultimo;
    private LinkedList<T> elementos = new LinkedList<>();

    // Constructores

    public Cola() {
        frente = null;
        ultimo = null;
    }

    // Si la cola esta vacia

    public boolean esVacia() {
        if (frente == null) {
            return true;
        } else {
            return false;
        }
    }

    // encolar: agregar un nuevo elemento a al final de la cola

    public void encolar(T pElemento) {
        if (esVacia() == true) {
            Nodo<T> nuevoNodo = new Nodo(pElemento, null);
            frente = nuevoNodo;
            ultimo = nuevoNodo;
        } else { // la cola no esta vacia
            Nodo<T> nuevoNodo = new Nodo(pElemento, null);
            ultimo.setSgteNodo(nuevoNodo);
            ultimo = nuevoNodo;

        }
    }

    // desencolar: eliminar el elemento que esta al frente de la cola
    // nos devuelve el elemento eliminado

    public T desencolar() {
        if (esVacia() == false) {
            T x = frente.getElemento();
            Nodo<T> aux = frente;
            frente = aux.getSgteNodo();
            return x;
        } else {
            throw new RuntimeException("ERROR: no es posible desencolar");
        }
    }

    public T frente() {
        if (!esVacia()) {
            return frente.getElemento();
        } else {
            throw new RuntimeException("ERROR: no es posible devolver frente");
        }
    }
    
    public int longitud() {
        int i = 0;
        Nodo<T> aux = frente;
        while (aux != null) {
            aux = aux.getSgteNodo();
            i++;
        }
        return i;
    }

    public void mostrar(Cola c){
        Cola caux = new Cola();
        String elemento;
        while(!c.esVacia()){
            elemento = (String) c.desencolar();
            System.out.println(c.desencolar());
            caux.encolar(elemento);
        }
        while(!caux.esVacia()){
            elemento = (String) caux.desencolar();
            c.encolar(elemento);
        }
    
    }
    
    public T iesimo(int posicion) {
        if (posicion < 0 && posicion >= elementos.size()) {
            throw new IllegalArgumentException("Posición fuera de rango");
        }
        // Mover los primeros elementos al final de la cola hasta llegar a la posición deseada
        for (int i = 0; i < posicion; i++) {
            encolar(desencolar());
        }
        // El i-ésimo elemento está ahora al frente de la cola
        T elementoEnPosicion = elementos.peek();
        // Restaurar la cola a su estado original
        encolar(desencolar());

        return elementoEnPosicion;
    }

   
        
        
        
        
}
