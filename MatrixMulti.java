import java.lang.*;

public class MatrixMulti {

    public static void main(String[] args) {

        // Matrix Multiplication of two dimensional array

        int[][]arr=new int[][]{{1,2,3},{4,5,6},{7,8,9}} ;

        int[][]arr2=new int[][]{{10,11,12},{13,14,15},{16,17,18}};

        int[][] c=new int[3][3];

        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr[i].length;j++){
                int sum=0;

                for(int k=0;k<arr[j].length;k++){

                    sum+=arr[i][k]*arr2[k][j];
                }
                c[i][j]=sum;
            }
        }

        System.out.println("The multiplication matrix is");
        for(int []x:c){

            for(int y:x){
                System.out.format("%03d ",y);
            }

            System.out.println();
        }
    }
}
