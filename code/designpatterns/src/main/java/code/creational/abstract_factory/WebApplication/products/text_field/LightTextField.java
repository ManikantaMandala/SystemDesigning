package code.creational.abstract_factory.WebApplication.products.text_field;

public class LightTextField implements TextField {
	String text = "";

	@Override
	public void render(String title) {
		System.out.println("Rendering light text field");
	}

	@Override
	public void setText(String text) {
		System.out.println("setting the text in light text field");
		this.text = text;
	}

	@Override
	public String getText() {
		System.out.println("getting the text in light text field");
		return this.text;
	}

}
