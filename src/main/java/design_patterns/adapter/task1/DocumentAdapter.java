package design_patterns.adapter.task1;

public class DocumentAdapter implements DocumentProcessor {
    private PDFProcessor pdfProcessor;

    public DocumentAdapter(PDFProcessor pdfProcessor) {
        this.pdfProcessor =pdfProcessor;
    }


    @Override
    public void process() {
        System.out.println("Конвертируем PDF в DOC");
        pdfProcessor.processPDF();
    }
}
