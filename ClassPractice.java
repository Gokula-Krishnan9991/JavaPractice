class Rectangle{

    public double length;
    public double breadth;

    public double area(){
     return length*breadth;
    }

    public double perimeter()
    {
return 2*(length+breadth);
    }

    public boolean isSquare(){

     return length==breadth;
    }
}

public class ClassPractice {

    public static void main(String[] args) {

        Rectangle r=new Rectangle();
        r.length=100;
        r.breadth=100;

        Rectangle r1=new Rectangle();
        r1.length=50;
        r1.breadth=20;

        System.out.println(r.area());
        System.out.println(r.perimeter());
        System.out.println(r.isSquare());


        System.out.println(r1.area());
        System.out.println(r1.perimeter());
        System.out.println(r1.isSquare());
    }
}
