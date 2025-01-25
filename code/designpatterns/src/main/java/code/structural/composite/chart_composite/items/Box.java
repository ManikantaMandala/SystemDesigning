package code.structural.composite.chart_composite.items;

import java.util.ArrayList;
import java.util.List;

public class Box implements Product {
    List<Product> components;
    double currentPrice;

    public Box() {
        this.components = new ArrayList<>();
        this.currentPrice = 0;
    }

    public void addComponent(Product component) {
        components.add(component);
        currentPrice += component.getPrice();
    }

	public void removeComponent(Product component){
		components.remove(component);
		currentPrice -= component.getPrice();
	}

    @Override
    public double getPrice() {
        return this.currentPrice;
    }

}
