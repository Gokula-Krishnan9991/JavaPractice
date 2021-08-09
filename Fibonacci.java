// Program to generate fibonacci series using for loop
import java.lang.*;
import java.util.*;

public class Fibonacci {

    public static void main(String[] args) {

// Fibonacci mathematical formula

        //fib(n)=fib(n-1)+fib(n-2)
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();

        System.out.println("Enter the second number");
        int b=sc.nextInt();

        System.out.println("Enter the length of the fibonacci series");
        int c =sc.nextInt();

        System.out.print(a+",");
        System.out.print(b+",");
        for(int i=0;i<c;i++){

            int d=a+b;

            System.out.print(d+",");

            a=b;
            b=d;
        }


    }
}
