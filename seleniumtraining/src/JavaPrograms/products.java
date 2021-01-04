package JavaPrograms;


class product1{
	public String product_name;
}

public class products{
	
	public static void main(String args[])
	{
		/*finally {

		 	System.out.println("Thank you");
		}*/
	final product1 p1 = new product1();
		
		product1 p2 = new product1();
		p1 = p2;

		p1.product_name = "iPhoneX";
		System.out.println(p1.product_name);
		
		p1.product_name = "Samsung Note";

		System.out.println(p1.product_name);


	}
}