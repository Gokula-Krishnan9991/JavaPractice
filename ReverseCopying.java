import java.lang.*;
public class ReverseCopying {
    // Program to copy the elements in the array in the reverse order
    public static void main(String[] args) {

        int[]arr ={1,2,3,4,5,6,7,8,9,10};

        int[]arr2=new int[10];

        for(int i=arr.length-1,j=0;i>=0;i--,j++){

            arr2[j]=arr[i];
        }

        for(int x:arr2){

            System.out.print(x+" ");
        }
    }
}
