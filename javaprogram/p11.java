//WRITE A JAVA PROGRAM THAT WILL ACCEPT THE COMMANDLINE ARGUMENT AND
//DISPLAY THE SAME

import java.io.*;
class p11
 {
 public static void main(String args[])
   {
   int n=0,i=0;
   n=args.length;
   for(i=0;i<n;i++)
     {
     System.out.print(args[i]);
     System.out.print(" ");
     }
   }
}  