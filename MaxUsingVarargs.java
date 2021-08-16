import java.lang.*;
public class MaxUsingVarargs {


    static int max(int ...m){

        if(m.length==0)return Integer.MIN_VALUE;
        int maxi=m[0];
        for(int i=1;i<m.length;i++)
        {

            if(m[i]>maxi)
                maxi =m[i];
        }

        return maxi;
    }
    public static void main(String... args) {

        int a=max(1,10,20,40,2,50);
        System.out.println(a);

    }
}
