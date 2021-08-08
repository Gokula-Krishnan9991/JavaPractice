import java.lang.*;
import java.util.*;


//Arithmetic progression series
public class DisplayAp {


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the starting number ");
        int a=sc.nextInt();

        System.out.println("Enter the common difference");
        int d=sc.nextInt();

        System.out.println("Enter the length of the AP");
        int n =sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(a+",");
            a=a+d;
        }
    }
}
