package Day06_03_25.View;

import java.util.Scanner;

public class ConsoleVies {
    static Scanner scanner = new Scanner(System.in);
    public static void showMenu(){
        System.out.println("********************************");
        System.out.println("欢迎使用图书管理系统,请选择您的操作");
        System.out.println("1.添加图书");
        System.out.println("2.销售图书");
        System.out.println("3.显示当前库存");
        System.out.println("4.查询指定图书的库存和销售情况");
        System.out.println("5.进货或销售的时间");
        System.out.println("6.修改图书信息");
        System.out.println("7.删除图书信息");
        System.out.println("8.统计指定日期的销售额");
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
