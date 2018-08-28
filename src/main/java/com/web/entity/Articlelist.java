package com.web.entity;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


@Component
public class Articlelist {

    @Value("999999")
    private int id;
    @Value("Title")
    private String title;
    @Value("Author")
    private String author;
    @Value("Article")
    private String article;
    @Value("Abstract")
    private String abstract1;
    private int comments_count;
    @Value("img/1.jpg")
    private String background_picure_src;
    private int read_count;
    @Value("#{new java.text.SimpleDateFormat(\"yyyyMMdd\").parse(\"29990101\")}")
    private Date create_date;
    @Value("#{new java.text.SimpleDateFormat(\"yyyyMMdd\").parse(\"29990101\")}")
    private Date update_date;

    public int getRead_count() {
        return read_count;
    }

    public void setRead_count(int read_count) {
        this.read_count = read_count;
    }


    private String formatdate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAbstract1() {
        return abstract1;
    }

    public void setAbstract1(String abstract1) {
        this.abstract1 = abstract1;
    }

    public int getComments_count() {
        return comments_count;
    }

    public void setComments_count(int comments_count) {
        this.comments_count = comments_count;
    }

    public String getBackground_picure_src() {
        return background_picure_src;
    }

    public void setBackground_picure_src(String background_picure_src) {
        this.background_picure_src = background_picure_src;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public String getFormatdate() {
        return formatdate;
    }

    public void setFormatdate(String formatdate) {
        this.formatdate = formatdate;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Date getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(Date update_date) {
        this.update_date = update_date;
    }

    public void formart() {

        this.article = this.article.replaceAll("[\\r]", "<br>");
        System.out.println("formartarticle:" + this.id);

        this.abstract1 = this.abstract1.replaceAll("[\\r]", "<br>");
        System.out.println("formartabstract:" + this.id);

        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy", Locale.ENGLISH);
        this.formatdate = sdf.format(this.create_date);
        System.out.println("formartcreate_date:" + this.id);
    }
}
