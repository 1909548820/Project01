package com.tedu.bean;

import java.util.Date;

/**
 * @author fanghou
 * @date 2020/8/27 - 23:37
 */
public class Cutomer extends Person {
    public static void main(String[] args) {
        System.out.println ("helloWorld!!!");
        try {
            Date date=new Date ();
        } catch (Exception e) {
            e.printStackTrace ();
        }

    }

    @Override
    public void eat() {
        System.out.println ("客户吃饭");
        System.out.println ("ssss");


    }
}
