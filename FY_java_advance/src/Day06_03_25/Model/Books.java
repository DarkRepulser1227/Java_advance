package Day06_03_25.Model;


import java.text.SimpleDateFormat;

public class Books {
    private String BookName;
    private String BookId;
    private int BookQuantity;
    private double BookPrice;
    private SimpleDateFormat AddTime;

    public Books(String bookName, String bookId, int bookQuantity, double bookPrice) {
        BookName = bookName;
        BookId = bookId;
        BookQuantity = bookQuantity;
        BookPrice = bookPrice;
    }

    public Books() {
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getBookId() {
        return BookId;
    }

    public void setBookId(String bookId) {
        BookId = bookId;
    }

    public int getBookQuantity() {
        return BookQuantity;
    }

    public void setBookQuantity(int bookQuantity) {
        BookQuantity = bookQuantity;
    }

    public double getBookPrice() {
        return BookPrice;
    }

    public void setBookPrice(double bookPrice) {
        BookPrice = bookPrice;
    }

    public SimpleDateFormat getAddTime() {
        return AddTime;
    }

    public void setAddTime(SimpleDateFormat addTime) {
        AddTime = addTime;
    }

    @Override
    public String toString() {
        return "Books{" +
                "BookName='" + BookName + '\'' +
                ", BookId='" + BookId + '\'' +
                ", BookQuantity=" + BookQuantity +
                ", BookPrice=" + BookPrice +
                '}';
    }
}
