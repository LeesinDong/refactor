package com.leesin.chapter9.IntroduceNullObject;

/**
 * @description:
 * @author: dongxueyuan
 * @date: Created in 2020/11/23 9:07 上午
 */
public class NullPaymentHistory extends PaymentHistory{
    @Override
    int getWeeksDelinquentInLastYear() {
        return 0;
    }
}

