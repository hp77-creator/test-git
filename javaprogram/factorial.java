import java.awt.*;
import java.applet.*;
/*<applet code="factorial" height=300 width=300>
</applet>*/
public class factorial extends Applet
   {
  public void paint(Graphics g)
    {
    int number=5;
    int factorial=1;
    for(int i=number; i>0; i--)
       {
       factorial=factorial*i;
       }
    String num="Factorial of 5 is : "+String.valueOf(factorial);
    g.drawString(num,20,50);
    }
   }
  