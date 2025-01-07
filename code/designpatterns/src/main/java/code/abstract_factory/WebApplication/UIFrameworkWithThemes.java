package code.abstract_factory.WebApplication;

import code.abstract_factory.WebApplication.factory.UIFactory;
import code.abstract_factory.WebApplication.products.button.Button;
import code.abstract_factory.WebApplication.products.checkbox.Checkbox;
import code.abstract_factory.WebApplication.products.text_field.TextField;

public class UIFrameworkWithThemes {

	private UIFactory factory;
	private Button button;
	private Checkbox checkbox;
	private TextField textField;

	public UIFrameworkWithThemes(UIFactory factory) {
		this.factory = factory;
	}

	public void setUIFactory(UIFactory factory) {
		this.factory = factory;
	}

	public void createUI() {
		this.button = factory.createButton();
		this.checkbox = factory.createCheckbox();
		this.textField = factory.createTextField();
	}

	public void render() {
		this.button.render("Button Title");
		this.checkbox.render("Checkbox Title");
		this.textField.render("Hello their");
	}
}
