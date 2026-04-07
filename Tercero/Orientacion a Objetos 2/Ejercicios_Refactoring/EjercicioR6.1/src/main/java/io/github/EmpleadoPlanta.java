package io.github;

public class EmpleadoPlanta extends Empleado{
    private int cantidadHijos = 0;
    // ......
    private double asignacionFamiliar() {
        return (this.cantidadHijos * 2000);
    }
    
    public double sueldo() {
        return super.sueldo() + this.asignacionFamiliar();
    }
    
}