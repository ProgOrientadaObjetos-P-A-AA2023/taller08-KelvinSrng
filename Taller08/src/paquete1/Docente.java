package paquete1;


public class Docente {
    protected String nombres;
    protected String cedula;
    
    
    
    public String obtenerNombres() {
        return nombres;
    }
    
    public String obtenerCedula() {
        return cedula;
    }
    
    public void establecerNombres(String x) {
        nombres = x;
    }
    
    public void establecerCedula(String x) {
        cedula = x;
    }
}
