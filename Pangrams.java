import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
        String input=scan.nextLine();
        String output="";
        int count=0,ascii;
        char ch;
        String c;
        for(int i=0;i<input.length();i++)
            {
            ch=input.charAt(i);
            ascii=(int)ch;
            if(ascii>=65 && ascii<=90)
                {
                ascii+=32;
                ch=(char) ascii;
            }
            else if(ascii>=97 && ascii<=122)
                {
                ascii-=32;
                ch=(char) ascii;
            }
            c=input.charAt(i)+"";
            if(!output.contains(c) && c!=" " && !output.contains(ch+""))
                {
                output+=c;
                count++;
            }
           
                
        }
         if(count>26)
                System.out.println("pangram");
            else
                System.out.println("not pangram");
    }
}
