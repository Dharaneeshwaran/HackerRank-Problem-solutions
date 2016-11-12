
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] input=new int[n];
        int max=0,count;
        for(int i=0;i<n;i++)
            {
            input[i]=scan.nextInt();
        }
        for(int i=0;i<n-1;i++)
            {
            count=1;
            for(int j=i+1;j<n;j++)
                {
                if(input[i]==input[j])
                    count++;
            }
            if(count>max)
                max=count;
        }
        System.out.println(n-max);
    }
}
