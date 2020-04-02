package c2.day1.demo1;

import c1.cn.cn1.Array.Anony.Random;

import java.util.ArrayList;
import java.util.Scanner;

public class toString {
    public static void main(String[] args) {
        Person person = new Person("张三", 23);
        String s = person.toString();//toString重写
        System.out.println(person.toString());//toString重写
        System.out.println(s);
        System.out.println("***************");
//        直接打印对象的名字，其实就是调用对象的toString
        System.out.println(person);//toString重写
        Random random=new Random();
        System.out.println(random);
        System.out.println(new Random());
        System.out.println("****************");
        Scanner scanner=new Scanner(System.in);
        System.out.println(scanner);
        System.out.println(new Scanner(System.in));
        System.out.println("****************");

        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        System.out.println(new ArrayList<Integer>().add(12));

        Person person1=new Person("迪丽热巴",19);
        Person person2=new Person("古力娜扎",23);
        System.out.println("person1"+person1);
        System.out.println("person2"+person2);

        System.out.println("****************");
//        person1=person2;
        System.out.println(person1.equals(person2));

    }
}
