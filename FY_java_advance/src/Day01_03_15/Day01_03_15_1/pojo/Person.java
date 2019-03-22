package Day01_03_15.Day01_03_15_1.pojo;

public class Person {
    //    属性
    private  String name;
    private String gender = "male";
    private int age =20;
    private static int count = 0;

    public  Person(String name,String gender,int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
        count++;
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
        count++;
    }
    public Person(String name){
        this.name = name;
        count++;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
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


    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person.count = count;
    }


    //    方法
    public void sleep(){
        System.out.println (name+" is sleeping");
    }
    public void eat(){
        System.out.println (name+" is eating");
    }
    public void readBook(Book book){
        System.out.println (name+" is reading book:bookname="+book.getName());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
