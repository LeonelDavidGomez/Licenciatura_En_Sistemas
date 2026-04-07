
public class Direccion {
	private String localidad;
    private String calle;
    private int numero;
    private String departamento;

    public String getLocalidad() {
        return localidad;
    }

    public String getCalle() {
        return calle;
    }

    public int getNumero() {
        return numero;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return this.localidad + ", " + this.calle + ", " + this.numero + ", " + this.departamento;
    }
}
