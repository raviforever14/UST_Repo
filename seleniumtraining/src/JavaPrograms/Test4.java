package JavaPrograms;

public class Test4 {
	class 	Inner{
		void Test() {
			if(Test4.this.flag) {sample();
			}
			
		}
	}
private boolean flag =true;
public void sample() {
	System.out.println("Sample");
}
public Test4() {
	(new Inner()).Test();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	new Test4();
	

	}

}
