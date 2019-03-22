package Day01_03_15.Day01_03_15_1.pojo;

public class LED {
    private int size;
    private String type;
    private String broad;

    public LED() {
    }

    public LED(int size, String type, String broad) {
        this.size = size;
        this.type = type;
        this.broad = broad;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBroad() {
        return broad;
    }

    public void setBroad(String broad) {
        this.broad = broad;
    }

    @Override
    public String toString() {
        return "LED{" +
                "size=" + size +
                ", type='" + type + '\'' +
                ", broad='" + broad + '\'' +
                '}';
    }
}
