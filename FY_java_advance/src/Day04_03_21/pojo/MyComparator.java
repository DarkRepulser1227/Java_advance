package Day04_03_21.pojo;

import java.util.Comparator;

public class MyComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getScore()-o2.getScore();
    }
}