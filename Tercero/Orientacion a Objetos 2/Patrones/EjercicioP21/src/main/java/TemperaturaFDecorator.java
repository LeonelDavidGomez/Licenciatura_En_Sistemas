
public class TemperaturaFDecorator  extends HomeWeatherDecorator{

	
	public TemperaturaFDecorator(WeatherData wd) {
		super(wd);
	}

	public String displayData() {
		return  wd.displayData() ;
	}
}
