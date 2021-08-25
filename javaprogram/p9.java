//WRITE A JAVA PROGRAM TO PRINT FOLLOWING KIND OF OUTPUT
// 1			1
// 22			12
// 333			123
// 4444			1234
// -----		-----
// nnnnnn		nnnnnn
  
import java.io.*;
class p9
 {
 public static void main(String args[])
   {
   int i=0,j=0,n=0;
   n=Integer.parseInt(args[0]);
   for(i=1; i<=n; i++)
     {
      for(j=1;j<=i;j++)
        {
       System.out.print(i);
        }
     System.out.print("\n");
     }
   

for(i=1; i<=n; i++)
     {
     System.out.print("\n");
     for(j=1;j<=i;j++)
        {
       System.out.print(j);
        }
     }


   }  
 }