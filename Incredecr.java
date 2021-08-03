import java.lang.*;
public class Incredecr {

    public static void main(String[]args){

        int a=5;
        //Post increment
        //a++;
        //System.out.println(a);

//   preincrement
        int b=6;
        //System.out.println(++b);

        //First the value is assigned then the increment is done
        int c=b;
        //System.out.println(c +" "+b);


        int d= 5*a++ + 4/2* ++b;
        System.out.println(d);
        System.out.println(a);

        // Except boolean all data type performs increment and decrement

        short s=50;
        //s=s+1 is not invalid because 1 is a integer type data s++ is valid
        // or
        // s=s++ is valid
        s=s++;
        System.out.println(s);


    }
}
