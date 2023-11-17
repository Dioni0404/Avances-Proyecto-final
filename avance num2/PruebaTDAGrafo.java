package prueba;
import java.util.Arrays;
import tda.*;
public class PruebaTDAGrafo {
    public static void main(String[] args) {
        // Crear un Grafo
        Grafo g = new Grafo(5,false);
        g.mostrarMatriz();
        g.agregarArco(0, 1, -2);
        g.agregarArco(0, 3, 7);
        g.agregarArco(0, 4, 6);
        g.agregarArco(1, 2, 6.5);
        g.agregarArco(2, 3, 5.5);
        g.agregarArco(3, 4, 5);
        System.out.println("Eliminar un arco: ");
        g.eliminarArco(3, 4);
        System.out.println("Matriz actualiza");
        g.mostrarMatriz();
        
        System.out.println("Vertices Adyacente de 0"+g.grado(0));
        System.out.println("Vertice adyacente del 0: ");
        int[] arr = g.adyacentes(0);
        System.out.println(Arrays.toString(arr));
    }
    
}
