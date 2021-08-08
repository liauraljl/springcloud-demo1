package com.ljl.demo.springcloud.test1.common;

/**
 * @author: jinlei.li
 * @time: 2021/8/8
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 通用结果
 * @param <T>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> implements Serializable {

    private static final long serialVersionUID = -1718659063926575151L;
    private int code;
    private String msg;
    private T data;

    public CommonResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
