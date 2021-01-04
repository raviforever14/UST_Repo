package JavaPrograms;

public  final class CreateImmutableClass {
	final String PanCardNo;
	
	public CreateImmutableClass(String PanNo) {
		this.PanCardNo=PanNo;
		
	}

	public String getPanNo() {
		return PanCardNo;
	}
}
/*
There are many immutable classes like String, Boolean, Byte, Short, Integer, Long, Float, Double etc. In short,
 all the wrapper classes and String class is immutable. We can also create immutable class
 by creating final class that have final data members as the example given above.

1: The class is final so we cannot create the subclass.
2: There is no setter methods i.e. we have no option to change the value of the instance variable.
so this is immutable class.
*/