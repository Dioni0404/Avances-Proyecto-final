/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contenido;

import tda1.*;


/**
 *
 * @author user
 */
public class RegistroExpedientes {
    // Atributos 
    private NodoSobrecargado cabeza;
    private NodoSobrecargado ultimo;
    private Empleado empleado;
    private Expediente expediente;

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
        
        cola.encolar(expediente.getPrioridad());
        cola.encolar(expediente.getTipoDOC());
        cola.encolar(expediente.getAsuntoDOC());
        cola.encolar(expediente.getEstadoDOC());
        cola.encolar(expediente.getFecha());
        cola.encolar(expediente.getDestinoEMP());
        cola.encolar(expediente.getDestinoArea());
        
        // crear un nuevo nodo
        NodoSobrecargado nuevoNodo = new NodoSobrecargado(empleado.getCodEMP(), empleado.getAreaEMP(), cola, null);
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

    public void mostrar(Empleado empleado) {
        NodoSobrecargado aux = cabeza;
      
   
        while (aux != null) {
            if(aux.getCodEMP() == empleado.getCodEMP()){
                System.out.println(aux.getCodEMP());
                while(!aux.getCola().esVacia()){
                    System.out.println(aux.getCola().desencolar());
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
    
    public void Destino(Empleado empleado){
        NodoSobrecargado aux = cabeza;
        while (aux != null) {
            if(aux.getCodEMP() == empleado.getCodEMP()){
                
            }
        }
        
        
    }

    
}
