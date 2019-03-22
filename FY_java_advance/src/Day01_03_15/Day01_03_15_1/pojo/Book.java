package Day01_03_15.Day01_03_15_1.pojo;

public class Book {
    //    属性
    private String name;
    private  String author;
    private  double price;
    private int pagenum;

    //   构造方法
    public  Book(String name,String author,double price,int pagenum ){
        this.name = name;
        this.author = author;
        this.price = price;
        this.pagenum  = pagenum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPagenum() {
        return pagenum;
    }

    public void setPagenum(int pagenum) {
        this.pagenum = pagenum;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", pagenum=" + pagenum +
                '}';
    }
}
