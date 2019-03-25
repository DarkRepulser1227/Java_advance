package Day06_03_25.Model;


import java.util.Date;

public class SaleRecord {
    private String id;
    private int num;
    private Date date;




    public SaleRecord() {
    }
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "SaleRecord{" +
                "id='" + id + '\'' +
                ", num=" + num +
                ", date=" + date +
                '}';
    }
}
