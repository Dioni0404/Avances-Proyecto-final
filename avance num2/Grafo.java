package tda;

public class Grafo {
    
    private Double[][] matriz;
    private int nroVertices;
    private boolean dirigido;
    private final static int MAX=10;
    public Grafo(int nroVertices, boolean dirigido){
        // inicializar
        this.nroVertices = nroVertices;
        this.dirigido = dirigido;
        // crear la matriz de 10 x 10
        matriz = new Double[MAX][MAX];
        // llenar la matriz con valores Infinito
        for (int i = 0; i < MAX; i++) { // por filas
            for (int j = 0; j < MAX; j++) {// columnas
                matriz[i][j] = Double.POSITIVE_INFINITY;
            }
        }
    }
    /*
    * Agregar arco o arista
    */
    public void agregarArco(int ini, int fin, double peso){
        matriz[ini][fin]=peso;
        if (!dirigido){
            matriz[fin][ini]=peso;
        }
    }
    public void mostrarMatriz(){
        for (int i = 0; i < nroVertices; i++) { // por filas
            for (int j = 0; j < nroVertices; j++) {// columnas
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println(); // saltar a la siguiente fila
        }
    }
    
    public void eliminarArco(int i, int j){
        if(matriz[i][j] != Double.POSITIVE_INFINITY){
            //Si es dirigido
            matriz[i][j] = Double.POSITIVE_INFINITY;
            if(!dirigido){
                matriz[j][i] = Double.POSITIVE_INFINITY;
            }
        }else{
            throw new RuntimeException("No es posible eliminar un arco que no exista");
        }   
    }
    
    public int gradoSalida(int vertice){
        if(dirigido){
            int temp = 0;
            //Columnas
            for (int i = 0; i < nroVertices; i++) {
                if (matriz[i][vertice]!=Double.POSITIVE_INFINITY) {
                    temp++;
                }
            }
            return temp;
        }else{
            throw new RuntimeException("No es posible hallar el grado de entero");
        }   
    }
    
    public int grado(int vertice){
        int numIncidencias = 0;
        if(!dirigido){
            for (int i = 0; i < nroVertices; i++) {
                if(matriz[i][vertice]!=Double.POSITIVE_INFINITY){
                    numIncidencias++;
                }
                return numIncidencias;
            }
            
            
        }else{
            throw new RuntimeException("No es posible hallar el grado de entero");
        }
        
        
        
        return 0;
    }
    
    public int [] adyacentes(int vertice){
        //Conocer la cantidad de vertices adyacentes
        int numadyacentes;
        if(!dirigido){
            numadyacentes = grado(vertice); //Cantidad de incidencias
            
            
        }else{
            numadyacentes = gradoSalida(vertice);
        }

        int [] verticesAdyacentes = new int [numadyacentes];
        int j = 0;
        for (int i = 0; i < nroVertices; i++) {
            if(matriz[vertice][i]!= Double.POSITIVE_INFINITY){
                verticesAdyacentes[j] = i;
                j++;
            } 
        }
        return verticesAdyacentes;
        

    }
}
