package paquete1;

public class DocenteNombramiento extends Docente{
    private double valorSueldo;
    private double valorHoraExtra;
    private int numeroHorasExtra;
    private double salario;

   
    public double obtenerValorSueldo() {
        return valorSueldo;
    }
    
    public double obtenerValorHoraExtra() {
        return valorHoraExtra;
    }
    
    public int obtenerNumeroHorasExtra() {
        return numeroHorasExtra;
    }
    
    public double obtenerSalario() {
        return salario;
    }
    
    public void establecerValorSueldo(double x) {
        valorSueldo = x;
    }
    
    public void establecerValorHoraExtra(double x) {
        valorHoraExtra = x;
    }
    
    public void establecerNumeroHorasExtra(int x) {
        numeroHorasExtra = x;
    }
    
    public void calcularSalario() {
        salario = (numeroHorasExtra * valorHoraExtra) + valorSueldo;
    }
    
    @Override
    public String toString(){
        String reporte = String.format("\nDocente Nombramiento: \nNombre: %s"
                + "\nCedula %s"
                + "\nValor del sueldo: %.2f"
                + "\nValor hora extra: %.2f"
                + "\nNumero de horas extra: %d"
                + "\nSalario: %.2f\n" ,obtenerNombres(),obtenerCedula(), obtenerValorSueldo(), 
                obtenerValorHoraExtra(), 
                obtenerNumeroHorasExtra(),
                obtenerSalario());
        
        return reporte;
    }
}
