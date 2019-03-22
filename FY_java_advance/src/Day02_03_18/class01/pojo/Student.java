package Day02_03_18.class01.pojo;

public class Student extends People {
    private int score;
    public Student(){
        super();
    }

    public Student(String name, String gender, int age, int score) {
        super(name, gender, age);
        this.score = score;
    }

    @Override
    public void eat() {

    }

    public void show() {
        System.out.println(this.getName() + "," + this.getGender() + "," + this.getAge() + "," + score);
    }


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
