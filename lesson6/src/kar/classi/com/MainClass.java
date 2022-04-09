package kar.classi.com;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        System.out.print("enter phrase : ");
        String inf= new Scanner(System.in).nextLine();
        char[] phrase= inf.toCharArray();
        char operator= phrase[1];
        Integer num1= phrase[0]-'0';
        Integer num2= phrase[2]-'0';
        if(operator=='+'){
            CalcPlus calcPlus1 = new CalcPlus();
            System.out.print("sum is: ");
            System.out.println(calcPlus1.calc(num1,num2));
    }
        if(operator=='-') {
            CalcMinus calcMinus1 = new CalcMinus();
            System.out.print("minus is: ");
            System.out.println(calcMinus1.calc(num1,num2));
        }
    }
}
