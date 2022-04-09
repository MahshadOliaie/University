package exercise1.com;

import java.util.Scanner;

public class MainClasss {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your username: ");
        String userName = input.nextLine();
        System.out.print("enter your real name: ");
        String realName = input.nextLine();
        System.out.print("enter your password: ");
        String passWord= input. nextLine();
        Long password = Long.parseLong(passWord);
        System.out.print("how old are you?: ");
        String uAge=input.nextLine();
        Integer age= Integer.parseInt(uAge);
        System.out.print("enter your address: ");
        String address= input.nextLine();
        System.out.print("enter your phone number: ");
        String phone= input.nextLine();
        Long phoneNumber = Long.parseLong(phone);
        System.out.print("enter your education: ");
        String education = input.nextLine();

        User user1 =new User().setUserName(userName).setRealName(realName).setPassword(password).setAge(age).setAddress(address).setPhoneNumber(phoneNumber).setEducation(education);
        System.out.println("user name: " + user1.getUserName());
        System.out.println("real name: " + user1.getRealName());
        System.out.println("password: " + user1.getPassword());
        System.out.println("age: " + user1.getAge());
        System.out.println("address: " + user1.getAddress());
        System.out.println("phone number: " + user1.getPhoneNumber());
        System.out.println("education: " + user1.getEducation());


    }
}
