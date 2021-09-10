package com.wang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/9/8 0008
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User
{
    private int id;
    private String name;
    private String pwd;
}
