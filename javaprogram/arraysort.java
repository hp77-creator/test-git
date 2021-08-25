import java.io.*;
import java.awt.*;
import java.applet.*;
/*<applet code="arraysort.class" height=500 width=500>
</applet>*/
public class arraysort extends Applet
	{
	int z[]={87,65,54,78,43,21};
 	int xpos=20;
        
	public void paints(Graphics g)
		{
		g.drawString("The original series is :",25,10);
		for(int i=0; i<z.length;i++)
  			{
			xpos+=50;
			g.drawString(z[i]+" ",xpos,30);
			}
		
		sort(z,g);
		}
 	public void sort(int x[],Graphics e)
	{
	int swap;
	xpos=20; 
	int a=x.length;
	for( int i=0; i<(a-1); i++)
		{
		for( int j=i+1; j<a; j++)
			{
			if(x[i]>x[j])
			  {
			  swap=x[i];
			  x[i]=x[j];
			  x[j]=swap;
			  }
			}
		}

	e.drawString("the sorted series id : ",25,60);
	for(int i=0;i<a;i++)
		{
		xpos+=50;
		e.drawString(x[i]+" ",xpos,80);
		}
	}
  }







			