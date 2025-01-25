package code.creational.abstract_factory.WebApplication.products.checkbox;

public class DarkCheckbox implements Checkbox {
	boolean isSelected = false;

	@Override
	public void render(String title) {
		System.out.println("Rendering dark checkbox");
	}

	@Override
	public void toggleCheckbox() {
		if (isSelected) {
			isSelected = false;
			System.out.println("This dark check box is unselected");
			return;
		}
		isSelected = true;
		System.out.println("This dark check box is selected");
	}

}
