package code;

import code.builder.user.Gender;
import code.builder.user.User;

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
