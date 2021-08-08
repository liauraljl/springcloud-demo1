package com.ljl.demo.springcloud.test1.service;

import com.ljl.demo.springcloud.test1.common.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author: jinlei.li
 * @time: 2021/8/8
 */
@Service
@FeignClient("cloud-provider-test")
public interface FeignService {
    @GetMapping("/payment/get/{id}")
    public CommonResult getPayment(@PathVariable("id") Long id);
}
