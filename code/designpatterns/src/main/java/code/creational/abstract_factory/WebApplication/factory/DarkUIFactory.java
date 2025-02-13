package code.creational.abstract_factory.WebApplication.factory;

import code.creational.abstract_factory.WebApplication.products.button.Button;
import code.creational.abstract_factory.WebApplication.products.button.DarkButton;
import code.creational.abstract_factory.WebApplication.products.checkbox.Checkbox;
import code.creational.abstract_factory.WebApplication.products.checkbox.DarkCheckbox;
import code.creational.abstract_factory.WebApplication.products.text_field.DarkTextField;
import code.creational.abstract_factory.WebApplication.products.text_field.TextField;

public class DarkUIFactory implements UIFactory {

	@Override
	public Button createButton() {
		System.out.println("creating dark button");
		return new DarkButton();
	}

	@Override
	public Checkbox createCheckbox() {
		System.out.println("creating dark check box");
		return new DarkCheckbox();
	}

	@Override
	public TextField createTextField() {
		System.out.println("creating dark text field");
		return new DarkTextField();
	}

}
