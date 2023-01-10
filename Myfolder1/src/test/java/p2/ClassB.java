package p2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ClassB 
{
	

	  @Test
	  public void tc004() 
	  {
		  Reporter.log("tc001 executed successfull", true);
	  }
	  
	  
	  @Test
	  public void tc005() 
	  {
		  Reporter.log("tc002 executed successfull", true);
	  }
	  
	  @Test
	  public void tc006() 
	  {
		  Reporter.log("tc003 executed successfull", true);
	  }

}
