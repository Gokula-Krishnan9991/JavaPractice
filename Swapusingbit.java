import java.lang.*;


public class Swapusingbit {

    public static void main(String[]args){

        // Here Swapping using Xor operation(Bitwise operator) Without using third variable
        int a=50;
        int b=20;

        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a);
        System.out.println(b);



    }
}
