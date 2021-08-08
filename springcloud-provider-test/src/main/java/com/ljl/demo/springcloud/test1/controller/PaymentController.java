package com.ljl.demo.springcloud.test1.controller;

import com.ljl.demo.springcloud.test1.common.CommonResult;
import com.ljl.demo.springcloud.test1.common.Payment;
import com.ljl.demo.springcloud.test1.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author: jinlei.li
 * @time: 2021/8/8
 */
@Slf4j
@RestController
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping("/payment/insert")
    public CommonResult insert(@RequestBody Payment payment) {
        int result = paymentService.insert(payment);
        log.info("====== 插入结果：" + result);
        if(result > 0) {
            return new CommonResult(200, "插入数据成功，服务端口：" + serverPort);
        }else {
            return new CommonResult(500, "插入数据失败");
        }

    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment result = paymentService.getPaymentById(id);

        log.info("====== 查询结果：" + result);
        if(result != null) {
            return new CommonResult(200, "查询成功，服务端口：" + serverPort, result);
        }else {
            return new CommonResult(500, "查询失败");
        }

    }
}
