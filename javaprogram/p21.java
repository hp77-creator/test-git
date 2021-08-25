//WRITE A JAVA PROGRAM AND CREATE ONE CLASS THAT ACCEPTS AN ARRAY OF TEN //NUMBERS CREATE ONE SUBCLASS WHICH HAS FOLLOWING
//DISPLAY NUMBERS ENTERED
//SUM OF THE NUMBER
//AVERAGE OF NUMBERS
//MAXIMUM OF THE NUMBERS
//MINIMUM OF THE NUMBERS
//CREATE APPROPRIATE METHOD IN THE SUB CLASS TO EXECUTE OPERATION AS PER OUR //CHOICE AND IT SHOULD CONTINUE UNTILL WE PRESS CTRL + C

import java.io.*;

class myarray
	{
	public int a[]= new int[10];
	public void accept()
	  {
	 try
	    {
	    DataInputStream dis=new DataInputStream(System.in);
	    for(int i=1; i<=10; i++)
		{
		System.out.print("\n\tEnter the number " +i+":");
		a[i-1]=Integer.parseInt(dis.readLine());
		}
	     }
	catch(Exception e)
	        {
               System.out.println(e); 
		}
	 }
      }
class choice extends myarray
	{
	int sum=0;
	void display()
	   {
	   System.out.println("Number are as follows:");
	   int j=0;
	   for(int i=0;i<10;i++)
	       {
		System.out.println("\t number"+j+":"+a[i]);
		j++;
	       }
	   } 
public void sum()
   {
   for(int i=0; i<10; i++)
	{
	sum=sum+a[i];
	}
	System.out.println("\t The sum of the numbers :"+sum);
   }
public void average()
   {
   System.out.println("\t The average of the numbers :"+sum/10);
   }
public void maximum()
   {
   int max=0;
   for (int i=0; i<10; i++)
     {
     if (a[i]>max)
      {
      max=a[i];
      }
     }
    System.out.println("\t maximum number is :"+max);
   }
 	
public void minimum()
   {
   int min=a[0];
   for (int i=0; i<10; i++)
     {
     if (a[i]<min)
      {
      min=a[i];
      }
     }
    System.out.println("\t minimum number is :"+min);
   }
}
class p21
 {
  public static void main(String args[]) throws IOException
    {
  int choic;
  choice c1 = new choice();
 c1.accept();	
  boolean flag=false;
  while(flag==false)		
	{
	DataInputStream di=new DataInputStream(System.in);

	System.out.println("\n_____________________________");
	System.out.println("\n********CHOICE***************");
	System.out.println("\n  1. Display numbers.");
	System.out.println("\n  2. Sum of the numbers.");
	System.out.println("\n  3. Average of numbers.");
	System.out.println("\n  4. Maximum of numbers.");
	System.out.println("\n  5. Minimum of numbers.");
	System.out.println("\n  6. Exit.");
	System.out.println();
	System.out.println("\n Enter your choice");
    
	choic=Integer.parseInt(di.readLine());
	if(choic==1)
           {
	   c1.display();
	   }
	else if(choic==2)
	   {
	   c1.sum();
	   }
	else if(choic==3)
	   {
	   c1.average();
	   }
	else if(choic==4)
	   {
	   c1.maximum();
	   }
	else if(choic==5)
           {
	   c1.minimum();
	   }
	else if(choic==6)
   	   {
	   flag=true;
	   }
	}
     }		
}     		