import java.util.Scanner;

public class DisplayGp {


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the starting number ");
        int a=sc.nextInt();

        System.out.println("Enter the common ratio");
        int d=sc.nextInt();

        System.out.println("Enter the length of the GP");
        int n =sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(a+",");
            a=a*d;
        }
    }

}
