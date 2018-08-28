package com.web.controller;

import com.web.dao.ArticlelistDao;
import com.web.entity.Articlelist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class IndexPage {

    //文章列表
    @Autowired
    private List<Articlelist> articlelist;

    @Autowired
    private List<Articlelist> featuredlist;

    //文章DAO类
    @Autowired
    private ArticlelistDao articlelistDao;


    //默认转跳
    @RequestMapping(value = {"", "/"})
    public String InitPage() {
        return "forward:/index.htm";
    }

    //首页处理
    @RequestMapping("/index.htm")
    public String goindex(Map<String, List<Articlelist>> articlelistMap) {

        //获取文章列表
        System.out.println("goindex begin------------------");
        List<Articlelist> tmplist = articlelistDao.getArticlelistListbyIdDesc();
        List<Articlelist> tmpfeaturedlist = articlelistDao.getArticlelistListbyREAD_COUNTDesc();

        if (tmplist != null) {
            articlelist = tmplist;
        }
        if (tmpfeaturedlist != null) {
            featuredlist = tmpfeaturedlist;
        }

        for (int i = 0; i < articlelist.size(); i++) {
            articlelist.get(i).formart();
        }

        articlelistMap.put("articlelist", articlelist);
        articlelistMap.put("featuredlist", featuredlist);

        System.out.println("goindex end---------------------");
        return "index";
    }
}
