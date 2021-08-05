public class Format {

    public static void main(String[]args){
        int x=10;
        float y=30.53f;
        char z='B';
        String s="I am learning java";

        //conversion
        //System.out.printf("%d %f %c %s \n",x,y,z,s);
        //argumental index
        System.out.printf("%1$d %2$c %3$f \n",x,z,y);

        System.out.printf("%e",y);
        System.out.printf("%010d",x);

    }


}
