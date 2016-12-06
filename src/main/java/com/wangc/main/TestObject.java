package com.wangc.main;

import com.wangc.model.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by wangc-ac on 2016/11/28.
 * test Object equals
 * no!
 */
public class TestObject {
    public static void main(String[] args){
        Person p1 = new Person();
        Person p2 = new Person();

        System.out.println(p1.equals(p2));

        p1.setName("a");
        p2.setName("b");
        List<Person> ls = new ArrayList<Person>();
        ls.add(p1);
        ls.add(p2);
        Collections.sort(ls);
        for (int i=0;i<ls.size();i++){
            System.out.println(ls.get(i));
        }
        System.out.println("Object equals test success!");
    }

}
