package JavaPrograms;

public class StringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/* Immutable simply means unmodifiable or unchangeable 
	   that means Once string object is created its data or state can't be changed but a new string object is created. 
		*/
		String s1="Ravi";
		s1.concat("Kumar");//concat() method appends the string at the end  
		System.out.println("Immutable String proved= "+s1);//will print Ravi because strings are immutable objects  
		
		s1=s1.concat("Kumar");
		System.out.println("New object created= "+s1);// RaviKumar
		/* Why String is immutable in java
		 Because java uses the concept of string literal.Suppose there are 5 reference variables,all referes to one object "ravi".
		 If one reference variable changes the value of the object,		 
		  it will be affected to all the reference variables. That is why string objects are immutable in java.
		 */
		

	}

}
