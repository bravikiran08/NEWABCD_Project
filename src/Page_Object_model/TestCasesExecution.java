package Page_Object_model;

import org.testng.annotations.Test;

public class TestCasesExecution extends Repository{
	
	
  @Test
  public void loginExecution() {
	  
	  Repository.login();
	  
  }
}
