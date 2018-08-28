package com.web.dao;


import com.web.entity.Articlelist;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.ArrayList;


@Mapper
@Component
public interface ArticlelistDao {

    @Select("SELECT ID" +
            ",TITLE" +
            ",AUTHOR" +
            ",ARTICLE" +
            ",ABSTRACT as ABSTRACT1" +
            ",COMMENTS_COUNT" +
            ",BACKGROUND_PICURE_SRC" +
            ",READ_COUNT" +
            ",CREATE_DATE" +
            ",UPDATE_DATE " +
            "FROM ARTICLELIST " +
            "WHERE ID = #{id}" )
    Articlelist findArticlelistById(int id);


    @Select("SELECT ID" +
            ",TITLE" +
            ",AUTHOR" +
            ",ARTICLE" +
            ",ABSTRACT as ABSTRACT1" +
            ",COMMENTS_COUNT" +
            ",BACKGROUND_PICURE_SRC" +
            ",READ_COUNT" +
            ",CREATE_DATE" +
            ",UPDATE_DATE " +
            "FROM ARTICLELIST " +
            "ORDER BY ID DESC " +
            "LIMIT 4" )
    ArrayList<Articlelist> getArticlelistListbyIdDesc();

    @Select("SELECT ID" +
            ",TITLE" +
            ",AUTHOR" +
            ",ARTICLE" +
            ",ABSTRACT as ABSTRACT1" +
            ",COMMENTS_COUNT" +
            ",BACKGROUND_PICURE_SRC" +
            ",READ_COUNT" +
            ",CREATE_DATE" +
            ",UPDATE_DATE " +
            "FROM ARTICLELIST " +
            "ORDER BY READ_COUNT DESC " +
            "LIMIT 6" )
    ArrayList<Articlelist> getArticlelistListbyREAD_COUNTDesc();

}
