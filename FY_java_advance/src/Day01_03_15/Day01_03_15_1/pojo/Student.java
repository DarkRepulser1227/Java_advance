package Day01_03_15.Day01_03_15_1.pojo;

public class Student extends People{
    private int score;

    public Student(String name,String gender,int age,int score){
        super(name,gender,age);
        this.score = score;
    }

    public void study(){

    }
    public void play(){

    }

    @Override
    public void think() {
        System.out.println("the student is think who to study");
    }
}
