import java.io.*;
class p16
   {
  public static void main(String args[])
     {
       try
       {
     double fno=Double.parseDouble(args[0]);
     double sno=Double.parseDouble(args[1]);
     double res=fno*sno;
     System.out.println("\t the first no is "+fno);
     System.out.println("\t the second no is "+sno);		
     System.out.println("\t the result(fno * sno) is: "+res);
       }
     catch(Exception e)
       {
     System.out.println(e);
     }
   }
} 	
