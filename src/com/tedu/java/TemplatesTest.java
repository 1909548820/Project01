package com.tedu.java;


import com.tedu.bean.Cutomer;

import java.util.ArrayList;

/**
 * @author fanghou
 * @date 2020/8/31 - 22:24
 */
public class TemplatesTest {

    private static final Cutomer CUST=new Cutomer ();

    public static void main(String[] args) {
        System.out.println ();

        String[] arr={"tom", "wangwu", "hanmei", "lilei"};
        for (int i=0; i < arr.length; i++) {
            System.out.println (arr[i]);
        }
        for (String s : arr) {
            System.out.println (s);
        }

        ArrayList list=new ArrayList ();
        list.add (123);
        list.add (456);
        list.add (789);

        //list.fori
        for (int i=0; i < list.size (); i++) {

        }
        //list.forr
        for (int i=list.size () - 1; i >= 0; i--) {

        }

        ArrayList list1=new ArrayList ();
        list1.add ("12355s");
        list1.add ("df56");
        list1.add ("sss444");

        //ifn
        if (list1 == null) {

        }

        //inn
        if (list1 != null) {

        }
        //变形xxx.nn

    }

}

