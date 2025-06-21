package singleton;

public class PdfDocumentFactory extends DocumentFactory {
    @Override
    public Documentt createDocument() {
        return new PdfDocument();
    }
}
