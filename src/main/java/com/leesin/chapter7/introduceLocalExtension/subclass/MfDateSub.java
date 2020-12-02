package com.leesin.chapter7.introduceLocalExtension.subclass;

import java.util.Date;

/**
 * @description:
 * @author: dongxueyuan
 * @date: Created in 2020/12/2 10:06 上午
 */

/**
 * TODO: 把introduceForeignMethod的升级，多了构造函数，他就相当于Date了 1 Date的子类 2 Date的扩展方法
 **/
class MfDateSub extends Date {

    /**
     * 构造函数
     **/
    public MfDateSub(String dateString) {
        super(dateString);
    }

    ;

    /**
     * TODO: 转型函数，参数是原类【无法修改的类】对象
     **/
    public MfDateSub(Date arg) {
        super(arg.getTime());
    }

    /**
     * 把introduceForeignMethod的外加函数移到这里
     **/
    Date nextDay() {
        return new Date(getYear(), getMonth(), getDate() + 1);
    }
}
