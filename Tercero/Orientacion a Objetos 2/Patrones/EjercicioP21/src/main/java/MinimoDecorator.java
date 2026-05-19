
public class MinimoDecorator extends HomeWeatherDecorator{
	
	public MinimoDecorator(WeatherData wd) {
		super(wd);
	}

	public String displayData() {
		return wd.displayData() + "Minimo: " + wd.getTemperaturas().stream()
				                                                  .mapToDouble(t->t)
				                                                  .min()
				                                                  .orElse(0) + ";";
	}
}
