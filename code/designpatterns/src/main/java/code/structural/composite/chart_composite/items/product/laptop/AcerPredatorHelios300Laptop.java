package code.structural.composite.chart_composite.items.product.laptop;

public class AcerPredatorHelios300Laptop implements Laptop {
    private double price = 90_000;

    @Override
    public String getInfo() {
        return "This is Acer Predator Helios 300 laptop";
    }

    @Override
    public double getPrice() {
        return this.price;
    }

}
