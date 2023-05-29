package Project2;

/*
Create Registration Class in which you would have variables as
email, userName and password that have an access scope only
within its own class. After creating an object of the class user should
be able to call methods and in each method separately pass values
to set users email, username and password.
Requirements:
A. Valid email consider to be only yahoo
B. Valid userName and password cannot be empty and should be of
length larger than 6 characters. Also valid password cannot contain
userName.
 */
public class Task9 {
    public static void main(String[] args) {
        Registration registration = new Registration();
        registration.setEmail("tonystark@yahoo.com");
        registration.setUserName("TonyStark");
        registration.setPassword("1988starK");
        System.out.println("***************");
        registration.setEmail("tonystark@gmail.com");
        registration.setUserName("Stark");
        registration.setPassword("Stark");

    }
}

class Registration {
    String email, userName, password;

    public void setEmail(String email) {
        this.email = email;
        if (email.endsWith("yahoo.com")) {
            System.out.println("Email accepted");
        } else {
            System.out.println("Valid email consider to be only yahoo.com");
        }
    }

    public void setUserName(String userName) {
        this.userName = userName;
        if (userName.length() >= 7) {
            System.out.println("User name accepted");
        } else {
            System.out.println("User name length should be more than 6 characters");
        }
    }

    public void setPassword(String password) {
        this.password = password;
        if (password.equals(userName)) {
            System.out.println("Valid password cannot contain userName");
        } else if (password.length() >= 7) {
            System.out.println("Password accepted");
        } else {
            System.out.println("Password length should be more than 6 characters");
        }
    }
}
