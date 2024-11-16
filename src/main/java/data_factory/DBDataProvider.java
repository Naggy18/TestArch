package data_factory;

public class DBDataProvider implements TestDataProvider{

	public void intializeDataSource() {
		System.out.println("DB is initialized");
		
	}

	public String[][] readData() {
		String[][] data = new String[2][2];
		System.out.println("Data is retrieved");
		return data;
	}

	public void tearDownDataSource() {
		System.out.println("Closed DB");
		
	}

}
