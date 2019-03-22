package Day01_03_15.Day01_03_15_1.demo;

import Day01_03_15.Day01_03_15_1.pojo.*;

public class Enter {
    public static void main(String[] args) {

        //实例化图书对象
        Book book1 = new Book("java","zhangsan",59.9,257);
//        Book book2 = new Book();
        // book1.name = "android";

        Person p1 = new Person("lisi","female",19);
        Person p2 = new Person("abc",25);
        Person p3 = new Person("bbb");
        p3.setName("xxx");
        System.out.println(p3.getName());

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("count="+Person.getCount());

        Calc calc = new Calc();
        System.out.println(calc.add(1.5,2.5));
        calc.getArea(1);
        calc.getArea(1,2);
        calc.getArea(1,2,3);



        p1.sleep();
        p1.eat();
        p1.readBook(book1);

        KeyBroad keyBroad = new KeyBroad("black","luoji",true);
        LED led = new LED(14,"led","lianxiang");
        CPU cpu = new CPU(2.8,"i5");

        Computer computer = new Computer(keyBroad,led,cpu);
        System.out.println(computer.toString());
        //继承关系
        People people = new People("aaa","male",25);
        people.sleep();
        Student s1 = new Student("zhangsan","male",18,80);
        s1.sleep();
        Teacher t1 = new Teacher("lisi","male",50,5000);
        t1.sleep();


        people.think();
        s1.think();
        System.out.println("*******");
        t1.think();
//测试银行系统
        User u1 = new User("0001","zhangsan","female");
        u1.moneyIn(1000);
        u1.select();
        u1.moneyOut(500);
        u1.select();
        u1.moneyOut(600);
        u1.select();
        u1.pay(200);
        u1.select();
        u1.pay(6000);
        u1.select();
        u1.pay(400);
        u1.select();
        u1.pay(100);
        u1.select();

        VipUser v1 = new VipUser("v0001","abc","male",0);
        v1.moneyIn(1000);
        v1.select();
        v1.moneyOut(500);
        v1.select();
        v1.pay(6000);
        v1.select();
        v1.change();
    }
}
