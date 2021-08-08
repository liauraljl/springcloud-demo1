package com.ljl.demo.springcloud.test1.service;

import com.ljl.demo.springcloud.test1.common.CommonResult;
import com.ljl.demo.springcloud.test1.common.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

/**
 * @author: jinlei.li
 * @time: 2021/8/8
 */
@Slf4j
@Service
public class RestService {
    public static final String PAYMENT_URL = "http://cloud-provider-test";

    @Autowired
    private RestTemplate restTemplate;

    public CommonResult<Payment> insert(Payment payment){
        log.info("====== 请求插入：" + payment);
        return restTemplate.postForObject(PAYMENT_URL + "/payment/insert", payment, CommonResult.class);
    }

    public CommonResult<Payment> getPayment(Long id){
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
    }
}
