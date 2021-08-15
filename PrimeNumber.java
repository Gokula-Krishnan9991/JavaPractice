import java.lang.*;
import java.util.*;
public class PrimeNumber{

    //program to check whether the number is prime or not

    // Method programming

    static boolean isPrime(int n){

        for(int i=2;i<(n/2);i++){

            if((n%i)==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){

        System.out.println("Enter the number to check whether the number is prime or not ");
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        System.out.println(isPrime(n));

    }
}