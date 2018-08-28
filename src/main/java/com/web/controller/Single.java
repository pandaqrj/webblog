package com.web.controller;


import com.web.dao.ArticlelistDao;

import com.web.entity.Articlelist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class Single {

    @Autowired
    private ArticlelistDao articlelistDao;
    @Autowired
    private Articlelist articleNo1;

    @RequestMapping("/single.htm")
    public String gosingle(Integer articleNo, Map<String, Articlelist> articlelistDaoMap) {

        System.out.println("gosingle begin----------");
        System.out.println("get id :" + articleNo.toString());
        Articlelist tmp = articlelistDao.findArticlelistById(articleNo);
        if (tmp != null) {
            articleNo1 = tmp;
        }


        System.out.println("articleNo1 id :" + articleNo1.getId());


        articleNo1.formart();
        articlelistDaoMap.put("articleNo1", articleNo1);
        System.out.println("gosingle end----------");
        return "single";

    }
}
