package data_factory;

public interface TestDataProvider {
	
	void intializeDataSource();
	String[][] readData();
	void tearDownDataSource();

}
