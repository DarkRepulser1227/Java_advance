package Day01_03_15.Day01_03_15_1.pojo;

public class KeyBroad {
    private String color;
    private String broad;
    private boolean isLight;

    public KeyBroad(String color, String broad, boolean isLight) {
        this.color = color;
        this.broad = broad;
        this.isLight = isLight;
    }

    public KeyBroad() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBroad() {
        return broad;
    }

    public void setBroad(String broad) {
        this.broad = broad;
    }

    public boolean isLight() {
        return isLight;
    }

    public void setLight(boolean light) {
        isLight = light;
    }

    @Override
    public String toString() {
        return "KeyBroad{" +
                "color='" + color + '\'' +
                ", broad='" + broad + '\'' +
                ", isLight=" + isLight +
                '}';
    }
}
