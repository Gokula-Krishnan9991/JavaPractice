import java.lang.*;
import java.util.*;
public class Menudriven {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the two numbers");

        float a=sc.nextInt();
        float b =sc.nextInt();
        sc.nextLine();

        System.out.println("MENU ");

        System.out.println("Please enter the option in Words");
        System.out.println("1. ADD");
        System.out.println("2. SUB");
        System.out.println("3. MUL");
        System.out.println("4. DIV");

        String str=sc.nextLine();
        str=str.toUpperCase();



        switch(str)
        {
            case "ADD"->System.out.println("The addition of two numbers is "+(a+b));
            case "SUB"->System.out.println("The subtraction of two numbers is "+(a-b));
            case "MUL"->System.out.println("The multiplication of two numbers is "+(a*b));
            case "DIV"->System.out.println("The division of two numbers is "+(a/b));
            default ->System.out.println("Option is invalid");

        }


    }
}
