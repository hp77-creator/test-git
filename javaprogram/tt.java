import java.applet.*;
import java.awt.*;
/*<applet code="tt" height=120 width=120>
</applet>*/
public class tt extends Applet
   {
  public void paint(Graphics g)
   {
   Dimension d=getSize();
	int x=d.width/2;
	int y=d.height/2;
	g.setColor(Color.magenta);
	int r=50;
	g.fillOval(x-50,y-50,2*r,2*r);
   }
  }	