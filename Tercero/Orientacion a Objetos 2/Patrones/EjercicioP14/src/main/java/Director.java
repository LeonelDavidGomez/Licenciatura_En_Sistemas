
public class Director {

	
	private BuilderPC builder;

	
	
	
	public Director(BuilderPC builder) {
		this.builder = builder;
	}

	public BuilderPC getBuilder() {
		return builder;
	}

	public EquipoPresupuesto costruirPresupesto() {
		builder.construirProcesador();
		builder.construirRam();
		builder.construirDisco();
		builder.construirTarjetaGrafica();
		builder.construirGabinete();
		EquipoPresupuesto e=builder.getEquipo();
		builder.reset();
		return e;
		
	}
	
	public void setBuilder(BuilderPC builder) {
		this.builder = builder;
	}
	
}
