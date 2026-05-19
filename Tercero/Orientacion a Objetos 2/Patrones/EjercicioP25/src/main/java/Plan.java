import java.time.LocalDate;

public abstract class Plan {

	
	protected double montoFijo;
	protected LocalDate fechaContratacion;
	
	public Plan (double montoFijo,LocalDate fechaContratacion) {
		this.montoFijo=montoFijo;
		this.fechaContratacion=fechaContratacion;
	}
	public double costoMensual (Afiliado afiliado) {
		return this.montoFijo(afiliado.getCoseguro())+this.cargaPorGrupoFamiliar(afiliado)+this.costoCoberturaViajera(afiliado)+this.seguroPorInternacion();
	}
	public abstract double montoFijo(Coseguro c) ;
	public abstract double cargaPorGrupoFamiliar(Afiliado afiliado ) ;
	public abstract double costoCoberturaViajera(Afiliado afiliado) ;
	public abstract double seguroPorInternacion();
}
