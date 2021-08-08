package com.ljl.demo.springcloud.test1.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author: jinlei.li
 * @time: 2021/8/8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private static final long serialVersionUID = -182304240145135630L;
    private Long id;
    private String serial;
}
