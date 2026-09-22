package design_patterns.adapter.task1;

public class Main {
    public static void main(String[] args) {
        // обычный DOC
        DocumentProcessor doc = new DOCProcessor();
        doc.process();

        // PDF
        PDFProcessor pdf = new PDFProcessor();

        //оборачиваем PDF в DOC
        DocumentProcessor pdfAdapter = new DocumentAdapter(pdf);
        pdfAdapter.process();
    }
}
