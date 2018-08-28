package com.web.controller;


import com.web.dao.ArticlelistDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PageDrump {





    @RequestMapping("/about.htm")
    public String goabout() {
        System.out.println("goabout");
        return "about";
    }

    @RequestMapping("/contact.htm")
    public String gocontact() {

        System.out.println("gocontact");
        return "contact";
    }



}
