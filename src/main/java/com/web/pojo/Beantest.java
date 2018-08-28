package com.web.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Beantest {

    @Value("bs1")
    private String bs1;

    @Value("bs2")

    private String bs2;

    public String getBs1() {
        return bs1;
    }

    public void setBs1(String bs1) {
        this.bs1 = bs1;
    }

    public String getBs2() {
        return bs2;
    }

    public void setBs2(String bs2) {
        this.bs2 = bs2;
    }
}
