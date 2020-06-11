/*
 * 文 件 名:  日志测试
 * 版    权:  Huawei Technologies Co., Ltd. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  &lt;描述&gt;
 * 修 改 人:  ltf
 * 修改时间:  0611
 * 跟踪单号:  &lt;跟踪单号&gt;
 * 修改单号:  &lt;修改单号&gt;
 * 修改内容:  &lt;修改内容&gt;
 */
package com.maintest;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;


/**
 * 日志测试
 *
 * @author lutengfei
 * @version [版本号, 2020/6/11 0011]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class LogTest
{

    @Test
    public void test() {
        Logger log = LogManager.getLogger(LogTest.class.getName());
        log.warn("this is message {}", 1);
        Exception ex = new Exception("this is a message.");
        log.error("a new exeception", ex);
        log.trace("trace message.");
        log.info("info message.");
        for (int i = 0; i < 120000; i++)
            log.debug("debug message:{}={}", "line", i);
    }
}