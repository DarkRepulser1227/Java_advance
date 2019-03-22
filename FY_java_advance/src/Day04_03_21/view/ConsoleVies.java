package Day04_03_21.view;

import java.util.Scanner;

public class ConsoleVies {
    static Scanner scanner = new Scanner(System.in);
    public static void showMenu(){
        System.out.println("*****************");
        System.out.println("欢迎使用学生管理系统,请选择您的操作");
        System.out.println("1.添加学生");
        System.out.println("2.删除学生");
        System.out.println("3.查找学生");
        System.out.println("0.退出系统");
    }
    public static void sonsoleOut(String str){
        System.out.println(str);
    }
    public static String consoleIn(){
        String str = scanner.next();
        return str;
    }
}
