//WRITE A JAVA PROGRAM THAT WILL DISPLAY THE SUM OF 1+1/2+1/3+-----+1/n
import java.io.*;
class p6
 {
 public static void main(String args[])
    {
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    int n=0,y=0;
    float sum=0;
    try
    {
    System.out.println("enter the value of n");
    n=Integer.parseInt(br.readLine());
    }
    catch(IOException e)
     {
     System.out.println("Cannot read :"+e);
     }

   for(int i=1;i<=n;i++)
     sum+=(1/(float)i); 
   System.out.println("the sum ="+sum);
   }
}
