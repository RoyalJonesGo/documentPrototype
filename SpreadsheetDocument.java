public class SpreadsheetDocument implements Document{
    private String spreadsheetName;
    private int rowCount;
    private int columnCount;

    public SpreadsheetDocument(String spreadsheetName, int rowCount, int columnCount){
        this.spreadsheetName = spreadsheetName;
        this.rowCount = rowCount;
        this.columnCount = columnCount;
    }

    @Override
    public Document clone(){
        return new SpreadsheetDocument(spreadsheetName, rowCount, columnCount);
    }

    @Override
    public void open(){
        System.out.println("Opening Spreadsheet Document: " + spreadsheetName + " (" + rowCount + " rows, " + columnCount + " columns)");
    }

    @Override
    public String getType(){
        return "Spreadsheet, Name: " + spreadsheetName + ", Rows: " + rowCount + ", Columns: " + columnCount;
    }
}
