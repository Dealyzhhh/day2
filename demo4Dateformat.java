package c2.day1.demo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo4Dateformat {
    public static void main(String[] args) throws ParseException {
        demo01();
        demo02();
        System.out.println("************************************");
        demo03();
    }

    private static void demo03() {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date=new Date();
        String d=sdf.format(date);
        System.out.println(date);
        System.out.println(d);
        System.out.println("****************");
        System.out.println(sdf.format(new Date()));

    }

    private static void demo02() throws ParseException {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date=simpleDateFormat.parse("2020年03月05日 22时26分59秒");
        System.out.println(date);

    }

    private static void demo01() {

    }

}
