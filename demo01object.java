package c2.day1.demo1;

import java.util.Objects;

public class demo01object {
    public static void main(String[] args) {
        String s1="abc";
        String s2="aBc";
        String s3=null;
        boolean b = s1.equals(s2);
        boolean b1 = s1.equals(s3);
        System.out.println(b);
        System.out.println(b1);
        boolean b2 = Objects.equals(s2, s3);
        System.out.println(b2);
        System.out.println("************");
        System.out.println(s1.equalsIgnoreCase(s2));


    }
}
