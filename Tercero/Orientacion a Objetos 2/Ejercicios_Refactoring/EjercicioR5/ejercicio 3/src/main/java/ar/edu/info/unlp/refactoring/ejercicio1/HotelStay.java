package ar.edu.info.unlp.refactoring.ejercicio1;

import java.time.LocalDate;

public class HotelStay extends Product {
    private double quote;
    private Hotel hotel;

    public HotelStay(double cost, TimePeriod timePeriod, Hotel hotel) {
    	super(timePeriod);
        this.quote = cost;
        this.hotel = hotel;
    }


    public double priceFactor() {
        return this.quote / this.price();
    }
    
    public double getQuote() {
    	return quote;
    }
    public double price() {
        return this.hotel.price(this.timePeriod.duration());
    }
}
