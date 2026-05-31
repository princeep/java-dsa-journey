package BasicOperation;

import java.util.Scanner;

public class Methods {
//    create a method for login and signup
    void signup(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username");
        String username = sc.next();
        System.out.println("Enter gmail");
        String gmail = sc.next();
        System.out.println("Enter Password should be less then 8");
        String password = sc.next();
        System.out.println("Enter confirm password");
        String confirmPassword = sc.next();

        if(gmail.trim().isEmpty()){
            System.out.println("Gmail is medatory");
        }
        else if(password.length()<8){
            System.out.println("Password must be at least 8 characters long!");
        }
        else if(!password.equals(confirmPassword)){
            System.out.println("Password Missing");
        }
        else{
            System.out.println("signup successfully");
        }

    }
    public static void main(String[] args){
        Methods methodObject = new Methods();
        methodObject.signup();
    }
}
