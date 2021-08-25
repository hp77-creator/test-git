//WRITE A JAVA PROGRAM THAT ACCEPT THE TWO NUMBER AND PRINT THE SUM
import java.io.*;

class p3
 {
 public static void main(String args[])
    {
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    int n1=0,n2=0,sum=0;
    try
    {
    System.out.println("enter first number");
    n1=Integer.parseInt(br.readLine());
    System.out.println("enter second number"); 
    n2=Integer.parseInt(br.readLine());
    }
    catch(IOException e)
     {
     System.out.println("Cannot read :"+e);
     }
    sum=n1+n2;  
    System.out.println("the sum of two number is "+sum);
    }
 }