
public class PCBasico extends BuilderPC{
	
	public void construirProcesador() {
		this.equipo.agregarC(this.catalogo.getComponente("Procesador Basico"));
		
	};
	public void construirRam() {
		this.equipo.agregarC(this.catalogo.getComponente("8GB"));
		
	}
	public void construirDisco() {
		this.equipo.agregarC(this.catalogo.getComponente("HDD 500 GB"));
		
	}
	public void construirTarjetaGrafica() {

		
	} 
	public void construirGabinete() {
		this.equipo.agregarC(this.catalogo.getComponente("Gabinete Estandar"));
		
	}

}
