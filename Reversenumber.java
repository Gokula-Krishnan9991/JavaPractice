import java.lang.*;
import java.util.*;
public class Reversenumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Reversing the number
        int n=sc.nextInt();
        int r ,rev =0;
        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }


        System.out.println("The reversed Number is "+rev);
    }
}
