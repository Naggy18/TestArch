package TestCases;

import data_factory.BaseClass;
import data_factory.DataSources;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testDataFactory extends BaseClass {
	
	@BeforeClass
	public void dataSetup() {
		sourceName = DataSources.EXCEL;

	}
	
	@Test(dataProvider = "fetchData")
	public void testcase(String company) {
		System.out.println("data from DataProvider: "+company);
		System.out.println("Test case is executed successfully");

	}

}
