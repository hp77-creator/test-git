//THIS APPLET ILLUSTRATE HOW NESTED PANELS CAN BE USED TO CREATE A GRAPHICAL USER INTERFACE
//THE TOP OF THE DISPLAY AREA CONTAINS THREE CHECKBOX LABELED RED,GREEN,BLUE. THE CENTRE OF 
//THE DISPLAY AREA CONTAINS SIX BUTTONS LABELED "BUTTON0" THROUGH "BUTTON5" THAT ARE ARRANGED IN //GRID THREEROWS AND TWOCOLUMNS. THE BOTTOM OF THE DISPLAY AREA CONTAINS A LABEL.

import java.awt.*;
import java.applet.*;
/*<applet code="p34" height=500 width=500>
</applet>*/

public class p34 extends Applet
   {
   public void init()
	{
	try
	  {
	  setBackground(Color.black);
	  setForeground(Color.white);
	  setFont(new Font("TimesRoman",Font.PLAIN,20));	
	  setLayout(new BorderLayout());
	  Panel pn=new Panel();
	  Checkbox cb1=new Checkbox("Red",true);
	  pn.add(cb1);
	  Checkbox cb2=new Checkbox("Green",false);
	  pn.add(cb2);
	  Checkbox cb3=new Checkbox("Blue",false);
	  pn.add(cb3);
	  add(pn,"North");
	  Panel pc = new Panel();
	  pc.setLayout(new GridLayout(3,2));
	  for (int i=0;i<6;i++)
            {
	    pc.add(new Button("Button "+i));
	    }
	  add(pc,"Center");
	  Panel ps=new Panel();
	  Label lab=new Label("This is the South Panel");
	  ps.add(lab);
	  add(ps,"South");
	  }
	  catch(Exception e)
	    {
	  e.printStackTrace();
	    }
	  }
   }
	  
	  