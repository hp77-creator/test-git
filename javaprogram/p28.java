import java.applet.*;
import java.awt.*;

/*<applet code="p28" height=300 width=300>
</applet>*/


public class p28 extends Applet
  {
  Button btn[];
  String str[]={"1","2","3","4","5","6","7","8","9"};

  public void init()
    {
    setBackground(Color.cyan);
    setForeground(Color.white);
    setFont(new Font("TimesRoman",Font.BOLD,25));
    setLayout(new GridLayout(3,3));
    btn=new Button[str.length];

    for(int i=0;i<str.length; i++)
       {
       btn[i]=new Button(str[i]);
       add(btn[i]);
       }
    }
  }
 


