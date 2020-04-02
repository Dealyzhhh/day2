package c2.day1.demo1;

import java.util.Date;

public class demo3Date {
    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis());
        demo01();
        demo02();
        demo03();
    }

    private static void demo03() {
        Date date=new Date();
        long time = date.getTime();
        System.out.println(time);
    }

    private static void demo02() {
        System.out.println(new Date(0L));
        System.out.println(new Date(1583417403935L));
    }

    private static void demo01() {
        Date data=new Date();
        System.out.println(data);
    }
}
