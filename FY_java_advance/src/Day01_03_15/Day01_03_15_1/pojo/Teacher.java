package Day01_03_15.Day01_03_15_1.pojo;

public class Teacher extends People {
    private int salary;

    public Teacher(String name, String gender, int age, int salary) {
        super(name, gender, age);
        this.salary = salary;
    }

    public void teach(){

    }

    @Override
    public void think() {
        super.think();
        System.out.println("i am a teacher");
    }
}
