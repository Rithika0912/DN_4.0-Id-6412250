package singleton;

public class ExcelDocument implements Documentt {
    @Override
    public void open() {
        System.out.println("Opening an Excel document.");
    }
}
