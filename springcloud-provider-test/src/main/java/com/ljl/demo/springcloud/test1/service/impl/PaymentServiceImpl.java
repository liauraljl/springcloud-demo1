package com.ljl.demo.springcloud.test1.service.impl;

import com.ljl.demo.springcloud.test1.common.Payment;
import com.ljl.demo.springcloud.test1.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: jinlei.li
 * @time: 2021/8/8
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    private Map<Long, Payment> paymentMap = new HashMap<>();


    @Override
    public int insert(Payment payment) {
        paymentMap.put(payment.getId(), payment);
        return 1;
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentMap.get(id);
    }
}
