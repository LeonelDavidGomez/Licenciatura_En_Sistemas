package io.github;

public class EmpleadoPasante extends Empleado{
	   
	    // ......
	    
	    public double sueldo() {
	        return this.sueldoBasico - (this.sueldoBasico * 0.13);
	    }

}
