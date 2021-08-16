import java.lang.*;
public class varargs {

//program for practicising var-args method
    public  static void show(int b,int ...a)
    {

        System.out.println(b);
        for(int x:a)
            System.out.println(x);

    }
    public static void main(String ... args) {

        show(50,2,4,5);


    }
}