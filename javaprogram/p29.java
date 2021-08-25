//CREATE AN APPLET THAT DRAW A POLYGON USING AN ARRAY

import java.awt.*;
import java.applet.*;
/*<applet code="p29" height=300 width=300>
</applet>*/

public class p29 extends Applet
   {
   public void paint(Graphics g)
      {
      int x[]={50,220,50,220,50};
      int y[]={50,50,220,220,50};
      setBackground(new Color(255,255,255));
      int number=4;
      g.fillPolygon(x,y,number);
      }
   }
  