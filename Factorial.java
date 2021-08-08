// Program to find the factorial of the number
import java.lang.*;
import java.util.*;
public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");

        int n=sc.nextInt();

        long fact=1;


        for(long i=1;i<=n;i++) {
            fact = fact * i;
        }

        System.out.println("The factorial of the number is "+fact);
    }
}
