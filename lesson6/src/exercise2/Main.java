package exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("enter your username: ");
        String userName = input.nextLine();
        System.out.print("enter your password: ");
        String password= input.nextLine();
        Long passwprd = Long.parseLong(password);
        System.out.print("write your email: ");
        String email= input.nextLine();

        User user1= User.getInstance(userName,passwprd,email);
        System.out.println("user name: "+ user1.getUserName());
        System.out.println("user password: "+ user1.getPassword());
        System.out.println("user email: "+ user1.getEmail());

    }
}
