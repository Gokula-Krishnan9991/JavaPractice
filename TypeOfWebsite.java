
import java.lang.*;
import java.util.*;

public class TypeOfWebsite {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();
        String protocol=s.substring(0,s.indexOf(":"));

        System.out.println(protocol);

        String type=s.substring(s.lastIndexOf(".")+1,(s.length()-1));

        System.out.println(type);
        if(protocol.equals("http")){
          System.out.println("It is Hyper text Transfer Protocol");
        }

        else if(protocol.equals("ftp")){
            System.out.println("It is a File Transfer Protocol");
        }
else if(protocol.equals("https")){
    System.out.println("It is a Hyper Text Transfer Protocol Secure");
        }
else{

    System.out.println("It is invalid protocol");
        }

if(type.equals("com")){

    System.out.println("Commercial website");
}

else if(type.equals("org")){

    System.out.println("Organizational website");
}

else if(type.equals("net")){

    System.out.println("network Website");
}
    }
}



