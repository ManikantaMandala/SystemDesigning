package code;

import code.creational.builder.user.Gender;
import code.creational.builder.user.User;

public class Main {
	public static void main(String[] args) {
		User user = new User.UserBuilder()
				.setFirstName("FirstName")
				.setSecondName("SecondName")
				.setGender(Gender.FEMALE)
				.build();

		System.out.println(user);
	}
}
