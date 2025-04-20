public class DocumentRegistry{
    private PdfDocument pdfPrototype;
    private TextDocument textDocumentPrototype;
    private SpreadsheetDocument spreadsheetPrototype;

    public DocumentRegistry(){
        System.out.println("Creating a PDF Document prototype.");
        pdfPrototype = new PdfDocument("annual_report_2024.pdf", "Acme Corp", 150, "Annual Report");

        System.out.println("Creating a Text Document prototype.");
        textDocumentPrototype = new TextDocument(1, "UTF-8", 250);

        System.out.println("Creating a Spreadsheet Document prototype.");
        spreadsheetPrototype = new SpreadsheetDocument("sales_data_q1.xlsx", 1000, 20);
    }

    public Document createPdfClone(String fileName, String author, int pageCount){
        PdfDocument base = (PdfDocument) pdfPrototype.clone();
        return new PdfDocument(fileName, author, pageCount, base.getType());
    }

    public Document createTextClone(){
        return textDocumentPrototype.clone();
    }

    public Document createSpreadsheetClone(){
        return spreadsheetPrototype.clone();
    }
}
