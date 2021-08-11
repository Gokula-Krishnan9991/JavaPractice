public class ArrayIncrease {


    public static void main(String[] args) {


        int []arr={8,6,10,9,2};
        int []arr2=new int[10];
        int i=0;

        for(int x:arr){

            arr2[i]=x;
            i++;
        }
        // arr elements will go to the garbage collector
        arr=arr2;

        arr2=null;

        for(int x:arr){
            System.out.print(x+" ");
        }
    }


}
