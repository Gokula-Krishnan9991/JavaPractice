import java.lang.*;
import java.util.*;
public class GCD {

    static int gcd(int a,int b){

        while(a>0 && b>0){

            if(a==b)
                break;
            else if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        return a;
    }
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a and b ");
        int a=sc.nextInt();
        int b =sc.nextInt();

        int c =gcd(a,b);

        System.out.println("The GCD of "+a +" and "+b +" is "+c);
    }
}
