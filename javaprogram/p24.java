import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="p24" height=200 width=100></applet>*/
public class p24 extends Applet implements ItemListener
   {
   int i,j;
   Choice c1;
   Label l1,l2,l3,l4;
   public void init()
    {
    setBackground(Color.white);
    setForeground(Color.black);
    l1=new Label("                   ");
    add(l1); 
    l2=new Label("                   ");
    add(l2);
    l3=new Label("                   ");
    add(l3);
    l4=new Label("                   ");
    add(l4); 
    c1=new Choice();
    c1.add("Ahmedabad");
    c1.add("Surat");
    c1.add("Bhavnagar");
    c1.add("Baroda");
    c1.add("Calcutta");
    c1.add("Banglore");
    c1.add("Nadiad");
    add(c1);
    c1.addItemListener(this);
    }
public void itemStateChanged(ItemEvent ie)
   {
   l1.setText(c1.getSelectedItem());
   i=c1.getSelectedIndex();
   l2.setText((new Integer(i)).toString());
   j=c1.getItemCount();
   l3.setText(c1.getItem(j-1));
   l4.setText((new Integer(j)).toString());
   }
}