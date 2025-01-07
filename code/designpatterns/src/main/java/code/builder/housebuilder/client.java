package code.builder.housebuilder;

import code.builder.housebuilder.builder.IglooBuilder;
import code.builder.housebuilder.builder.NormalBuilder;
import code.builder.housebuilder.director.Director;
import code.builder.housebuilder.product.House;

public class client {
	public static void main(String[] args) {
		NormalBuilder normalBuilder = new NormalBuilder();
		Director director = new Director(normalBuilder);

		director.makeHouse();
		House normalHouse = normalBuilder.getProduct();

		System.out.println(normalHouse);

		IglooBuilder iglooBuilder = new IglooBuilder();
		director.setBuilder(iglooBuilder);

		director.makeHouse();
		House iglooHouse = iglooBuilder.getProduct();

		System.out.println(iglooHouse);
	}
}
