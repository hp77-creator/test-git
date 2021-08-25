import java.applet.*;
import java.awt.*;
/*<applet code="tt1" height=120 width=120>
</applet>*/
public class tt1 extends Applet
   {
  public void paint(Graphics g)
   {
   
	int x[]={50,220,50,220,50,20};
	int y[]={50,50,220,220,50,20};
	setBackground(Color.blue);
        int number=5;
	g.fillPolygon(x,y,number);
   }
  }	