package data_factory;

public class ExcelDataProvider implements TestDataProvider{

	public void intializeDataSource() {
		System.out.println("Excel is initialized");
	}

	public String[][] readData() {
		String[][] data = new String[1][1];
		System.out.println("Data is retrieved");
		data[0][0] = "testleaf";
		return data;
	}

	public void tearDownDataSource() {
		System.out.println("Closed Excel");
	}

}
