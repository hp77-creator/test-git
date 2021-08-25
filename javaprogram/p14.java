import java.io.*;

class p14
   {
   public static void main(String []args)
	{
	int temp;
	String str= " ",str1=" ";
	
	InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);

	try
        {
	System.out.print("enter the text : ");
	str=br.readLine();
	str=str+" ";
	System.out.print("enter the word that you search from the text : ");
	str1=br.readLine();
	}
	
	catch(IOException e)
        {
        System.out.println("Cannot read :"+e);
        }
	
	int a[]=new int[str.length()];

	System.out.println("You enter the string : "+ str);
	
	char a1[]=str.toCharArray();
	char b[]=str1.toCharArray();
        int j=0,l=0,m=0,n=0,x=0;
	for(int i=0; i<a1.length; i++)
        {
	if(a1[i]==' ')
	 {
	  j=i;  
	  for(int k=l;k<j-1;k++)
	   {
	   if(a1[k]==b[m])
	     { 
	     n=1;
             }
	   else
	     {
	     n=0;
	     break;	 
	     }
	   m++;
	   }	  	
	   l=j+1;
	   if(n==1)
	   x++;
	   m=0;
	 }
	}
	System.out.println("Accepted text is : "+str);
	System.out.println("There are "+x+" times " + str1 +" in given text");
      }
  }