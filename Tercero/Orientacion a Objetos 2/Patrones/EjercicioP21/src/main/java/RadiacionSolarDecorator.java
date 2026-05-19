
public class RadiacionSolarDecorator  extends HomeWeatherDecorator{
	
	public RadiacionSolarDecorator(WeatherData wd) {
		super(wd);
	}

	public String displayData() {
		return this.wd.displayData() + "Radiacion solar: "+wd.getRadiacion() + ";";
	}
}
