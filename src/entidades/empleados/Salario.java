package entidades.empleados;

public class Salario {

    private double horasTrabajadas;
    private double valorHora;

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getValorHora() {
        return valorHora;
    }

    public double calcularSalario(){
        return (this.getHorasTrabajadas()*this.valorHora);
    }
}
