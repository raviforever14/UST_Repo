package JavaPrograms;

public class RemoveNonAlpharicNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="jeevan133@gmail.com"; //Program is to remove @ ,.(special char) from the string
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("After remove Non Alphanumeric values= "+s);
		}

}
