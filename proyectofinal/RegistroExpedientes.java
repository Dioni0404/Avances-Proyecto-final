/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contenido;
import java.util.Scanner;
import tda1.*;


/**
 *
 * @author user
 */
public class RegistroExpedientes {
    // Atributos 
    private NodoSobrecargado<String> cabeza;
    private NodoSobrecargado<String> ultimo;
    private Historial<String> historial = new Historial();
    

    // Metodos
    // Constructor sin parametros
    public RegistroExpedientes() {
        cabeza = null;
        ultimo = null;
    }

    public boolean esVacia1() {
        if (cabeza == null) {
            return true;
        } else {
            return false;
        }
    }


    public void agregar(Empleado empleado, Expediente expediente) {
        Cola cola = new Cola();
        
        NodoHistorial<String> nodoH = new NodoHistorial<>(expediente.getCodDOC(),expediente.getAsuntoDOC(),expediente.getEstadoDOC(),expediente.getCodUSER(), expediente.getFecha(),
                expediente.getDestinoEMP(), expediente.getDestinoArea(), null);
        historial.agregar(nodoH);
        
        cola.encolar(expediente.getPrioridad());
        cola.encolar(expediente.getCodDOC());
        cola.encolar(expediente.getTipoDOC());
        cola.encolar(expediente.getAsuntoDOC());
        cola.encolar(expediente.getEstadoDOC());
        cola.encolar(expediente.getCodUSER());
        cola.encolar(expediente.getFecha());
        cola.encolar(expediente.getDestinoEMP());
        cola.encolar(expediente.getDestinoArea());
        
        // crear un nuevo nodo
        NodoSobrecargado<String> nuevoNodo = new NodoSobrecargado(empleado.getCodEMP(), empleado.getAreaEMP(), cola, null);
        // Caso 1: Cuando la lista esta vacia
        
        if (esVacia1() == true) {
            cabeza = nuevoNodo;
            ultimo = nuevoNodo;
        } else {
            NodoSobrecargado aux = cabeza;
            
            while(aux != null){
                if(aux.getCodEMP()==empleado.getCodEMP()){
                    while(!cola.esVacia()){
                        aux.getCola().encolar(cola.desencolar());
                    }
                }
                
                aux = aux.getSgteNodo();
            }
            if(!cola.esVacia()){
                ultimo.setSgteNodo(nuevoNodo);
                ultimo = nuevoNodo;
            }

        }
    }

    public void mostrarexpedientes(Empleado empleado) {
        NodoSobrecargado aux = cabeza;
        Cola cola = new Cola();
        String elemento;
      
   
        while (aux != null) {
            if(aux.getCodEMP() == empleado.getCodEMP()){
                System.out.println(aux.getCodEMP());
                
                while(!aux.getCola().esVacia()){
                    elemento = (String) aux.getCola().desencolar();
                    System.out.println(elemento);
                    cola.encolar(elemento);
                } 
                
                while(!cola.esVacia()){
                    aux.getCola().encolar(cola.desencolar());
                }
            }
            
            aux = aux.getSgteNodo();
        }
        
    }
    
    public void ordenarporprioridad(Empleado empleado){
        NodoSobrecargado aux = cabeza;
        String elemento;
        String elemento1;
        
        Cola colaordenada = new Cola();
        Cola colaaux = new Cola();
        Cola colaaux1 = new Cola();
        
        while (aux != null) {
            if(aux.getCodEMP() == empleado.getCodEMP()){
                while(!aux.getCola().esVacia()){
                    elemento = (String) aux.getCola().desencolar();
                    if("3".equals(elemento)){
                        colaordenada.encolar(elemento);
                        elemento1 = elemento;
                        while(!"Marketing".equals(elemento1) && !"Sistemas".equals(elemento1)){
                            elemento1 = (String) aux.getCola().desencolar();
                            colaordenada.encolar(elemento1);
                        }
                    }else{
                        colaaux.encolar(elemento);
                    }
                }
                
                while(!colaaux.esVacia()){
                    elemento = (String) colaaux.desencolar();
                    if("2".equals(elemento)){
                        colaordenada.encolar(elemento);
                        elemento1 = elemento;
                        while(!"Marketing".equals(elemento1) && !"Sistemas".equals(elemento1)){
                            elemento1 = (String) colaaux.desencolar();
                            colaordenada.encolar(elemento1);
                        }
                    }else{
                        colaaux1.encolar(elemento);
                    }
                }
                
                while(!colaaux1.esVacia()){
                    elemento = (String) colaaux1.desencolar();
                    if("1".equals(elemento)){
                        colaordenada.encolar(elemento);
                        elemento1 = elemento;
                        while(!"Marketing".equals(elemento1) && !"Sistemas".equals(elemento1)){
                            elemento1 = (String) colaaux1.desencolar();
                            colaordenada.encolar(elemento1);
                        }
                    }
                }
                
                
                while(!colaordenada.esVacia()){
                    aux.getCola().encolar(colaordenada.desencolar());
                }              
            }
            aux = aux.getSgteNodo();
            }
    }
    
    public void EnviarExpedientes(Empleado empleado){
        NodoSobrecargado aux = cabeza;
        int contador = 0;
        String destinoEMP;
        Cola colaaux = new Cola();
        Cola colanoderivada = new Cola();
        Cola copy = new Cola();
        Cola colaaux1 = new Cola();
        String elemento1 = "";
        while (aux != null) {
            if(aux.getCodEMP().equals(empleado.getCodEMP())){
                while(!aux.getCola().esVacia()){
                    destinoEMP = (String) aux.getCola().desencolar();
                    colaaux.encolar(destinoEMP); // Se encola hasta DestinoEMP
                    contador++;
                    if(contador == 8){
                        if(" ".equals(destinoEMP) || destinoEMP.equals(aux.getCodEMP())|| "".equals(destinoEMP)){ // OJO solo vacio para indicar que no se ha enviado
                            colaaux.encolar(aux.getCola().desencolar()); // Encolamos DestinoArea
                            while(!colaaux.esVacia()){
                                elemento1 = (String) colaaux.desencolar();
                                copy.encolar(elemento1);
                                colaaux1.encolar(elemento1);
                            }
                            historial(copy);
                            while(!colaaux1.esVacia()){
                                colanoderivada.encolar(colaaux1.desencolar());
                            }
                        }else{
                            colaaux.encolar(aux.getCola().desencolar()); // Encolamos DestinoArea
                            while(!colaaux.esVacia()){
                                elemento1 = (String) colaaux.desencolar();
                                copy.encolar(elemento1);
                                colaaux1.encolar(elemento1);
                            }                            
                            historial(copy); // Guardamos el historial de envio
                            NodoSobrecargado aux1 = cabeza;
                            while(aux1!=null){
                                if(aux1.getCodEMP().equals(destinoEMP)){
                                    while(!colaaux1.esVacia()){
                                        aux1.getCola().encolar(colaaux1.desencolar());
                                    }
                                }
                                aux1 = aux1.getSgteNodo();
                            } 
                        }
                        contador = 0;
                    }
                }
            }
            while(!colanoderivada.esVacia()){
                aux.getCola().encolar(colanoderivada.desencolar());
            }        
            aux = aux.getSgteNodo();
        }

    }
    
    public void actualizardocumentos(Empleado empleado){
        NodoSobrecargado aux = cabeza;
        
        Scanner sc = new Scanner(System.in);
        String lista [] = {"Prioridad: ", "CodDOC: ", "TipoDoc: ","AsuntoDoc: ", "EstadoDOC: ","USER: ","Fecha: ",
            "Empleado a enviar documento: ",
            "Area a enviar el documento: "};
        int contador = 0;
        Cola colaactualizada = new Cola();
        String elemento;        
        
        while(aux != null){
            if(aux.getCodEMP() == empleado.getCodEMP()){
                String respuesta = "";

                while(!aux.getCola().esVacia()){
                    elemento = (String) aux.getCola().desencolar();

                    System.out.println("Para acctualizar ingresar un caracter");
                    System.out.println("Para no acctualizar dejarlo vacio"+"\n");
                    System.out.println(lista[contador]+elemento);
                    System.out.println("Actualizar: ");
                    respuesta = sc.nextLine();
                    if("".equals(respuesta) || " ".equals(respuesta)){
                        colaactualizada.encolar(elemento);
                    }else{
                        colaactualizada.encolar(respuesta);
                    }
                    contador++;
                    if(contador == 9){
                        contador = 0;
                    }
                }
                
                while(!colaactualizada.esVacia()){
                    aux.getCola().encolar(colaactualizada.desencolar());
                }
            }
            aux = aux.getSgteNodo();
        }
        
    }
    
    public void historial(Cola cola){
        String codDoc = "";
        String AsuntoDoc = "";
        String EstadoDOC = "";
        String Fecha = "";
        String codUSER = "";
        String DestinoEMP = "" ;
        String DestinoArea = "";
        int contador = 0;
        String elemento;
        
        while(!cola.esVacia()){
            cola.desencolar();
            codDoc = (String) cola.desencolar();
            cola.desencolar();
            AsuntoDoc = (String) cola.desencolar();
            EstadoDOC = (String) cola.desencolar();
            codUSER = (String) cola.desencolar();
            Fecha = (String) cola.desencolar();
            DestinoEMP = (String) cola.desencolar();
            DestinoArea = (String) cola.desencolar();
//            String CodDOC, String AsuntoDOC, String EstadoDOC, String CodUSER, String Fecha, String DestinoEMP, String DestinoArea
            NodoHistorial<String> nodoH = new NodoHistorial<>(codDoc,AsuntoDoc,EstadoDOC,codUSER,Fecha,DestinoEMP,DestinoArea,null);
            historial.agregar(nodoH);  
        }
    }
    
    
    
    //Métodos para usuario
    public void mostrardocumentos(String codUSER){
        historial.mostrardocumentos(codUSER);
    }
    
    public void mostrarhistorialdeldocumento(String CodDOC){
        historial.mostrarhistorialdeldocumento(CodDOC);
    }
    
    
    
    
    
    //Métodos para administrador 
    public void mostrarTodoAdmin(){
        String userAdmin = "ADMIN";
        String contraseñaActual = "Foundation0023";
        
        String respuesta;
        Scanner sc = new Scanner(System.in);
        
        String userpantalla ="";
        String contraseñapantalla = "";
        
        
        String salir = "";
        while(!"SI".equals(salir)){
                System.out.println("Ingresar usuario: ");
                userpantalla = sc.nextLine();
                System.out.println("Ingresar contraseña: ");
                contraseñapantalla = sc.nextLine();
            
            if(userpantalla.equals(userAdmin) && contraseñapantalla.equals(contraseñaActual)){
                System.out.println("Bienvenido");
                System.out.println("Sistema de Gestión - Universisdad de Lima");
                System.out.println("1: Mostrar todos los documentos de los empleados");
                System.out.println("2: Cambiar contraseña");
                System.out.println("3: Salir del sistema");
                System.out.println("Ingresar una opción: ");
                System.out.println("   ");
                respuesta = sc.nextLine();
                
                while (!"3".equals(respuesta)){
                    if("1".equals(respuesta)){
                    NodoSobrecargado aux = cabeza;
                    Cola colaaux = new Cola();
                    while (aux != null){
                        System.out.println(aux.getCodEMP()+"\t"+aux.getAreaEMP());
                        while(!aux.getCola().esVacia()){
                            String elemento = (String) aux.getCola().desencolar();
                            System.out.println(elemento+"\t");
                            colaaux.encolar(elemento);
                        }
                        while(!colaaux.esVacia()){
                            aux.getCola().encolar(colaaux.desencolar());
                        }

                        aux = aux.getSgteNodo();
                    }

                    }else if("2".equals(respuesta)){
                        System.out.println("Actulizar contraseña");
                        System.out.println("Ingresar contraseña antigua: ");
                        String respuesta1 = sc.nextLine();
                        System.out.println("Ingresar nueva contraseña");
                        contraseñaActual = sc.nextLine();
                        System.out.println("Se actualizo la contraseña correctamente");
                    }
                    System.out.println("Sistema de Gestión - Universisdad de Lima");
                    System.out.println("1: Mostrar todos los documentos de los empleados");
                    System.out.println("2: Cambiar contraseña");
                    System.out.println("3: Salir del sistema");
                    System.out.println("Ingresar una opción: ");
                    respuesta = sc.nextLine();
                    
                }
                    
                
                System.out.println("Se ha cerrado el sistema");                
            }else{
                System.out.println("Vuelva a ingresar los datos correspondientes");
            }
            
            System.out.println("Desae salir del Sistema SI o NO: ");
            salir = sc.nextLine();
        }
        
    }
    
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
