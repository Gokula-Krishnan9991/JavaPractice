import java.lang.*;
import java.util.*;

//Program to find the area of a triangle

public class Area {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the breadth of the triangle");
        int a=sc.nextInt();

        System.out.println("Enter the height of the triangle");
        int b =sc.nextInt();

        // To find the area of the triangle
        float area=(a*b)/2f;
        System.out.println("The area of the triangle is "+area);

        //Area of the triangle using sides

        int sideA ,sideB ,sideC;
        System.out.println("Enter the sideA,sideB,sideC");
        sideA=sc.nextInt();
        sideB=sc.nextInt();
        sideC=sc.nextInt();

        float s=(sideA+sideB+sideC)/2f;


        double areaUsides=Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));

        System.out.println("Area using sides is "+areaUsides);






    }
}
