package com.leesin.chapter7.introduceLocalExtension.wrapper;

import java.util.Date;

/**
 * @description:
 * @author: dongxueyuan
 * @date: Created in 2020/12/2 10:14 上午
 */
public class MfDateWrap {
    private Date _original;

    /**
     * 构造函数变成委托
     **/
    public MfDateWrap(String dateString) {
        _original = new Date(dateString);
    }

    /**
     * TODO: 转型函数变成赋值
     **/
    public MfDateWrap(Date arg) {
        _original = arg;
    }

    ;

    public Date toDate() {
        return new Date();
    }

    /**
     * TODO: 为原来无法改变的类提供委托函数
     **/
    public int getYear() {
        return _original.getYear();
    }

    public boolean equals(MfDateWrap arg) {
        return (toDate().equals(arg.toDate()));
    }

    public int getMonth() {
        return _original.getMonth();
    }

    public int getDate() {
        return _original.getDate();
    }

    /**
     * TODO: 变成调用当前类的代理方法
     **/
    Date nextDay() {
        return new Date(getYear(), getMonth(), getDate() + 1);
    }
}
