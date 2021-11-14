package com.kqt.filter;

public class UTF8Filter extends org.springframework.web.filter.CharacterEncodingFilter {

    public UTF8Filter(){
        super("utf-8");
    }

}
