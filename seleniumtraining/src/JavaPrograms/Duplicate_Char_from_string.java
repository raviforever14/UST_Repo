package JavaPrograms;

import java.util.Arrays;

public class Duplicate_Char_from_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Raviarchnaviraj";
		char a[]=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
			
				if(a[i]==a[j]) {
					System.out.print(a[j] + " ");
					//to remove duplicate char
					 
					break;
				}
				

			}
			//System.out.print(a[i]);
			
		}

	}

}
