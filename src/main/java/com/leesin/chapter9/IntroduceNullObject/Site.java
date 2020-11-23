package com.leesin.chapter9.IntroduceNullObject;

import com.sun.xml.internal.bind.v2.TODO;

/**
 * @description:
 * @author: dongxueyuan
 * @date: Created in 2020/11/20 6:45 下午
 */
public class Site {
    // Customer getCustomer() {
    //     return _customer;
    // }

    Customer getCustomer() {
        return (_customer == null) ?
                Customer.newNull() :
                _customer;
    }

    Customer _customer;

    public static void main(String[] args) {
        Site site = new Site();
        // TODO: ① 创建nullxxx，作为xxx类的子类，nullxxx中重写xxx的方法，通过多态省去条件式，比如这里的NullCustomer、Customer
        // TODO: ② 统一在这里判断是否是null，返回相应的对象
        Customer customer = site.getCustomer();
        BillingPlan plan;
        // if (customer == null) plan = BillingPlan.basic();
        // TODO: ③ ==null 变成 isNull(这步没用)
        // if (customer.isNull()) {
        //     plan = BillingPlan.basic();
        // } else {
        //     plan = customer.getPlan();
        // }
        // TODO: ④ 去掉条件式，直接多态 null就是nullCustomer的getName，不是null就是Customer的getName
        plan = customer.getPlan();

        String customerName;
        // if (customer == null) customerName = "occupant";
        // if (customer.isNull()) {
        //     customerName = "occupant";
        // } else {
        //     customerName = customer.getName();
        // }
        // TODO: ④ 去掉条件式，直接多态 null就是nullCustomer的getName，不是null就是Customer的getName
        customerName = customer.getName();

        int weeksDelinquent;
        // if (customer == null) weeksDelinquent = 0;
        // if (customer.isNull()) {
        //     weeksDelinquent = 0;
        // } else {
        //     weeksDelinquent = customer.getHistory().getWeeksDelinquentInLastYear();
        // }
        // TODO: ④ 去掉条件式，直接多态 null就是nullCustomer的getName，不是null就是Customer的getName
        weeksDelinquent = customer.getHistory().getWeeksDelinquentInLastYear();
    }
}
