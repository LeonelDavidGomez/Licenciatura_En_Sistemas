
public class PCIntermedio extends BuilderPC{

	public void construirProcesador() {
		this.equipo.agregarC(this.catalogo.getComponente("Procesador intermedio"));
		
	};
	public void construirRam() {
		this.equipo.agregarC(this.catalogo.getComponente("16GB"));
		
	}
	public void construirDisco() {
		this.equipo.agregarC(this.catalogo.getComponente("SDD 500 GB"));
		
	}
	public void construirTarjetaGrafica() {
		this.equipo.agregarC(this.catalogo.getComponente("GTX 1650"));
		
	} 
	public void construirGabinete() {
		this.equipo.agregarC(this.catalogo.getComponente("Gabinete Intermedio"));
		
		this.equipo.agregarC(this.catalogo.getComponente("Fuente 800 W"));
	}
}
