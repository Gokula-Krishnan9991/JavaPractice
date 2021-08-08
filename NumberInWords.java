// Program to display the given numbers In Words
import java.lang.*;
import java.util.*;

public class NumberInWords {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number");
        int n=sc.nextInt();

        String str="";
        int r;

        while(n>0)
        {
        r=n%10;
        n=n/10;
        str=str.concat(String.valueOf(r));
        }
        for(int s=str.length()-1;s>=0;s--){

            char c=str.charAt(s);

            switch(c){


                case '0'->System.out.print("zero ");
                case '1'->System.out.print("one ");
                case '2'->System.out.print("two ");
                case '3'->System.out.print("Three ");
                case '4'->System.out.print("four ");

                case '5'->System.out.print("five ");
                case '6'->System.out.print("six ");
                case '7'->System.out.print("seven ");
                case '8'->System.out.print("eight ");
                case '9'->System.out.print("nine ");
            }
        }
    }
}
