package code.creational.abstract_factory.WebApplication.products.text_field;

public class DarkTextField implements TextField {
	String text = "";

	@Override
	public void render(String title) {
		System.out.println("Rendering dark text field");
	}

	@Override
	public void setText(String text) {
		System.out.println("setting the text in dark text field");
		this.text = text;
	}

	@Override
	public String getText() {
		System.out.println("getting the text in dark text field");
		return this.text;
	}

}
