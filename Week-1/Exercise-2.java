interface Document {
    void open();
}

class WordDocument implements Document {

    public void open() {
        System.out.println("Opening Word Document");
    }
}

class PdfDocument implements Document {

    public void open() {
        System.out.println("Opening PDF Document");
    }
}

class ExcelDocument implements Document {

    public void open() {
        System.out.println("Opening Excel Document");
    }
}

abstract class DocumentFactory {

    public void openDocument() {
        Document doc = createDocument();
        doc.open();
    }

    public abstract Document createDocument();
}

class PdfFactory extends DocumentFactory {

    public Document createDocument() {
        return new PdfDocument();
    }
}

public class Exercise2 {

    public static void main(String[] args) {

        DocumentFactory factory = new PdfFactory();
        factory.openDocument();
    }
}
