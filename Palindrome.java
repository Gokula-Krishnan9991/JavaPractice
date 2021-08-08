// Program to check whether the number is palindrome or not
import java.lang.*;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");

        int n =sc.nextInt();


        int temp=n;

        int rev =0;
        while(n>0){
            int r =n%10;
            rev=rev*10+r;
            n=n/10;
        }

        if(rev==temp){

            System.out.println("The Number is palindrome");
        }
        else {
            System.out.println("The number is not palindrome");
        }
    }
}