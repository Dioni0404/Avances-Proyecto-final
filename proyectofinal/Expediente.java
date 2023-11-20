/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contenido;

/**
 *
 * @author user
 */
public class Expediente {
    private String Prioridad;
    private String CodDOC;
    private String TipoDOC;
    private String AsuntoDOC;
    private String EstadoDOC;
    private String Fecha;
    private String codUSER;
    private String DestinoEMP;
    private String DestinoArea;

    public Expediente(String Prioridad, String CodDOC, String TipoDOC, String AsuntoDOC, String EstadoDOC, String Fecha, String codUSER, String DestinoEMP, String DestinoArea) {
        this.Prioridad = Prioridad;
        this.CodDOC = CodDOC;
        this.TipoDOC = TipoDOC;
        this.AsuntoDOC = AsuntoDOC;
        this.EstadoDOC = EstadoDOC;
        this.Fecha = Fecha;
        this.codUSER = codUSER;
        this.DestinoEMP = DestinoEMP;
        this.DestinoArea = DestinoArea;
    }

    public String getPrioridad() {
        return Prioridad;
    }

    public void setPrioridad(String Prioridad) {
        this.Prioridad = Prioridad;
    }

    public String getCodDOC() {
        return CodDOC;
    }

    public void setCodDOC(String CodDOC) {
        this.CodDOC = CodDOC;
    }

    public String getTipoDOC() {
        return TipoDOC;
    }

    public void setTipoDOC(String TipoDOC) {
        this.TipoDOC = TipoDOC;
    }

    public String getAsuntoDOC() {
        return AsuntoDOC;
    }

    public void setAsuntoDOC(String AsuntoDOC) {
        this.AsuntoDOC = AsuntoDOC;
    }

    public String getEstadoDOC() {
        return EstadoDOC;
    }

    public void setEstadoDOC(String EstadoDOC) {
        this.EstadoDOC = EstadoDOC;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getCodUSER() {
        return codUSER;
    }

    public void setCodUSER(String codUSER) {
        this.codUSER = codUSER;
    }

    public String getDestinoEMP() {
        return DestinoEMP;
    }

    public void setDestinoEMP(String DestinoEMP) {
        this.DestinoEMP = DestinoEMP;
    }

    public String getDestinoArea() {
        return DestinoArea;
    }

    public void setDestinoArea(String DestinoArea) {
        this.DestinoArea = DestinoArea;
    }

    
    
    
    
    
}
