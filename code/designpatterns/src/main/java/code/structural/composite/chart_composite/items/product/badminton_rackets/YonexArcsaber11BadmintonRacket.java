package code.structural.composite.chart_composite.items.product.badminton_rackets;

public class YonexArcsaber11BadmintonRacket implements BadmintonRacket {
    private double price = 5000.00;

    @Override
    public String getInfo() {
        return "This is Yonex Arcsaber 11 Badminton Racket";
    }

    @Override
    public double getPrice() {
        return this.price;
    }

}
