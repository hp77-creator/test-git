//WRITE A JAVA PROGRAM TO PRINT FOLLOWING KIND OF OUTPUT
// *
// **
// ***
// ****
// -----	
// ******
  
import java.io.*;

class p10
 {
 public static void main(String args[])
   {
   int i=0,j=0,n=0;
   n=Integer.parseInt(args[0]);
   for(i=1; i<=n; i++)
     {
      for(j=1;j<=i;j++)
        {
       System.out.print("*");
        }
     System.out.print("\n");
     }
   }
}