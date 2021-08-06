import java.lang.*;
public class RegexChallenge {

    public static void main(String[] args) {

        // to check whether the given number is binary or not
        String value="0B10100";
        System.out.println(value);

        //System.out.println(value2.matches("[abc]"));

        System.out.println(value.matches("[0][Bb][10]+"));


        // to check whether the given number matches whether the given number is hexadecimal or not
        String value2="0x23BZ";

        System.out.println(value2.matches("[0][xX][0-9A-Fa-f]+"));


        // to check the date ,month and year  format

        String value3="31/05/2020";
        System.out.println(value3.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));


        // Removing special characters from the string
        String value4="@!abc%&$456Alpha_+199";

        System.out.println(value4.replaceAll("[^a-zA-Z0-9]",""));


        // Removing extra spaces and occupy with single space

        String value5="    abc    def   gh  ";

        System.out.println(value5.replaceAll("\\s+"," ").trim());


        //To count no of words in the string using split method

        value5=value5.replaceAll("\\s+"," ").trim();


        String count[]=value5.split("\\s");

        System.out.println(count.length);




    }
}
