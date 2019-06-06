package com.nm.service.impl;

import com.nm.service.IPayservice;

/**
 * @Author: 韩老魔
 * @Date: 2019/6/6 0006 13:06
 */
public class PayService implements IPayservice {
    @Override
    public void queryPayRecords() {
        System.out.println("查询付款记录");
    }
}
