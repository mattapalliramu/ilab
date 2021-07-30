package ilab.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ilab.librarys.Apply_Online;
import utils.AppUtils;


public class Apply_Online_Test extends AppUtils{

	@Parameters({"name","email"})
	@Test
	public void applyingDetails(String name,String email)
	{
		Apply_Online apply = new Apply_Online();
		apply.applicationdata(name, email);
	}
}
