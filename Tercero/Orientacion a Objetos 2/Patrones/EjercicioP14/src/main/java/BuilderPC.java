
public abstract class BuilderPC {

	protected EquipoPresupuesto equipo;
	protected Catalogo catalogo;
	public void reset() {
		equipo=new EquipoPresupuesto();
		catalogo=new Catalogo();
	}
	
	public EquipoPresupuesto getEquipo() {
		return equipo;
	}

	public void setEquipo(EquipoPresupuesto equipo) {
		this.equipo = equipo;
	}

	public abstract void construirProcesador();
	public abstract void construirRam();
	public abstract void construirDisco();
	public abstract void construirTarjetaGrafica();
	public abstract void construirGabinete();
	
}
