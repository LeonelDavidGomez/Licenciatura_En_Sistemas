
public class PresionDecorator extends HomeWeatherDecorator{
	
	public PresionDecorator(WeatherData wd) {
		super(wd);
	}

	public String displayData() {
		return this.wd.displayData() + "Presion atmosf: " + wd.getPresion() + ";";
	}
}
