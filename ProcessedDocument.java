public class ProcessedDocument{
    public static void main(String[] args){
        DocumentRegistry registry = new DocumentRegistry();

        Document pdf = registry.createPdfClone("annual_report_2024.pdf", "Acme Corp", 150);
        pdf.open();
        System.out.println("Type: " + pdf.getType());
        System.out.println();

        Document text = registry.createTextClone();
        text.open();
        System.out.println("Type: " + text.getType());
        System.out.println();

        Document spreadsheet = registry.createSpreadsheetClone();
        spreadsheet.open();
        System.out.println("Type: " + spreadsheet.getType());
        System.out.println();

        Document pdf2 = registry.createPdfClone("summary_report.pdf", "Acme Corp", 30);
        pdf2.open();
    }
}
