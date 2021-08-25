//WRITE A JAVA PROGRAM TO PRINT FIRST 25 PRIME NUMBERS
import java.io.*;
class p8
 {
 public static void main(String args[])
   {
   int j=0,x=0,i=0,n=1;
   
   System.out.println("The first 25 prime numbers are"); 
   while(i<25)
    { 
     for(j=2;j<n;j++)
        {
      x=0;
      if(n%j==0)
          {
           x=1;
           break;
	  }
      
        } 
      if(x!=1)
	{
        System.out.print("\t"+n);
        i++;
	}
      n++;
	
    }
   }
 }