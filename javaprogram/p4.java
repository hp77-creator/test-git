//WRITE A JAVA PROGRAM THAT ACCEPT THE NUMBER AND PRINT THE FACTORIAL OF IT.
import java.io.*;

class p4
 {
 public static void main(String args[])
    {
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    int n=0,i=0,fact=1;
    try
    {
    System.out.println("enter the number");
    n=Integer.parseInt(br.readLine());
    }
    
    catch(IOException e)
     {
     System.out.println("Cannot read :"+e);
     }
    for(i=n; i>0; i--)
       fact*=i;
    System.out.println("the factorial of "+n+" = "+fact);

  }
}