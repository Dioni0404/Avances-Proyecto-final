package prueba;
import tda1.*;

/**
 *
 * @author alexander
 */
public class pruebaLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista<Integer> L1 = new Lista<>();
        L1.agregarElemento(1);
        L1.agregarElemento(2);
        L1.agregarElemento(3);
        L1.agregarElemento(56);
        L1.agregarElemento(56);
        L1.mostrar();
        System.out.println("\nNúm. de elementos: " + L1.longitud());
        System.out.println(L1.iesimo(2));
    }
    
}
