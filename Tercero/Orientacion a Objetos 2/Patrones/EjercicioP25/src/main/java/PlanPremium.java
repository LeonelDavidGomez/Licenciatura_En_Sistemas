import java.time.LocalDate;

public class PlanPremium extends Plan{
	
	
	public PlanPremium(double montoFijo, LocalDate fechaContratacion) {
		super(33000, fechaContratacion);
	}
	public  double montoFijo(Coseguro c) {
	 if (c!=null) {
		 this.montoFijo=this.montoFijo-c.getDescuento();
	 }
	 return this.montoFijo;
	}
	public  double cargaPorGrupoFamiliar(Afiliado afiliado) {
		if(afiliado.getFamiliaresACargo()<=4) {
			return 0;
		}
		return 2800*afiliado.getFamiliaresACargo();
	}
	public  double costoCoberturaViajera(Afiliado afiliado) {
		double montoCobertura=afiliado.getSalario()*0.01;
		if(afiliado.getCoseguro()!=null) {
			montoCobertura=montoCobertura-afiliado.getCoseguroCobertura();
		}
		return montoCobertura;
	}
	public double seguroPorInternacion() {
		return this.montoFijo*0.05;
	}
}
