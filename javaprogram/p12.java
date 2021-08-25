import java.io.*;

class p12
   {
   public static void main(String []args)
      {
      StringBuffer sb=new StringBuffer(" am happy");
      
      System.out.println("The original string of the buffer : " + sb);
      
      System.out.println("Character at the first position in string = " +sb.charAt(0));
      sb.insert(0,'I');
      
      System.out.println("The character 'I' inserted at the begining position : " + sb);
      }
   }			