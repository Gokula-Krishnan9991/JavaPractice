import java.lang.*;
public class StringmethodsChallenge {
    public static void main(String[] args) {

        // Finding out if the email id is on gmail

        //Find username and domain name from email

        String s="HelloWorld@gmail.com";



        int z =s.lastIndexOf('@');
        System.out.println("User name is "+s.substring(0,s.lastIndexOf('@')));
        System.out.println("Domain name is "+s.substring(z+1));

        String str=s.substring(z+1);
        //System.out.println(str);

        System.out.println("Is it equals to gmail.com ..?" +" Answer is "+str.equals("gmail.com"));




        //System.out.println(str);

// Alternate method found in udemy comment section in Abdul bari sir java course
        // good approach

//        String p[]=s.split("@");
//
//        System.out.println(p[0]);
//        System.out.println(p[1]);
//
//        System.out.println(p[1].startsWith("gmail"));
    }
}
