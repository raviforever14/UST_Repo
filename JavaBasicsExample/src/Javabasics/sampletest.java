package Javabasics;



public class sampletest {

	
	public void sum(int a, int b) 
	{
		System.out.println("Sum=" +(a+b));

	}
	public int sum(int a,int b,int c) {
		return(a+b+c);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sampletest obj= new sampletest();
		obj.sum(20, 30);
		int d=obj.sum(20,30, 40);
		System.out.println("sum theree values="+ d);
	}

}
