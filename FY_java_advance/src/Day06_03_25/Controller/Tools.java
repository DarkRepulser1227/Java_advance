package Day06_03_25.Controller;

import Day06_03_25.View.ConsoleVies;

import java.util.regex.Pattern;

public class Tools {
    static public void Continue(){
        ConsoleVies.sonsoleOut("任意键继续");
        ConsoleVies.consoleIn();
    }
    //判断是否输入数字并返回
    static public int isNum(int choice){
        while(true) {

            try {
                choice = Integer.parseInt(ConsoleVies.consoleIn());
                return choice;
            } catch (Exception e) {
                ConsoleVies.sonsoleOut("请输入正确的数字");
            }
        }
    }
    //判断是否输入正整数并返回Boolean
    static public boolean isPositiveIntNum(String str){
        if(isInteger(str)){
            int num = Integer.parseInt(str);
                if (num < 0){
                    return false;
                }else {
                    return true;
                }
        }else
            return false;

    }
    static public boolean isInteger(String str) {
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        return pattern.matcher(str).matches();
    }
    public static boolean isDouble(String str) {
        Pattern pattern = Pattern.compile("^[-\\+]?\\d+(\\.\\d*)?|\\.\\d+$");
        return pattern.matcher(str).matches();
    }

}
