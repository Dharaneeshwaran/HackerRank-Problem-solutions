import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            int n = in.nextInt();
            int q[] = new int[n+1];
            int count[]=new int[n+1];
            int initial[]=new int[n+1];
            int temp,j,c=0,k,x,maxcount=0;
            for(int q_i=1; q_i <= n; q_i++){
                q[q_i] = in.nextInt();
                initial[q_i]=q_i;
                count[q_i]=0;
            }
            for(int i=1;i<=n;i++)
                {
                if(q[i]!=initial[i])
                    {
                    if(q[i+1]==initial[i])
                        {
                        temp=q[i+1];
                        q[i+1]=q[i];
                        q[i]=temp;
                        x=q[i+1];
                        count[x]++;
                        //System.out.println("Inter count:"+x+":::"+count[x]);
                        if(count[x]>maxcount)
                        maxcount=count[x];
                        c++;
                    }
                    else
                        {
                        j=i+1;
                        k=j+1;
                        if(q[k]==initial[i])
                            {
                            
                            temp=q[k];
                            q[k]=q[j];
                            q[j]=temp;
                            x=q[k];
                            count[x]++;
                              //System.out.println("Inter count:"+x+":::"+count[x]);
                            if(count[x]>maxcount)
                             maxcount=count[x];
                            i--;
                            c++;
                        }
                        else
                            {
                            k++;
                            while(q[k]!=initial[i] && k<=n)
                                {
                                k++;
                            }
                            if(q[k]==initial[i])
                            {
                            temp=q[k];
                            q[k]=q[k-1];
                            q[k-1]=temp;
                            x=q[k];
                            count[x]++;
                                 // System.out.println("Inter count:"+x+":::"+count[x]);
                            if(count[x]>maxcount)
                            maxcount=count[x];
                            i--;
                            c++;
                        }
                        }
                    }
                }
            }
           
           if(maxcount>2) 
               System.out.println("Too chaotic");
            else
                System.out.println(c);
            
        }
    }
}
