package JavaPrograms;

public class TestProgram {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		highestElement();

	}
	public static void highestElement() {
		try {
	int a[]= {15,54,40,10};
	
	int temp;
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
			}
			
		}
	}
	System.out.println("second hishest element is= " + (a[a.length-2]));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
