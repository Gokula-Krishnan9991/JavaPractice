import java.lang.*;
import java.util.*;
public class Armstrong {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);




        // Program  to find the whether the given number is armstrong or not


        long number =sc.nextLong();



        int count =0;
        long temp =number;
        long temp2 =number;

        while(temp>0){

            int remainder1= (int)(temp%10);
            temp=temp/10;
            count++;
        }

        long sum =0;
        while(temp2>0){

            int remainder2=(int)(temp2%10);


            sum+=(long)Math.pow(remainder2,count);
            temp2=temp2/10;
        }
        if(sum==number){
            System.out.println("It is a Armstrong number");
        }
        else
            System.out.println("It is not a Armstrong number");


    }
}
