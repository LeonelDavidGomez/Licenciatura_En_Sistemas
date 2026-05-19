import java.util.List;

public class HomeWeatherDecorator implements WeatherData{
	protected  WeatherData wd;
	public HomeWeatherDecorator(WeatherData wd) {
	    this.wd = wd;
	}
	public String displayData() {
		return wd.displayData();
	}
	public double getTemperatura() {
		return this.wd.getTemperatura();
	}
	public double getPresion () {
		return this.wd.getPresion();
	}
	public double getRadiacion() {
		return this.wd.getRadiacion();
	}
	public List<Double> getTemperaturas() {
		return this.wd.getTemperaturas();
	}
}
