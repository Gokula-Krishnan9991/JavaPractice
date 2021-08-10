import java.lang.*;
import java.util.*;

public class Insert {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int[] arr = new int[10];
        arr[0]=5;
        arr[1]=3;
        arr[2]=2;
        arr[3]=4;
        arr[4]=8;
        arr[5]=10;

        for(int x:arr){

            System.out.print(x+" ");
        }

        System.out.println(arr.length);
        System.out.println("Enter the index that you want to insert the element");
        int a=sc.nextInt();

        System.out.println("Enter the element ");
        int b =sc.nextInt();

        int n =6;

        for(int i=n;i>a;i--)
            arr[i]=arr[i-1];
arr[a]=b;

        for (int j : arr) {

            System.out.print(j + " ");
        }
    }
}
