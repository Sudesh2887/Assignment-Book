public class Book {
    private String bookID;
    private String bookName;
    private String author;
    private float bookPrice;

    public Book() {
    }

    public Book(String bookID, String bookName, String author, float bookPrice) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.author = author;
        this.bookPrice = bookPrice;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(float bookPrice) {
        this.bookPrice = bookPrice;
    }
}
