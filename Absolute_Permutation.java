/*We define  to be a permutation of the first N natural numbers in the range [1,N]. Let  denote the position of i in permutation P (please use -based indexing).

P is considered to be an absolute permutation if  holds true for every .

Given N and K, print the lexicographically smallest absolute permutation, ; if no absolute permutation exists, print -1.

Input Format

The first line of input contains a single integer, T, denoting the number of test cases. 
Each of the T subsequent lines contains 2 space-separated integers describing the respective N  and  K values for a test case.

Output Format

On a new line for each test case, print the lexicographically smallest absolute permutation; if no absolute permutation exists, print -1.import java.io.*;
*/

import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Absolute_Permutation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
              if(n%2!=0 && k!=0)
                {
                System.out.println("-1");
            }
           
            else
                {
            int t1,c=0;
            int[] temp=new int[n+1];
            int[] in1=new int[n+1];
            for(int i=1;i<=n;i++)
                {
                temp[i]=0;
            }
            for(int i=1;i<=n;i++)
                {
                in1[i]=i;
            }
           
            for(int i=1;i<=n;i++)
                {
                
                if(temp[i]==0 && (i+k)<=n)
                    {
                    t1=in1[i];
                    in1[i]=in1[i+k];
                    in1[i+k]=t1;
                    temp[i]=1;
                    temp[i+k]=1;
                    c+=2;
                }
                
            }
                if(c==n || k==0)
                {
             for(int i=1;i<=n;i++)
                {
                System.out.print(in1[i]+" ");
                }  
                 System.out.println();
                }
                else
                {
                    System.out.println("-1");
                }
        }
        }
    }
}
