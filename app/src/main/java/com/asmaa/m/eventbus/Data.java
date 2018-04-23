package com.asmaa.m.eventbus;

/**
 * Created by m on 4/23/2018.
 */

public class Data {
    private String txt;
    private String txt1;

    public Data(String txt, String txt1) {
        this.txt = txt;
        this.txt1 = txt1;
    }

    public String getTxt1() {
        return txt1;
    }

    public void setTxt1(String txt1) {
        this.txt1 = txt1;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }
}
