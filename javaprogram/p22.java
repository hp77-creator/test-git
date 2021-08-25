//CREATE AN APPLET WHICH HAS TWO BUTTONS RED AND GREEN. CREATE A EVENT WHEN 
//RED BUTTON IS PRESSED, THE BACKGROUND OF THE APPLET WILL BE RED AND ALSO //GREEN RESPECTIVELY.
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="p26" height=300 width=300>
</applet>*/
public class p26 extends Applet implements ActionListener
	{
	Button red,grn;
	public void init()
	   {
		red=new Button("Red");
		grn=new Button("Green");
		setLayout(null);
		add(red);
		add(grn);
		red.addActionListener(this);
		grn.addActionListener(this);
		red.setBounds(100,50,100,30);
		grn.setBounds(100,100,100,30);
	    }
	public void actionPerformed(ActionEvent ae)
		{
		if(ae.getSource()==red)
			setBackground(Color.red);
		else if(ae.getSource()==grn)	
			setBackground(Color.green);
		}
	}