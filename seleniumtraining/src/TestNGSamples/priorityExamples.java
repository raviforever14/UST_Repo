package TestNGSamples;

import org.testng.annotations.Test;

public class priorityExamples {
  @Test
  public void f() {
	  
	  System.out.println("Without pririoty");
  }
  @Test(priority=1)
  public void A()
  {
	  System.out.println("A ");
  }
  @Test(priority=0)
  public void M()
  {
	  System.out.println("M");
  }
  
   @Test(priority=2)
  public void K()
  {
	  System.out.println("K ");
  } @Test(priority=1)
  public void Z()
  {
	  System.out.println("Z ");
  }
}
