import java.lang.*;

// To perform bitwise operations

public class Bitwise {

    public static void main(String[] args) {
        int x=0b1010;//binary form of 10
        int y=0b1100;// binary form of 12

        //And operation
        int c=x&y;
        System.out.println(c);

        // Or operation |
        int a=0b11000;
        int b=0b01100;
        int d=a|b;
        System.out.println(d);


        // left shift
        // formula n*2^(shift count)
        int e=0b010000;
        int f=e<<1;
        // For viewing the output in binary format this method is useful
        System.out.println(String.format("%s",Integer.toBinaryString(e)));
        System.out.println(String.format("%s",Integer.toBinaryString(f)));

        //Right shift
        // Formula n/(2^(shift count)
        int g=0b010000;
        int h=g>>1;
        System.out.println(h);


        // Signed right shift
        // It results signed (MSB) is always 1 indicating negative value
        int i=-0b010000;
        int j=i>>1;
        System.out.println(String.format("%s",Integer.toBinaryString(i)));
        System.out.println(String.format("%s",Integer.toBinaryString(j)));

        // Unsigned right shift
        // In Unsigned right MSB is 0 indicating positive value
        int k=-0b010000;
        int l=i>>>1;
        System.out.println(String.format("%s",Integer.toBinaryString(k)));
        System.out.println(String.format("%32s",Integer.toBinaryString(l)));

        // Not operator
        int m=0b01110;
        int n=~m;
        System.out.println(String.format("%s",Integer.toBinaryString(n)));
        System.out.println(n);

    }
}
