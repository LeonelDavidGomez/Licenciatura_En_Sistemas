
public class TemperaturaCDecorator  extends HomeWeatherDecorator{
	
	
	
	public TemperaturaCDecorator(WeatherData wd) {
		super(wd);
	}

	public String displayData() {
		
		return wd.displayData()  + "Temperatura C: " + (wd.getTemperatura() - 32) / 1.8 + ";";
	}
}
