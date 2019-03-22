package Day01_03_15.Day01_03_15_1.pojo;

public class CPU {
    private double speed;
    private String type;

    public CPU() {
    }

    public CPU(double speed, String type) {
        this.speed = speed;
        this.type = type;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "speed=" + speed +
                ", type='" + type + '\'' +
                '}';
    }
}
