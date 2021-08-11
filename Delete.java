import java.lang.*;
import java.util.*;

public class Delete {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int []arr=new int[5];
        arr[0]=1;
        arr[1]=2;arr[2]=3;arr[3]=4;arr[4]=5;

        System.out.println("Enter the element that you need to delete");
        int a=sc.nextInt();
int i;
        for(i=0;i<arr.length;i++) {
            if (arr[i] == a) {
                break;
            }
        }
        for(int j=i;j<arr.length-1;j++){
            arr[j]=arr[j+1];
        }
        int n =arr.length-1;
        for(int z=0;z<n;z++){

            System.out.print(arr[z]+" ");
        }
    }
}
