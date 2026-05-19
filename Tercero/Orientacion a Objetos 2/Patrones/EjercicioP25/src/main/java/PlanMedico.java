import java.time.LocalDate;

public class PlanMedico extends Plan{

	public PlanMedico(double montoFijo, LocalDate fechaContratacion) {
	     super(15000, fechaContratacion);
    }

	public  double montoFijo(Coseguro c) {
	  return this.montoFijo;
	}
	public  double cargaPorGrupoFamiliar(Afiliado afiliado) {
		double montoGrupoFamiliar=3500*afiliado.getFamiliaresACargo();
		if(afiliado.getCoseguro()!=null) {
			  montoGrupoFamiliar = montoGrupoFamiliar- afiliado.getCoseguroDescuento() * afiliado.getFamiliaresACargo(); // ← multiplicá por integrantes
		}
		return montoGrupoFamiliar;
	}
	public  double costoCoberturaViajera(Afiliado afiliado) {
		double montoCobertura=afiliado.getSalario()*0.01;
		if(afiliado.getCoseguro()!=null) {
			montoCobertura=montoCobertura-afiliado.getCoseguroCobertura();
		}
		return montoCobertura;
	}
	public double seguroPorInternacion() {
		return 0;
	}
	
}
