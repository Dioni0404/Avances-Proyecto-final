package tda1;

/**
 *
 * @author alexander
 */
public class Lista<T> {
    private Nodo<T> cabeza;
    
    public boolean esVacia(){
        if(cabeza == null){
            return true;
        }else{
            return false;
        }
    }
    
    public void agregarElemento(T elem){
        Nodo<T> nuevoNodo = new Nodo(elem,null);
        if(esVacia() == true){
            cabeza = nuevoNodo;
        }else{
            Nodo<T> aux = cabeza;
            while(aux.getSgteNodo()!=null){
                aux=aux.getSgteNodo();
            }
            aux.setSgteNodo(nuevoNodo);
        }
    }
    
    public void mostrar(){
        Nodo<T> aux = cabeza;
        while(aux != null){
            System.out.println(aux.getElemento());
            aux = aux.getSgteNodo();
        }
    }
    
    public int longitud(){
        int num = 0;
        Nodo<T> aux = cabeza;
        while(aux != null){
            aux = aux.getSgteNodo();
            num++;
        }
        return num;
    }
    
    public T iesimo(int pos) {
        T elemento = null; // -1 significa que el elemento no existe
        if (pos >= 1 && pos <= longitud()) {
            int i = 1;
            Nodo<T> aux = cabeza;
            while (i < pos) {
                aux = aux.getSgteNodo();
                i++;
            }
            elemento = aux.getElemento();
            return elemento;
        }
        return elemento;
    }
}
