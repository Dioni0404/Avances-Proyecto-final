package Contenido;
import java.util.Calendar;

/**
 *
 * @author alexander
 */
public class Fecha {
    private int dia;
    private int mes;
    private int año;
    
    public Fecha(){
        dia = 1;
        mes = 1;
        año = 1980;
    }
    
    public Fecha(int dia, int mes, int año){
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public int añosTranscurridos(){
        Calendar cal = Calendar.getInstance();
        int añoActualSistema = cal.get(Calendar.YEAR);
        return añoActualSistema - año;
    }
    
    @Override
    public String toString(){
        return dia + "/" + mes + "/" + año;
    }
}
