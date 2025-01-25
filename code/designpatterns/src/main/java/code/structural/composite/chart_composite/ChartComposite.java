package code.structural.composite.chart_composite;

import java.util.ArrayList;
import java.util.List;

import code.structural.composite.chart_composite.items.Box;
import code.structural.composite.chart_composite.items.Product;
import code.structural.composite.chart_composite.items.product.badminton_rackets.YonexArcsaber11BadmintonRacket;
import code.structural.composite.chart_composite.items.product.badminton_rackets.YonexCarbonex8000BadmintonRacket;
import code.structural.composite.chart_composite.items.product.laptop.AcerPredatorHelios300Laptop;
import code.structural.composite.chart_composite.items.product.laptop.ThinkPadT14Laptop;

public class ChartComposite {

	public static void main(String[] args) {
		List<Product> chart = new ArrayList<>();

		Box box = new Box();

		Product laptop1 = new AcerPredatorHelios300Laptop();
		Product laptop2 = new ThinkPadT14Laptop();

		Product racket1 = new YonexArcsaber11BadmintonRacket();
		Product racket2 = new YonexCarbonex8000BadmintonRacket();

		box.addComponent(racket1);
		box.addComponent(racket2);

		chart.add(box);
		chart.add(laptop1);
		chart.add(laptop2);

		System.out.println(getPrice(chart));
	}

	public static double getPrice(List<Product> chartProducts) {
		double cost = 0;

		for (Product product : chartProducts) {
			cost += product.getPrice();
			System.out.println(product.getPrice());
		}

		return cost;
	}
}
