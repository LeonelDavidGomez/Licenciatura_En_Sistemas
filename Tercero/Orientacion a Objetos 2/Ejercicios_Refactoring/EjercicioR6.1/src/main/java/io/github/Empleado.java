package io.github;
public abstract class Empleado {
    protected String nombre;
    protected String apellido;
    protected double sueldoBasico = 0;

    public double sueldo() {
        return this.sueldoConDescuento();
    }

    private double sueldoConDescuento() {
        return this.sueldoBasico - (this.sueldoBasico * 0.13);
    }

}