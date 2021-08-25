import java.awt.*;
import java.applet.Applet;
/*<applet code="appletlifedemo.class" height=500 width=400>
</applet>*/
public class appletlifedemo extends Applet
  {
  int init_count=0;
  int start_count=0;
  int stop_count=0;
  int destroy_count=0;

  public void paint(Graphics g)
     {
     g.setColor(Color.pink);
     g.fillRect(0,0,size().width,size().height);
     g.setColor(Color.red);
     g.drawLine(120,20,120,220);
     g.drawLine(120,220,300,220);
     g.setColor(Color.red);
     g.drawString(" Init Method() ",5,50);
     g.drawString(" Start Method() ",5,100);
     g.drawString(" Stop Method() ",5,150);
     g.drawString(" Destroy Method() ",5,200);
     g.setColor(Color.green);
     for(int x=(120+25);x<300;x+=25)
        {
        g.drawLine(x,20,x,199);
        }
     g.setColor(Color.black);
     g.fillRect(120,30,init_count*25,40);
     g.fillRect(120,80,start_count*25,40);
     g.fillRect(120,130,stop_count*25,40);
     g.fillRect(120,180,destroy_count*25,40);
   }
   public void init()
     {
     init_count++;
     System.out.println("Init method activated");
     repaint();
     }
   public void stop()
     {
     stop_count++;
     System.out.println("Stop method activated");
     repaint();
     }
   public void destroy()
     {
     destroy_count++;
     System.out.println("Destroy method activated");
     repaint();
     }
   public void start()
     {
     start_count++;
     System.out.println("Start method activated");
     repaint();
     }
  }
