package Project2HW;

public class Registration {

        private String email;
        private String userName;
        private String password;

        public void setEmail(String email) {
            if (isValidEmail(email)) {
                this.email = email;
            } else {
                System.out.println("Invalid email!");
            }
        }

        public void setUserName(String userName) {
            if (isValidUserName(userName)) {
                this.userName = userName;
            } else {
                System.out.println("Invalid userName!");
            }
        }

        public void setPassword(String password) {
            if (isValidPassword(password)) {
                this.password = password;
            } else {
                System.out.println("Invalid password!");
            }
        }

        private boolean isValidEmail(String email) {
            return email.endsWith("@yahoo.com");
        }

        private boolean isValidUserName(String userName) {
            return userName.length() > 6 && !password.contains(userName);
        }

        private boolean isValidPassword(String password) {
            return password.length() > 6 && !password.contains(userName);
        }

        public static void main(String[] args) {
            Registration registration = new Registration();

            registration.setEmail("example@yahoo.com");
            registration.setUserName("user123");
            registration.setPassword("password123");
        }
    }

