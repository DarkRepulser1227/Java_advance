package Day02_03_18.class01.pojo;

public class Stu extends EnglishPeople {
    public  Stu(){
        super();
    }

    public void play(){
        System.out.println("play");
    }

    @Override
    public void eat() {
        System.out.println("eat............");
    }
}
