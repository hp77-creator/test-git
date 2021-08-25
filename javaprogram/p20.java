import java.io.*;

class circle
  {
  double x,y,radius;
  circle(double radius)
	{
	this.radius=radius;
	}

  circle(double x, double y, double radius)
	{
	this.x=x;
	this.y=y;
	this.radius=radius;
	}
  }

class p20
   {
  public static void main(String args[])
	{
	circle c1=new circle(12.00);
	circle c2=new circle(20.00,25.00,44.30);
	System.out.println("\n");
	
	System.out.println("\t For object c1 : ");

	System.out.println("\t c1.x = "+c1.x);
	System.out.println("\t c1.y = "+c1.y);
	System.out.println("\t c1.radius = "+c1.radius);
	System.out.println("\n");

	System.out.println("\t For object c2 : ");

	System.out.println("\t c2.x = "+c2.x);
	System.out.println("\t c2.y = "+c2.y);
	System.out.println("\t c2.radius = "+c2.radius);
	}
   }
 	