import  java.lang.*;
public class Args
{


public static void main(String ...args)
{

double s=0;

for(String k:args)
{

if(k.matches("[0-9\\.]+"))

s+=Double.parseDouble(k);

else

System.out.println("Sorry exception arise");

}

System.out.println(s);

}
}
