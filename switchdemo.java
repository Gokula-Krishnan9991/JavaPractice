import java.lang.*;
import java.util.*;
public class switchdemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str=scanner.nextLine();
        String type =str.substring(str.lastIndexOf(".")+1);
        switch(type){
            case "com":System.out.println("commercial website");
            break;
            case "org":System.out.println("organizational website");
            break;
            case "net":System.out.println("Networking website");
            break;
            case "edu":System.out.println("Educational Website");
            break;
            case "gov":System.out.println("Government website");
            break;
            default:
                System.out.println("Other type of website");
                break;


        }
    }
}
