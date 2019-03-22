package Day04_03_21.pojo;

public class Student {
    private String name;
    private String gender;
    private int score;

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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", score=" + score +
                '}';
    }

    public Student(String name, String gender, int score) {
        this.name = name;
        this.gender = gender;
        this.score = score;
    }
}
