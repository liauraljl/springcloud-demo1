package com.ljl.demo.springcloud.test1.service;

import com.ljl.demo.springcloud.test1.common.Payment;
import org.springframework.stereotype.Service;

/**
 * @author: jinlei.li
 * @time: 2021/8/8
 */
public interface PaymentService {

    // 插入
    public int insert(Payment payment);

    // 获取
    public Payment getPaymentById(Long id);

}
