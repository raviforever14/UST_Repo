package TestNGSamples;

import org.testng.annotations.Test;

public class groupsTestNG {

  @Test(groups="Regression",priority=1)
	public void test321()
	{
		System.out.println("i am in regression testing");
	}
	
	@Test(groups="Retesting",priority=0)
	public void tttt()
	{
		System.out.println("i am in retesting group ");
	}
	
	@Test(groups="Retesting",priority=0)
	public void sss()
	{
		System.out.println("i am in retesting group");
	}
	@Test(groups="Retesting",priority=0)
	
	public void ppp()
	{
		System.out.println(" iam in retesting");
	}
	@Test(groups="Regression",priority=1)
	public void sample()
	{
		System.out.println("i am in regressiontesting");
	}
	@Test(groups="Regression",priority=1)
	public void test()
	{
		System.out.println("i am in regression testing");
	}
	@Test(groups="Retesting",priority=0)
	public void testcase1()
	{
		System.out.println("iam in retesting");
	}
	@Test(groups="Regression",priority=1)
	public void testCaseOne()
	{		
	System.out.println("Im in testCaseOne - And in Regression Group");
	}
	@Test(groups="Retesting",priority=0)
	public void testcase11()
	{
		System.out.println("iam in to retesting group");
	}
	@Test(groups="Regression",priority=1)
	public void testCaseTwo(){
	System.out.println("Im in testCaseTwo - And in Regression Group");
	}
	@Test(groups="Smoke Test",priority=2)
	public void testCaseThree(){
	System.out.println("Im in testCaseThree - And in Smoke Test Group");
	}
	@Test(groups="Regression",priority=1)
	public void testCaseFour(){
	System.out.println("Im in testCaseFour - And in Regression Group");
	}
	@Test(groups="Retesting",priority=0)
	public void testCaseFive(){
	System.out.println("Im in testCaseFour - And in Retesting Group");
	}
	
	@Test(groups="Retesting",priority=0)
	public void tc5()
	{
		System.out.println("i am in retesting");
	}
	
}
