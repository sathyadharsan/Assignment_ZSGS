package exception;

import javax.naming.AuthenticationException;

public class Authentication_exception {
//    Design a login system that throws AuthenticationException if the username or password is
//    incorrect. Handle it and
//    display a login failure message.



    public static void main(String[] args) {
        String user="sathya";
        String pass="pass@123";

     try {
         validuser(user,pass);
         System.out.println("login successfully");
     } catch (AuthenticationException authenticationException) {
         System.out.println(authenticationException.getMessage());
     }
    }


    static  void validuser(String user,String pass) throws AuthenticationException {

            if( !(user.equals("admin")) && !(pass.equals("admin@123"))){
                throw  new AuthenticationException(" invaliod user");
            }
    }
}


