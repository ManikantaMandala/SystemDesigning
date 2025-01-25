package code.creational.builder.user;

public class User {
    private String firstName;
    private String secondName;
    private Gender gender;

    public String getFirstName() {
        return this.firstName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    public Gender getGender() {
        return this.gender;
    }

    public String toString() {
        return "User[" + this.firstName + " " + this.secondName + " " + this.gender + "]\n";
    }

    public static class UserBuilder {
        private User user;

        public UserBuilder() {
            reset();
        }

        private void reset() {
            this.user = new User();
        }

        public UserBuilder setFirstName(String fName) {
            this.user.firstName = fName;
            return this;
        }

        public UserBuilder setSecondName(String sName) {
            this.user.secondName = sName;
            return this;
        }

        public UserBuilder setGender(Gender gender) {
            this.user.gender = gender;
            return this;
        }

        public User build() {
            if (this.user.firstName == null || this.user.secondName == null || this.user.gender == null) {
                throw new IllegalStateException("no params of user are defined");
            }

            User product = this.user;
            reset();
            return product;
        }
    }
}
