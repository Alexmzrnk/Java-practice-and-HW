package class12;

public class E2StringDemo {
    public static void main(String[] args) {

        String userName="admin";
        String password="pass123";
        //write code to check the username and password if the uN and ps are less than 8 chr-s this msg "Sign up successful"
        //otherwisw print "Username and passwoerd cant be more than 8 chart


        if ((userName.length()>8)&&(password.length()>8)) {
            System.out.println("Username and password can't be more than 8 characters");
        } else {
            System.out.println("Sign up successful");
        }


    }

}
