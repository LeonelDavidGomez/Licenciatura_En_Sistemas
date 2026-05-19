import java.time.LocalDate;

public class PlanIntegral extends Plan{
	
	
	public PlanIntegral(double montoFijo, LocalDate fechaContratacion) {
		super(22000, fechaContratacion);
	}
	public  double montoFijo(Coseguro c) {
		return this.montoFijo;
	}
	public  double cargaPorGrupoFamiliar(Afiliado afiliado) {
		 return 3000*afiliado.getFamiliaresACargo()+afiliado.getSalario()*0.01;
		 
	}
	public  double costoCoberturaViajera(Afiliado afiliado) {
		double montoCobertura=afiliado.getSalario()*0.03;
		if(afiliado.getCoseguro()!=null) {
			montoCobertura=montoCobertura-10000*afiliado.aniosAntiguedad();
		}
		return montoCobertura;
	}
	public double seguroPorInternacion() {
		return this.montoFijo * 0.05;  
	}
}
