package practice_java.practice_5.test;

public class DigitalProduct extends Product {
    private int fileSize;

    public DigitalProduct(String title, int price, int fileSize) {
        super(title, price);
        this.fileSize = fileSize;
    }

    public int getFileSize() {
        return fileSize;
    }
}
