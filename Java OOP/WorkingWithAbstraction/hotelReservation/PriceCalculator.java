package HotelReservation;

public class PriceCalculator {

    private double priceForDay;
    private int days;
    private Season season;

    private Discount discount;

    public PriceCalculator(double priceForDay, int days, Season season, Discount discount) {
        this.priceForDay = priceForDay;
        this.days = days;
        this.season = season;
        this.discount = discount;
    }

    public double calculatePrice(){
        return priceForDay * days * season.getMultiplier() * discount.getPercentageReduction();
    }
}
