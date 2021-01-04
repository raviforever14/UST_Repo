package JavaPrograms;

public class ResverseStringChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "This is good player";
		char array[]=s.toCharArray();
		System.out.println("Reverse String is==>");
		for(int i=array.length-1;i>=0;i--) {
		System.out.print(array[i]);	
		}
		

	}

}
