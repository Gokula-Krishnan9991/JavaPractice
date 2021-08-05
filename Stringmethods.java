import java.lang.*;

public class Stringmethods {

    public static void main(String[] args) {

       String str=new String("I am Learning java") ;
       // to Lowercase
       str.toLowerCase();
        System.out.println(str);// Immutable

        // To Uppercase
        String str2="i am learning java";
        str2=str2.toUpperCase();
        System.out.println(str2);

        // trimming
        String str3="                         I am learning java";
        System.out.println(str3.trim());
        String str4="I am learning Java for the  past 10 days";
       int length=str4.length();
        System.out.println(length);

        str4=str4.substring(23);
        System.out.println(str4);

        System.out.println(str4.length());

        String str5="Hello this is gokul";
        System.out.println(str5.substring(0,5));


        String str6="Hello this is gokul";
        System.out.println(str6.replace('i','Y'));










// startsWith(String)

        // startsWith(String,index)
        String s1="www.freeCodeCamp.org";
        System.out.println(s1.startsWith("www"));

// startsWith(String,index)

        System.out.println(s1.startsWith("free",4));

        //charAt(int index)
        System.out.println(s1.charAt(8));

        //IndexOf(String s)

        System.out.println(s1.indexOf("."));

        // IndexOf(String s,int starting index)

        System.out.println(s1.indexOf("org",4));

        // LastIndexOf(String s)

        System.out.println(s1.lastIndexOf('.'));

        // LastIndexOf(String s,int indexOf)

        System.out.println(s1.lastIndexOf("free",15));

        // equals
        String a1="java is a high level programming language";
        String a2="JAVA IS A HIGH LEVEL PROGRAMMING LANGUAGE";
        System.out.println(a1.equals(a2));

        // equalsIgnoreCase
        System.out.println(a1.equalsIgnoreCase(a2));

        // CompareTo
        String a3="Gokula Krishnan";
        String a4="Gokula KrishnaN";
        System.out.println(a4.compareTo(a3));



        // Difference between equals and ==

        // equals compare only contents of the literals
        // But == compares reference of .
        //example

        // Here both contents are equal
        // and also two reference pointing to same string constant pool
        // so it returns true for both equals and ==
        String a5="Gokula Krishnan S";
        String a6="Gokula Krishnan S";
        System.out.println(a5.equals(a6));//content comparison
        System.out.println(a5==a6);// reference comparison

        String a7=new String("Gokula Krishnan S");// Here new object is created in heap but different object reference so == returns false

        System.out.println(a7.equals(a6));// content same

        System.out.println(a6==a7);// reference will be different  so it returns false

        System.out.println(String.valueOf(189));
    }
}
