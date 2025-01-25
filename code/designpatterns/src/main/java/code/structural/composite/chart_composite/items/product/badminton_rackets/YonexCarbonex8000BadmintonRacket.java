package code.structural.composite.chart_composite.items.product.badminton_rackets;

public class YonexCarbonex8000BadmintonRacket implements BadmintonRacket {
    private double price = 6000.00;

    @Override
    public String getInfo() {
        return "This is Yonex Carbonex 8000 Badminton Racket";
    }

    @Override
    public double getPrice() {
        return this.price;
    }

}
