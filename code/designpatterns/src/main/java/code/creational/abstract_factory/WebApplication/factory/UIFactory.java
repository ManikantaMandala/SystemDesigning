package code.creational.abstract_factory.WebApplication.factory;

import code.creational.abstract_factory.WebApplication.products.button.Button;
import code.creational.abstract_factory.WebApplication.products.checkbox.Checkbox;
import code.creational.abstract_factory.WebApplication.products.text_field.TextField;

public interface UIFactory {
	Button createButton();

	Checkbox createCheckbox();

	TextField createTextField();
}
