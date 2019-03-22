package Day01_03_15.Day01_03_15_1.pojo;

public class Computer {
    private KeyBroad keyBroad;
    private LED led;
    private CPU cpu;

    public Computer() {
    }

    public Computer(KeyBroad keyBroad, LED led, CPU cpu) {
        this.keyBroad = keyBroad;
        this.led = led;
        this.cpu = cpu;
    }

    public KeyBroad getKeyBroad() {
        return keyBroad;
    }

    public void setKeyBroad(KeyBroad keyBroad) {
        this.keyBroad = keyBroad;
    }

    public LED getLed() {
        return led;
    }

    public void setLed(LED led) {
        this.led = led;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "keyBroad=" + keyBroad +
                ", led=" + led +
                ", cpu=" + cpu +
                '}';
    }
}
