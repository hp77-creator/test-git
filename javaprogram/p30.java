//WRITE AN APPLET TAHT SETS THE BACKGROUND COLOR IS CYAN AND DRAWS A CIRCLE 
//OF RADIUS 50 PIXELS CENTERED IN THE MIDDLE OF THE APPLET. THE DIMENSIONS
//OF THE APPLET SHOULD BE 120 * 120 PIXEL. FILL THE CIRCLE WITH MEGENTA COLOR 

import java.awt.*;
import java.applet.*;

/*<applet code="p30" height=200 width=200>
</applet>*/

public class p30 extends Applet
   {
   
   public void paint(Graphics g)
      {
      setBackground(Color.white);
      Dimension d=getSize();
      int x=d.width/2;
      int y=d.height/2;
      g.setColor(Color.magenta);
      int r=25;
      g.fillOval(x-r,y-r,2*r,2*r);
      }
   }
 	