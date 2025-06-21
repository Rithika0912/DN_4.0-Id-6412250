package singleton;

public class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public Documentt createDocument() {
        return new ExcelDocument();
    }
}
