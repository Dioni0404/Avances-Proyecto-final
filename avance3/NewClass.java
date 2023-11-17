/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import Contenido.Empleado;
import Contenido.Expediente;
import Contenido.Historial;
import Contenido.Fecha;
import Contenido.RegistroExpedientes;



/**
 *
 * @author user
 */
public class NewClass {
    public static void main(String[] args) {
        RegistroExpedientes BaseDatos = new RegistroExpedientes(); 
 

        Empleado empleado = new Empleado("EMP001", "Sistemas");
        Fecha fecha1 = new Fecha(12,11,2023);
        Expediente exp = new Expediente("3","DOC001","Word","Matricula","En proceso",fecha1.toString(),"USER002","EMP003","Sistemas");
        Expediente exp1 = new Expediente("2","DOC002","Word","Matricula","En proceso",fecha1.toString(),"USER004","EMP002","Sistemas");
        Expediente exp2 = new Expediente("1","DOC002","Word","Matricula","En proceso",fecha1.toString(),"USER006","EMP002","Sistemas");
        
        BaseDatos.agregar(empleado, exp);
        BaseDatos.agregar(empleado, exp2);
  
        
        Empleado empleado1 = new Empleado("EMP002", "Sistemas");
        Expediente exp3 = new Expediente("3","DOC001","Word","Matricula","En proceso",fecha1.toString(),"USER002","EMP001","Marketing");
        BaseDatos.agregar(empleado1, exp3);
        
        
        BaseDatos.mostrarexpedientes(empleado);
        

   

    }
   
   
   
}
