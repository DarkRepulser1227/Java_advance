package Day02_03_18.class01.pojo;

public abstract class People {
    private String name;
    private String gender;
    private int age;

    public People() {
    }

    public People(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void sleep(){

    }

    public abstract void eat();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
