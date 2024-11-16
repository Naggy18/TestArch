package data_factory;

public class DataProviderFactory {

	public static TestDataProvider dataProvider;

	public static String[][] datafactory(DataSources source) {
		String[][] data = null;
		switch (source) {
		case EXCEL:
			dataProvider = new ExcelDataProvider();
			dataProvider.intializeDataSource();
			data = dataProvider.readData();
			dataProvider.tearDownDataSource();
			
			break;
		case DATABASE:
			dataProvider = new DBDataProvider();
			dataProvider.intializeDataSource();
			dataProvider.readData();
			dataProvider.tearDownDataSource();
			break;
		case FAKER:
			dataProvider = new FakerDataProvider();
			dataProvider.intializeDataSource();
			dataProvider.readData();
			dataProvider.tearDownDataSource();
			break;
		default:
			throw new IllegalArgumentException("Given data source is not available");
		}
		return data;
	}

}
