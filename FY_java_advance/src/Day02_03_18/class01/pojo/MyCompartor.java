package Day02_03_18.class01.pojo;

import java.util.Comparator;

public class MyCompartor implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getScore()-o2.getScore();
    }
}
