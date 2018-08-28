package com.web;



import java.text.ParsePosition;
import java.util.Date;


public class test {

    public static void main(String[] args) {
        Date a = new java.text.SimpleDateFormat("yyyyMMdd").parse("29990101",new ParsePosition(0));
        System.out.println(a);
    }

}