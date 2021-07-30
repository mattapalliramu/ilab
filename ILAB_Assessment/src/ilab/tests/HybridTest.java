package ilab.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import ilab.librarys.Apply_Online;
import utils.AppUtils;
import utils.XLUtils;

public class HybridTest extends AppUtils
{
	
	@Test
	public void ILABTestSuite() throws IOException, InterruptedException
	{
		
		Apply_Online apply = new Apply_Online();
		String keywordfile = "C:\\Users\\Windowspc\\eclipse-workspace1\\ILAB_Assessment\\ILAB_File\\ilab_assessment.xlsx";
		String tcsheet = "TestCases";
		String tssheet = "TestSteps";
		
		int tccount = XLUtils.getRowCount(keywordfile, tcsheet);
		int tscount = XLUtils.getRowCount(keywordfile, tssheet);
		
		String tcid,tcexeflag,tstcid;
		String name,email;
				
		for(int i=1;i<=tccount;i++)
		{
			tcid = XLUtils.getStringCellData(keywordfile, tcsheet, i, 0);
			tcexeflag = XLUtils.getStringCellData(keywordfile, tcsheet, i, 2);
			if(tcexeflag.equalsIgnoreCase("y"))
			{
				for(int j=1;j<=tscount;j++)
				{
					tstcid = XLUtils.getStringCellData(keywordfile, tssheet, j, 0);
					if(tstcid.equalsIgnoreCase(tcid))
					{
						name = XLUtils.getStringCellData(keywordfile, tssheet, j, 2);
						email = XLUtils.getStringCellData(keywordfile, tssheet, j, 3);
						apply.applicationdata(name, email);
					}}}
		}
	}
}