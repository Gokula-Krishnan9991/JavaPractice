
import java.util.*;
import java.lang.*;
// Program to find the roots of QE
public class QuadraticE {

    public static void main(String[]args){

        // Formula for QE
        //ax^2+b^x+c=0

        //roots (x+r1)(x+r2)

        Scanner sc=new Scanner(System.in);
        //condition is b^2-4ac>=0
        //give inputs of a,b,c according to the condition
        // if the value exceeds the condition then the output is NAN
        int a,b,c ;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        // root r1
        //ensuring that b^2-4ac>=0
        //give inputs of a,b
        double r1= (-b+Math.sqrt(b*b-4*a*c))/(2*a);
        double r2= (-b-Math.sqrt(b*b-4*a*c))/(2*a);

        System.out.println("The roots are "+r1+" "+r2);

    }
}
