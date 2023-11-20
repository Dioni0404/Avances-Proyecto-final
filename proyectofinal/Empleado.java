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
public class Empleado {
    private String codEMP;
    private String AreaEMP;
    private Lista<Empleado> listaEmpleados;

    public Empleado(String codEMP, String AreaEMP) {
        this.codEMP = codEMP;
        this.AreaEMP = AreaEMP;
    }

    public String getCodEMP() {
        return codEMP;
    }

    public void setCodEMP(String codEMP) {
        this.codEMP = codEMP;
    }

    public String getAreaEMP() {
        return AreaEMP;
    }

    public void setAreaEMP(String AreaEMP) {
        this.AreaEMP = AreaEMP;
    }
    
    public void agregarALaLista(Empleado emp){
        listaEmpleados.agregarElemento(emp);
    }

    
    
    
    
            
    
}
