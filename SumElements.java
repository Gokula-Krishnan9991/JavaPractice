import java.lang.*;

// finding the sum of the elements in the array
public class SumElements {

    public static void main(String[] args) {

        int []arr={3,9,7,8,12,6,15,5,4,10};

        int sum=0;
        for (int j : arr) {

            sum += j;
        }
        System.out.println(sum);
    }
}
