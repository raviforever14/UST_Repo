package JavaPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Verify_String_Contains_UPR_LWR_NO_SPCLChar {
	
	public static void verifyStringValues(String str) {
		String regex="^(?=.*[a-z])(?=." 
				+ "*[A-Z])(?=.*\\d)"  
		            + "(?=.*[-+_!@#$%^&*., ?]).+$";
Pattern p=Pattern.compile(regex);
if(str== null) {
	System.out.println("String is blank");
	
}

Matcher m= p.matcher(str);
if(m.matches()) {
	System.out.println("Yes string have all values");
}
else {
	System.out.println("No string have not all values");
}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "#GeeksForGeeks123@"; 
		 verifyStringValues(str);
		
	}

}
