import java.lang.*;
import java.util.*;

public class Overload {


    static double area(double a,double b){

        return a*b;
    }
    static double area(double radius){

        return (Math.PI*radius*radius);
    }

    static double area(double a,double b,double height){

        return ((a+b)/2)*(height);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the breadth and height of the rectangle ");

        double a=sc.nextDouble(),b =sc.nextDouble();

        double c =area(a,b);
        System.out.println("The area of the rectangle is "+c);

        System.out.println("Enter the radius of the circle ");

        double r=sc.nextDouble();
        double d=area(r);

        System.out.println("The radius of the circle is "+d);

        System.out.println("Enter the sides of the trapezium and height");
        double e  = sc.nextDouble(),f =sc.nextDouble();
        double g =sc.nextDouble();

        double h =area(e,f,g);

        System.out.println("The area of the trapezium is "+h);


    }
}
