import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="p23" height=300 width=350></applet>*/

public class p23 extends Applet implements ItemListener
	{
	CheckboxGroup cbg;
	Checkbox c1,c2,c3,ra1,ra2,ra3;
	TextField t1,t2;	
	public void init()
	   {
	   setBackground(Color.orange);
	 //  setForeground(Color.red);

	   cbg=new CheckboxGroup();	

	   c1=new Checkbox("Checkbox : 1");
	   add(c1);

   	   c2=new Checkbox("Checkbox : 2");
	   add(c2);

   	   c3=new Checkbox("Checkbox : 3");
	   add(c3);

	   c1.addItemListener(this);		 	
	   c2.addItemListener(this);
	   c3.addItemListener(this);

	   ra1=new Checkbox("Radio : 1",cbg,false);
	   add(ra1);
	   ra1.addItemListener(this);

	   ra2=new Checkbox("Radio : 2",cbg,false);
	   add(ra2);
	   ra2.addItemListener(this);

	   ra3=new Checkbox("Radio : 3",cbg,false);
	   add(ra3);
	   ra3.addItemListener(this);

	   t1=new TextField(30);
	   add(t1);

	   t2=new TextField(30);
	   add(t2);
	   }

	public void itemStateChanged(ItemEvent ie)
	   {
	   if(c1.getState()==true && c2.getState()==false && c3.getState()==false)
		{
		t1.setText("Checkbox 1 selected ");
		}	
	   else if(c1.getState()==false && c2.getState()==true && c3.getState()==false)
		{
		t1.setText("Checkbox 2 selected ");
		}
	   else	if(c1.getState()==false && c2.getState()==false && c3.getState()==true)
		{
		t1.setText("Checkbox 3 selected ");
		}	
	   else if(c1.getState()==false && c2.getState()==false && c3.getState()==false)
		{
		t1.setText(" ");
		}
	   if(ra1.getState()==true && ra2.getState()==false && ra3.getState()==false)
		{
		t2.setText("Rdiobutton 1 selected ");
		}
	   else if(ra1.getState()==false && ra2.getState()==true && ra3.getState()==false)
		{
		t2.setText("Radiobutton 2 selected ");
		}
	   else if(ra1.getState()==false && ra2.getState()==false && ra3.getState()==true)
		{
		t2.setText("Radiobutton 3 selected ");
		}

	   }
  }
