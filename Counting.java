import java.lang.*;
import java.util.*;

public class Counting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //   Counting the digits in the number


        int count=0;
        int variable =sc.nextInt();

        while(variable>0){

            variable=variable/10;
            count++;
        }

        System.out.println(count);

    }
}
