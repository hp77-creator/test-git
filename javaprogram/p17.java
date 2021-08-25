import java.io.*;
import java.math.*;
class p17
  {
 public static void main(String args[])
   { 
 double fsin,fcos,ftan; 
 int sin,cos,tan;
 if(args.length==0) 
   {
   System.out.println("error"); 
   System.exit(0);
   }
  int x=Integer.parseInt(args[0]);
  fsin=Math.sin(x);
  fcos=Math.cos(x);
  ftan=Math.tan(x);
  System.out.println("sin="+fsin);
  System.out.println("cos="+fcos);
  System.out.println("tan="+ftan);
  }
}
