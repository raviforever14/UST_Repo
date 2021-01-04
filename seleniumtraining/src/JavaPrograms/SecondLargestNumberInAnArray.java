package JavaPrograms;

public class SecondLargestNumberInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		      int temp, size;
		      int array[] = {10, 20, 25, 63, 96, 57};
		      size = array.length;

		      for(int i = 0; i<size; i++ ){
		         for(int j = i+1; j<size; j++){

		            if(array[i]>array[j]){
		               temp = array[i];
		               array[i] = array[j];
		               array[j] = temp;
		              		             
		            }
		            
		         }
		         System.out.println("sorted array elements are==>"+array[i]);
	            
		      }
		      System.out.println("Second largest number is:: "+array[size-2]);
		      //to get second lowest no. array(size-5]
		   }

	}

// or second method you can sort the array element first then find the second highest no.
/*
 public static void main(String args[]){
      int array[] = {10, 20, 25, 63, 96, 57};
      int size = array.length;
      Arrays.sort(array);
      System.out.println("sorted Array ::"+Arrays.toString(array));
      int res = array[size-2];
      System.out.println("2nd largest element is ::"+res);
   }
   
   */
