package code.creational.abstract_factory.WebApplication.products.button;

public class DarkButton implements Button {

	@Override
	public void onClick() {
		System.out.println("You clicked dark button");
	}

	@Override
	public void onHover() {
		System.out.println("You hovered dark button");
	}

	@Override
	public void render(String title) {
		System.out.println("Rendering this dark button");
	}

}
