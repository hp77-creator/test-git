import java.io.*;
class p2a
  {
  public static void main(String args[])
   {
  final float pi=3.14f;
  DataInputStream ds=new DataInputStream(System.in);
  int radius;
  double area;
  try
   {
  System.out.println("enter the radius");
  radius=Integer.parseInt(ds.readLine());
  area=pi*radius*radius;
  System.out.println("ares of circle="+area);
   }
  catch(Exception e)
   {
  System.out.println(e);
   }
  }
}
