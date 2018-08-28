package com.web.controller;

import com.web.pojo.Beantest;
import com.web.pojo.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class ContactSubmit {

    @Autowired
    public Beantest bt;


    @RequestMapping(value = "/ContactSubmit.htm")
    public String getInformation(Contact contact, Map<String, Beantest> map) {
        System.out.println("Name :" + contact.getName());
        System.out.println("Email :" + contact.getEmail());
        System.out.println("Message :" + contact.getMessage());

        map.put("bt", bt);
        System.out.println(this.bt.getBs1() + this.bt.getBs2());

        return "contactsuccess";
    }

}
