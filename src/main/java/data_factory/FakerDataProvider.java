package data_factory;

public class FakerDataProvider implements TestDataProvider{

	public void intializeDataSource() {
		System.out.println("Faker is initialized");
	}

	public String[][] readData() {
		String[][] data = new String[2][2];
		System.out.println("Data is retrieved");
		return data;
	}

	public void tearDownDataSource() {
		System.out.println("Closed faker");
	}

}
