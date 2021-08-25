//WRITE A JAVA APPLICATION THAT OUTPUTS A TABLE OF NUMBERS EACH LINE IN THE TABLE CONTAINS THREE
//ENTERIES THE NUMBER ITS CUBE BEGIN WITH 1 AND END WITH 10 ALSO USE A FOR LOOP TO GENERATES.
class p18
  {
  public static void main(String args[])     
     {
     int no=1,cube;
     for (int i=0; i<10; i++)
	{
	System.out.print("\t"+no);
        cube=no*no*no;
        System.out.print("\t"+"   "+ no + " ^ "+" 3 "+" "+" = "+"  "+cube);
 	no++;
	cube=0;
   	System.out.println();
        }
     }
   }