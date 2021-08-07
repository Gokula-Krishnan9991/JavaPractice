// To check the radix of the given number


// We can alter the code because if we give the number in the range 0-9
// in the range 0-9 it can be octal, decimal ,and also hexadecimal
// According to that condition must be change


import java.lang.*;
import java.util.Scanner;

public class Radix {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        String radix =sc.nextLine();

        //decimal
        if(radix.matches("[10]+"))
        {
            System.out.println("It is radix 2");
        }
        //
        else if(radix.matches("[0-7]+"))
        {
            System.out.println("It is radix 8");
        }

        else if(radix.matches("[0-9]+")){
            System.out.println("It is radix 10");
        }

        else{

            System.out.println("It is radix 16");
        }
    }
}
