package Ejercicio;

public class clsEjercicio6 {

    private String nombre;
    private double sueldo;
    private double descuento;
    private double sueldoLiquido;

    public clsEjercicio6(String nombre, double sueldo, double descuento) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.descuento = descuento;
        this.sueldoLiquido = sueldoLiquido;


        sueldoLiquido = sueldo - descuento;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getSueldoLiquido() {
        return sueldoLiquido;
    }

    public void setSueldoLiquido(double sueldoLiquido) {
        this.sueldoLiquido = sueldoLiquido;
    }
}
