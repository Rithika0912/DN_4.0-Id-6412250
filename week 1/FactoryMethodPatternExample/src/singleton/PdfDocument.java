package singleton;

public class PdfDocument implements Documentt {
    @Override
    public void open() {
        System.out.println("Opening a PDF document.");
    }
}
