package Javabasics;

public class DisplayOverloading {


	  public void disp()
	    {
		 
	         System.out.println("superclass first method");
	    }
	   
	}
 class childClass extends DisplayOverloading{
	 
	 public void disp() {
		 System.out.println("subclass method");
	 }
	
}
	class Sample
	{
	   public static void main(String args[])
	   {
	       DisplayOverloading obj = new DisplayOverloading();
	       obj.disp();
	       obj=new childClass();
	       obj.disp();
	       childClass childclass=new childClass();
	       childclass.disp();
	       //childClass cobj=new DisplayOverloading(); compile error
	       
	       
	   }
	}