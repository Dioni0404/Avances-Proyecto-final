/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import Contenido.Empleado;
import Contenido.Expediente;
import Contenido.RegistroExpedientes;



/**
 *
 * @author user
 */
public class NewClass {
    public static void main(String[] args) {
        RegistroExpedientes BaseDatos = new RegistroExpedientes(); 
 

        Empleado empleado = new Empleado("Empleado --------------------1", "Sistemas");
        Expediente exp = new Expediente("1","Word","Matricula","En proceso","12-11-2023","Empleado 5","Sistemas");
        Expediente exp1 = new Expediente("1","Word","Matricula","En proceso","12-11-2023","Empleado 5","Sistemas");
        Expediente exp2 = new Expediente("2","Word","Matricula","En proceso","12-11-2023","Empleado 5","Sistemas");
        
        BaseDatos.agregar(empleado, exp2);
        BaseDatos.agregar(empleado, exp1);
        BaseDatos.ordenarporprioridad(empleado);
        BaseDatos.mostrar(empleado);
        
        
        Empleado empleado1 = new Empleado("Empleado --------------------2", "Sistemas");
        Expediente exp3 = new Expediente("1","Word","Matricula","En proceso","12-11-2023","Empleado 5","Sistemas");
        Expediente exp4 = new Expediente("1","Word","Matricula","En proceso","12-11-2023","Empleado 5","Sistemas");
        Expediente exp5 = new Expediente("2","Word","Matricula","En proceso","12-11-2023","Empleado 5","Sistemas");
        
        BaseDatos.agregar(empleado1, exp3);
        BaseDatos.mostrar(empleado1);
                
                

        
        
        
        
        
       
    }
   
   
   
}
