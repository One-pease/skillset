/*
 * 文 件 名:  main测试
 * 版    权:  Huawei Technologies Co., Ltd. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  &lt;描述&gt;
 * 修 改 人:  ltf
 * 修改时间:  20200611
 * 跟踪单号:  &lt;跟踪单号&gt;
 * 修改单号:  &lt;修改单号&gt;
 * 修改内容:  &lt;修改内容&gt;
 */
package com.maintest;

import com.singleton.SingleObject;

/**
 * main测试
 *
 * @author lutengfei
 * @version [版本号, 2020/6/11 0011]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class MainTest
{
    public static void main(String[] args)
    {
        SingleObject singleton =  SingleObject.getInstance();
        String message = singleton.getMessage();
        return ;
    }
}