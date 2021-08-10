import java.lang.*;

public class RotationOfArray {

    // to left rotate the array
    public static void main(String[] args) {

//        int []arr={5,9,6,10,12,7,3,5,4,2};
//        int temp=arr[0];
//        int i;
//        for(i=0;i<=arr.length-2;i++){
//
//            arr[i]=arr[i+1];
//
//        }
//        arr[i]=temp;
//
//
//        for(int x:arr){
//            System.out.print(x+" ");
//        }
//

        // Program to right rotate an array

        int []arr={13,15,17,19,21,23,4,4,3,2};

        int temp=arr[arr.length-1];
        int i;
        for(i=arr.length-2;i>=1;i--){

            arr[i+1]=arr[i];
        }
        arr[i+1]=arr[0];
        arr[0]=temp;
for(int x:arr){

    System.out.print(x+" ");
}

    }

}
