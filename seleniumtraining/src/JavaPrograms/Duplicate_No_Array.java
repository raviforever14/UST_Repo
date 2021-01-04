package JavaPrograms;

public class Duplicate_No_Array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		      int temp, lenth;
		      int array[] = {10, 20, 25,20,34, 23,25, 10,23,28};
		      lenth = array.length;
		      int count=0;
		    
		      for(int i = 0; i<lenth; i++ ){
		         for(int j = i+1; j<lenth; j++){

		            if(array[i]==array[j]){
		            
		                System.out.println("duplicate elements in array are==>"+array[i]);
		               count=count+1; 
		            }
		            
		          }
		        		         
		      }
		      System.out.println("No. of duplicate Char are= "+count);
		      	     
		      
		   }

}
