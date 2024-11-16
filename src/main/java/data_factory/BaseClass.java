package data_factory;


import org.testng.annotations.DataProvider;

public class BaseClass {
	public static DataSources sourceName;
	
	@DataProvider
	public String[][] fetchData() {
		return DataProviderFactory.datafactory(sourceName);
	}

}
