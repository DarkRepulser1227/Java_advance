package Day01_03_15.Day01_03_15_1.pojo;

public class People {
    private String name;
    private String gender;
    private int age;

    public People(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void sleep(){
        System.out.println("the people is sleeping");
    }
    public void eat(){
        System.out.println("the people is eating");
    }
    public void think(){
        System.out.println("the people is thinking");
    }

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

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
