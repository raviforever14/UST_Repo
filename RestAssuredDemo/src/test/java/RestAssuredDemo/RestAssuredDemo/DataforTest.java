package RestAssuredDemo.RestAssuredDemo;

import org.testng.annotations.DataProvider;

public class DataforTest {
	
	@DataProvider(name="dataValues")
	public Object[][] dataForPost(){
		/*Object[][] data= new Object[2][3];
		
		data[0][0]="Edison";
		data[0][1]="Thomas";
		data[0][2]=1;
		
		data[1][0]="David";
		data[1][1]="Calis";
		data[1][2]=2;
		
		return data;*/
		//Second method
		return new Object[][] {
			{"Pitar","lol",2},
			{"jacob","boton",1}
		};
	}

}
