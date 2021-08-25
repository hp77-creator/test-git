//WRITE A JAVA PROGRAM TO PRINT FIRST 25 FIBONACCI NUMBERS

import java.io.*;

class p7
 {
 public static void main(String args[])
   {

   long last=1,next=0,sum=0;

   System.out.println("The first 25 fibonacci numbers are ");

   int i=0;

    while(i<25)
      {
      sum=last+next;
      System.out.print("\t"+sum);
      last=next;
      next=sum;
      i++;
      }
    }
}
