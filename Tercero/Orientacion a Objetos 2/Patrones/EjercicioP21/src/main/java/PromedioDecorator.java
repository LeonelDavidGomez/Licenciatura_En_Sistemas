
public class PromedioDecorator  extends HomeWeatherDecorator{
	
	public PromedioDecorator(WeatherData wd) {
		super(wd);
	}

	public String displayData() {
		return wd.displayData() + "Promedio: " + wd.getTemperaturas()
												  .stream()
												  .mapToDouble(t->t)
												  .sum()/wd.getTemperaturas().size() + ";";
	}
}
