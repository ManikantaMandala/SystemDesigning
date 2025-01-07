package code.builder.user;

public class BasicClientBuilder {
	public static void main(String[] args) {
		User user = new User.UserBuilder()
				.setFirstName("FirstName")
				.setSecondName("SecondName")
				.setGender(Gender.FEMALE)
				.build();

		System.out.println(user);
	}
}
