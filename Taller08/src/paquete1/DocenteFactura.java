package paquete1;


public class DocenteFactura extends Docente {
    private double valorFactura;
    private double valorIvaDescuento;
    private double valorCancelar;
    
    
    
    public double obtenerValorFactura() {
        return valorFactura;
    }
    
    public double obtenerValorIvaDescuento() {
        return valorIvaDescuento;
    }
    
    public double obtenerValorCancelar() {
        return valorCancelar;
    }
    
    public void establecerValorFactura(double x) {
        valorFactura = x;
    }
    
    public void establecerValorIvaDescuento(double x) {
        valorIvaDescuento = x;
    }
    
    public void calcularValorCancelar() {
        valorCancelar = valorFactura - ((valorIvaDescuento/100) * valorFactura);
    }
    
    @Override
    public String toString(){
        String reporte = String.format("\nDocente Factura: "
                + "\nNombre: %s"
                + "\nCedula: %s"
                + "\nValor factura: %.2f"
                + "\nValor Iva con descuento: %.2f"
                + "\nValor a cancelar : %.2f",
                obtenerNombres(),
                obtenerCedula(), 
                obtenerValorFactura(), 
                obtenerValorIvaDescuento(), 
                obtenerValorCancelar());
        
        return reporte;
    }
}
