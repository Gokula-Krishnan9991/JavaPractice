import java.lang.*;
import java.util.*;
public class Searching {

    public static void main(String[] args) {

        // For searching the elements must be unique
        int []arr={3,9,7,8,12,6,15,5,4,10};

        System.out.println("Enter the element that you want to search");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        for (int i=0;i<arr.length;i++) {

            if (arr[i] == a) {

                System.out.println("found at position "+i);
                System.exit(0);
            }
        }
        System.out.println("Not found");
    }
}
