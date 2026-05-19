import java.util.List;
import java.util.stream.Collectors;

public class HomeWeatherStation implements WeatherData {
	private double temperatura;
	private double presion;
	private double radiacionSolar;
	private List<Double> temperaturas;
	
	
public HomeWeatherStation(double temperatura, double presion, double radiacionSolar, List<Double> temperaturas) {
		this.temperatura = temperatura;
		this.presion = presion;
		this.radiacionSolar = radiacionSolar;
		this.temperaturas = temperaturas;
	}
	public String displayData() {
		return "Temperatura F: "+ this.getTemperatura() + ";";
	}
	public double getTemperatura() {
		return this.temperatura;
	}
	public double getPresion () {
		return this.presion;
	}
	public double getRadiacion() {
		return this.radiacionSolar;
	}
	public List<Double> getTemperaturas() {
	    return temperaturas.stream()
	            .collect(Collectors.toList());
	
	}
	

}
