package singleton;

public class WordDocumentFactory extends DocumentFactory {
    @Override
    public Documentt createDocument() {
        return new WordDocument();
    }
}
