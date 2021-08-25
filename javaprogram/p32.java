import java.applet.*;
import java.awt.*;
/*<applet code="p32" height=100 width=250>
</applet>*/
public class p32 extends Applet
   {
   public void init()
     {
     setBackground(Color.white);
     setLayout(null);
     
     Label l1,l2;
     TextField t1,t2;
    
     l1=new Label("NAME :");
     t1=new TextField(15);
     t1.setText("rajesh patel");
     l2=new Label("PASSWORD :");
     t2=new TextField(15);
     t2.setEchoChar('*');
     add(l1);
     add(t1);
     add(l2);
     add(t2);
     l1.setBounds(10,10,80,20);
     t1.setBounds(90,10,150,20);
     l2.setBounds(10,50,80,20);
     t2.setBounds(90,50,150,20);		 		
     }
}