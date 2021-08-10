import java.lang.*;

public class MaximumElement {

    public static void main(String[] args) {
        int []arr={1,10,7,1,6};
//        int max=arr[0];
//
//        for(int i=1;i<arr.length;i++){
//
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
//System.out.println("The maximum element is "+max);

        int max1=arr[0];
        int max2=arr[0];

        for (int i=1;i<arr.length;i++) {

            if (arr[i]> max1) {

                max2=max1;
                max1 = arr[i];


            } else if (arr[i]> max2) {
                max2 = arr[i];


            }
        }
        System.out.println("The second largest element in the array is "+max2);
    }
}
