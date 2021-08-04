import java.lang.*;
public class bitMaskingDemo {

    // Here storing the two numbers in the same dataype and retrieving them using Bitmasking
    public static void main(String[]args){


        byte b1=15;
        byte b2=12;
        byte b3;
        b3=(byte)(b1<<4);// first we store 15 in left side
       b3=(byte)(b3|b2);// then we store 12 in right side by performing OR .Now we have both values stored in same type // Merging

        // For retrieving we perform AND operation

        // First we retrieve 15
        // for that we perform AND operation by assigning first 4 bit as 1
        //for example 11110000 and performing right shift by 4


        System.out.println((b3&0b11110000)>>4);// Now we retrieved 15

        // for retrieving 12
        // we perform 00001111 and AND operation to get 12
        System.out.println((b3&0b00001111));// Now we retrieved 12




    }
}
