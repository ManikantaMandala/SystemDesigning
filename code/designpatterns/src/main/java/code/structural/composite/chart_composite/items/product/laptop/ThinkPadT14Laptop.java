package code.structural.composite.chart_composite.items.product.laptop;

public class ThinkPadT14Laptop implements Laptop {
    private double price = 40_000;

    @Override
    public String getInfo() {
        return "This is Lenovo ThinkPad T14 laptop";
    }

    @Override
    public double getPrice() {
        return this.price;
    }

}
