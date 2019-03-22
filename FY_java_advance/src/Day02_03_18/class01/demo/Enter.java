package Day02_03_18.class01.demo;

import Day02_03_18.class01.pojo.*;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Enter {
    public static void main(String[] args){
        //Calender的使用
        Calendar calendar = Calendar.getInstance();
        System.out.println(new Date());
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH)+1);
        System.out.println(calendar.get(Calendar.DATE));
        // System.out.println(calendar.get);

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        System.out.println(gregorianCalendar.get(GregorianCalendar.YEAR));
        System.out.println(gregorianCalendar.get(GregorianCalendar.MONTH)+1);

        BeijingPeople beijingPeople = new BeijingPeople();
        beijingPeople.speakMore();

    }
}
