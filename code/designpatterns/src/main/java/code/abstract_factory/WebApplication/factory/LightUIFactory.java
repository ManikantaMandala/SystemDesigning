package code.abstract_factory.WebApplication.factory;

import code.abstract_factory.WebApplication.products.button.Button;
import code.abstract_factory.WebApplication.products.button.LightButton;
import code.abstract_factory.WebApplication.products.checkbox.Checkbox;
import code.abstract_factory.WebApplication.products.checkbox.LightCheckbox;
import code.abstract_factory.WebApplication.products.text_field.LightTextField;
import code.abstract_factory.WebApplication.products.text_field.TextField;

public class LightUIFactory implements UIFactory {

	@Override
	public Button createButton() {
		System.out.println("creating light button");
		return new LightButton();
	}

	@Override
	public Checkbox createCheckbox() {
		System.out.println("creating light check box");
		return new LightCheckbox();
	}

	@Override
	public TextField createTextField() {
		System.out.println("creating light text field");
		return new LightTextField();
	}

}
