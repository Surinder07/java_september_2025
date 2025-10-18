package oct18;

public class LoginDemo {
    public static void main(String[] args) {

        // set initial username and password
        LoginUser loginUser = new LoginUser("pragra","pragra123");

        //loginUser.loginUser("pragra","pragra123");

        // some hacker changed the password
       // loginUser.password = "MyPassword";
      //  loginUser.loginUser("Pragra","pragra123");

     //   System.out.println(loginUser.userName);
     //   System.out.println(loginUser.password);


        // amazon
        // forgot your password

        System.out.println("Username : "+loginUser.getUserName());
        loginUser.setPassword("NewPasword");

        loginUser.loginUser("pragra","NewPasword");

    }
}
