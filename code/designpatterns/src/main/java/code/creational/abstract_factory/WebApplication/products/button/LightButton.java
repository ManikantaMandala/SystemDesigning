package code.creational.abstract_factory.WebApplication.products.button;

public class LightButton implements Button {

	@Override
	public void onClick() {
		System.out.println("You clicked light button");
	}

	@Override
	public void onHover() {
		System.out.println("You hovered light button");
	}

	@Override
	public void render(String title) {
		System.out.println("Rendering this dark button");
	}
}
