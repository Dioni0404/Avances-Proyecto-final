package tda1;

public class NodoHistorial<T> {
    // Atributos
    private String CodDOC;
    private String AsuntoDOC;
    private String EstadoDOC;
    private String CodUSER;
    private String Fecha;
    private String DestinoEMP;
    private String DestinoArea;
    private NodoHistorial SgteNodo;
    
    //Párametros
    public NodoHistorial(){
        SgteNodo = null;
    }
    
    // Constructores

    public NodoHistorial(String CodDOC, String AsuntoDOC, String EstadoDOC, String CodUSER, String Fecha, String DestinoEMP, String DestinoArea, NodoHistorial SgteNodo) {
        this.CodDOC = CodDOC;
        this.AsuntoDOC = AsuntoDOC;
        this.EstadoDOC = EstadoDOC;
        this.CodUSER = CodUSER;
        this.Fecha = Fecha;
        this.DestinoEMP = DestinoEMP;
        this.DestinoArea = DestinoArea;
        this.SgteNodo = SgteNodo;
    }

    public String getCodDOC() {
        return CodDOC;
    }

    public void setCodDOC(String CodDOC) {
        this.CodDOC = CodDOC;
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

    public String getCodUSER() {
        return CodUSER;
    }

    public void setCodUSER(String CodUSER) {
        this.CodUSER = CodUSER;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
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

    public NodoHistorial getSgteNodo() {
        return SgteNodo;
    }

    public void setSgteNodo(NodoHistorial SgteNodo) {
        this.SgteNodo = SgteNodo;
    }
    
    
    

    
    
    
    

   
    
    
    
    

    

    

}
