import java.io.*;

class p13
   {
   public static void main(String []args)
	{
	int i=0,temp,j=1;
	int a[]=new int[args.length];
	
	for(i=0; i<args.length; i++)
	  {
	  a[i]=Integer.parseInt(args[i]);
	  }
	
	System.out.println("You Have entered the following array :");
	
	for(i=0; i<args.length; i++)
	  {
	System.out.println("\t the number at " +j +" : "+args[i]);
	j++;
	  }

	System.out.println("After sorting the ascending array :");

	for(i=0; i<args.length; i++)
	  {		
	  for(j=0; j<=i; j++)
	    { 
	    if(a[i]<a[j])
	      {
	      temp = a[i];
	      a[i] = a[j];
	      a[j] = temp;
	      }
	    }
	  }

        j=1; 
	for(i=0; i<args.length; i++)
	  {
	System.out.println("\t the number at " +j +" : "+a[i]);
	j++;
	  }
 		
	}
   }	 	