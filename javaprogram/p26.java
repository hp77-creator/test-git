//CREATE A CIRCLE ON THE CENTRE OF THE APPLET AND FILL COLOR WITH MAGENTA

import java.awt.*;
import java.applet.*;

/*<applet code="p26" height=300 width=300>
</applet>*/

class canvasdemo extends Canvas
  {
 public void paint(Graphics g)
    {
    Dimension d=getSize();
    int x=d.width/2;
    int y=d.height/2;
    int r=(int)((d.width<d.height) ? 0.3 * d.width : 0.3 * d.height);
    g.setColor(Color.blue);    
    g.drawOval(x-r/2,y-r/2,r,r);
    g.setColor(Color.magenta);    
    g.fillOval(x-r/2+1,y-r/2+1,r-1,r-1);
    }
  }
public class p26 extends Applet
  {
  public void init()
    {
    setBackground(Color.white);
    canvasdemo cnd= new canvasdemo();
    cnd.setSize(300,300);
    add(cnd);
    }
  }