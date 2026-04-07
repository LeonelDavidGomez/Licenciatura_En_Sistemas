package io.github;
public class EmpleadoTemporario extends Empleado{
    private double horasTrabajadas = 0;
    private int cantidadHijos = 0;
    // ......
    
    public double sueldo() {
        return super.sueldo() + this.horasTrabajadas() + this.asignacionFamiliar();
    }

    private double horasTrabajadas() {
        return this.horasTrabajadas * 500;
    }

    private double asignacionFamiliar() {
        return (this.cantidadHijos * 1000);
    }
    
}