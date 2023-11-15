package tda1;

import tda1.*;

public class NodoSobrecargado<T> {
    // Atributos
    private String codEMP;
    private String AreaEMP;
    private Cola cola = new Cola();
    private NodoSobrecargado SgteNodo;
    
    //Párametros
    public NodoSobrecargado(){
        SgteNodo = null;
    }
    
    // Constructores

    public NodoSobrecargado(String codEMP, String AreaEMP, Cola cola, NodoSobrecargado SgteNodo) {
        this.codEMP = codEMP;
        this.AreaEMP = AreaEMP;
        this.cola = cola;
        this.SgteNodo = SgteNodo;
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

    public Cola getCola() {
        return cola;
    }

    public void setCola(Cola cola) {
        this.cola = cola;
    }

    public NodoSobrecargado getSgteNodo() {
        return SgteNodo;
    }

    public void setSgteNodo(NodoSobrecargado SgteNodo) {
        this.SgteNodo = SgteNodo;
    }
    

    
    
    
    
    

    

}
