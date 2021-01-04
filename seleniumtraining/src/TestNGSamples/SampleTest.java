package TestNGSamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {
  @Test
  public void MethodOne() {
	  Assert.assertTrue(true);
	  
  }
  
  @Test(dependsOnMethods= {"MethodOne"})
  public void MethodTwo() {
	  Assert.assertTrue(false);
	  
  }
  @Test(dependsOnMethods= {"MethodTwo"})
  public void MethodThree() {
	  Assert.assertTrue(true);
	  
	  
  }
}
