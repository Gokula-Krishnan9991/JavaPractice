import java.lang.*;
public class TwoDArrayAdd {

    public static void main(String[] args) {

        int [][]a;
        int [][]b;
        a=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        b=new int[][]{{10,11,12},{13,14,15},{16,17,18}};
        int [][]c=new int[3][3];
        for(int i=0;i<a.length;i++){

            for(int j=0;j<a.length;j++){

             c[i][j]=a[i][j]+b[i][j];
            }
        }

        for(int[] x:c){

            for(int y:x){

                System.out.print(y+" ");
            }
            System.out.println("");
        }
    }
}
