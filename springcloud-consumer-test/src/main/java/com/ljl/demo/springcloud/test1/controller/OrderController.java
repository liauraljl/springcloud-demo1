package com.ljl.demo.springcloud.test1.controller;

import com.ljl.demo.springcloud.test1.common.CommonResult;
import com.ljl.demo.springcloud.test1.common.Payment;
import com.ljl.demo.springcloud.test1.service.FeignService;
import com.ljl.demo.springcloud.test1.service.RestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: jinlei.li
 * @time: 2021/8/8
 */
@Slf4j
@RestController
public class OrderController {

    @Autowired
    private RestService restService;

    @Autowired
    private FeignService feignService;

    /**
     * 1:rest,2:feign
     */
    private static int apiType = 2;

    @PostMapping("/consumer/payment/insert")
    public CommonResult<Payment> insert(@RequestBody Payment payment) {
        log.info("====== 请求插入：" + payment);
        return restService.insert(payment);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
        return apiType == 1 ? restService.getPayment(id) : feignService.getPayment(id);
    }
}
