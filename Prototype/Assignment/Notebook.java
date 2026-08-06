package Prototype.Assignment;

public class Notebook implements Cloneable{

    private String pageSize;
    private int pageCount;
    private String type;
    private String coverPage;
    private String backPage;
    private int price;

    public Notebook(String pageSize, int pageCount, String type,
                    String coverPage, String backPage, int price) {
        this.pageSize = pageSize;
        this.pageCount = pageCount;
        this.type = type;
        this.coverPage = coverPage;
        this.backPage = backPage;
        this.price = price;
    }

    @Override
    public Notebook clone() {
        try {
            return (Notebook) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return pageSize + " | " + pageCount + " pages | " +
                type + " | Rs." + price;
    }

}
