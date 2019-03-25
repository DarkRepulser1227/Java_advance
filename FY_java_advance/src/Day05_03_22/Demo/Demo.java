package Day05_03_22.Demo;

import Day05_03_22.Pojo.Student;

import java.io.File;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        //List
        List<Student> list = new ArrayList<>();
        list.add(new Student("a", "male", 60));
        System.out.println(list.get(0));

        //Map
        Map<String, Object> map = new HashMap<>();
        map.put("name", "zhangsan");
        map.put("gender", "male");
        map.put("age", 18);
        map.put("age", 20);

        System.out.println(map.get("name"));
        System.out.println(map.get("gender"));
        System.out.println(map.get("age"));

//        //异常
        File file = new File("c:/abc");

//        try {
//            FileInputStream in =new FileInputStream(file);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

//先输入5个整数,存在到整形数组里
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("请输入第" + (i + 1) + "个整数");
                a[i] = scanner.nextInt();

            } catch (Exception e) {
                i--;
                System.out.println("非法输入,请重新输入");
                scanner.next();

            }
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+"   ");
        }
        System.out.println("请输入一个下标");
        int index = scanner.nextInt();
        try {
            System.out.println(a[index]);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("请输入0-"+(a.length-1)+"之间的整数");
        }
    }
}
