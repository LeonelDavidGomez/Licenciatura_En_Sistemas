
public class MaximoDecorator extends HomeWeatherDecorator{
	
	public MaximoDecorator(WeatherData wd) {
		super(wd);
	}

	public String displayData() {
		return wd.displayData() + "Maximo: " + wd.getTemperaturas().stream()
																	.mapToDouble(t->t)
																	.max()
																	.orElse(0) + ";";
}
	}

