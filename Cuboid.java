// Finding the volume and area of the cuboid

import java.util.*;
import java.lang.*;

public class Cuboid {

    public static void main(String[]args){

        int length,breadth,height;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length,breadth and height of cuboid ");
        length=sc.nextInt();
        breadth=sc.nextInt();
        height=sc.nextInt();

        // formula for area front&back,right&left,top&bottom

        int area=2*((length*breadth)+(breadth*height)+(length*height));

        System.out.println("The area of the cuboid is "+area);

        // Finding the volume of the cuboid

        int volume =length*breadth*height;
        System.out.println("The volume of the cuboid is "+volume);

    }
}
