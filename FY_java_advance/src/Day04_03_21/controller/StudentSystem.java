package Day04_03_21.controller;


import Day04_03_21.pojo.Student;
import Day04_03_21.view.ConsoleVies;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class StudentSystem {

    int choice;
    static List<Student> list = new ArrayList<>();
    public StudentSystem(){
        while(true){
            ConsoleVies.showMenu();
            choice = Integer.parseInt(ConsoleVies.consoleIn());
            if(choice == 0){
                ConsoleVies.sonsoleOut("系统已退出");
                break;
            }else if(choice == 1){
                add();
            }else if(choice == 2){
                remove();
            }else if(choice == 3){
                query();
            }else {
                ConsoleVies.sonsoleOut("请输入正确的数字.");
            }
        }
    }
    public void add(){
        System.out.println("请输入学生姓名,性别,成绩.");
        Student student = new Student(ConsoleVies.consoleIn(),ConsoleVies.consoleIn(),Integer.parseInt(ConsoleVies.consoleIn()));
        list.add(student);
        ConsoleVies.sonsoleOut("添加成功");
    }

    public void remove(){

        ConsoleVies.sonsoleOut("请输入要删除的学生号或姓名");
        String str = ConsoleVies.consoleIn();
        if (isInteger(str)){
            list.remove(Integer.parseInt(str)-1);
            ConsoleVies.sonsoleOut("成功删除"+Integer.parseInt(str)+"号学生");
        }
        if(isInteger(str) == false){
            if(searchName(str) == null){
                return;
            }

            try {
                ConsoleVies.sonsoleOut("成功删除关于"+ searchName(str).getName() + "的信息");
            }catch (Exception e){
                ConsoleVies.sonsoleOut("查无此人");
            }
            list.remove(searchName(str));
        }

    }

    public void query(){
        ConsoleVies.sonsoleOut("是否查询全部?  Y/N");
        String str = ConsoleVies.consoleIn();
        switch (str){
            case "Y":
                for (Student student:
                        list) {
                    ConsoleVies.sonsoleOut(student.toString());
                }break;
            case "y":
                for (Student student:
                        list) {
                    ConsoleVies.sonsoleOut(student.toString());
                }break;
            case "N":
                ConsoleVies.sonsoleOut("请输入要查询人的序号或姓名");
                String str1 = ConsoleVies.consoleIn();
                if (isInteger(str1)){
                    ConsoleVies.sonsoleOut(list.get(Integer.parseInt(str1)-1).toString());
                }
                if(isInteger(str1) == false){
                    if(searchName(str) == null){
                        return;
                    }
                    ConsoleVies.sonsoleOut(searchName(str1).toString());

                }break;
            case "n":
                ConsoleVies.sonsoleOut("请输入要查询人的序号或姓名");
                String str2 = ConsoleVies.consoleIn();
                if (isInteger(str2)){
                    ConsoleVies.sonsoleOut(list.get(Integer.parseInt(str2)-1).toString());
                }
                if(isInteger(str2) == false){
                    if(searchName(str) == null){
                        return;
                    }
                    ConsoleVies.sonsoleOut(searchName(str2).toString());

                }
        }

    }
    public Student searchName(String stuname){
        for (Student student:
        list) {
            if(student.getName().equals(stuname)){
                return student;
            }
        }
        ConsoleVies.sonsoleOut("未找到此人");
        return null;
    }
    public boolean isInteger(String str) {
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        return pattern.matcher(str).matches();
    }

}
