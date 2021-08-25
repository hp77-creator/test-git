//WRITE A JAVA PROGRAM TO FIND THE POWER
import java.io.*;

class p5
 {
 public static void main(String args[])
    {
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    int x=0,y=0,pow=1;
    try
    {
    System.out.println("enter the calue of x");
    x=Integer.parseInt(br.readLine());
    System.out.println("enter the value of y"); 
    y=Integer.parseInt(br.readLine());
    }
    catch(IOException e)
     {
     System.out.println("Cannot read :"+e);
     }
    for(int i=1; i<=y; i++)
     pow*=x;
     System.out.println(x+" raised to "+y+" = "+pow);
    }
}