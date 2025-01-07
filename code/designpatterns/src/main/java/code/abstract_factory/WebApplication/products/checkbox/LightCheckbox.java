package code.abstract_factory.WebApplication.products.checkbox;

public class LightCheckbox implements Checkbox {
	boolean isSelected = false;

	@Override
	public void render(String title) {
		System.out.println("Rendering light checkbox");
	}

	@Override
	public void toggleCheckbox() {
		if (isSelected) {
			isSelected = false;
			System.out.println("This light check box is unselected");
			return;
		}
		isSelected = true;
		System.out.println("This light check box is selected");
	}

}
