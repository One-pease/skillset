/*
 * 文 件 名:  静态内部类实现延时加载
 * 版    权:  Huawei Technologies Co., Ltd. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  &lt;描述&gt;
 * 修 改 人:  ltf
 * 修改时间:  0622
 * 跟踪单号:  &lt;跟踪单号&gt;
 * 修改单号:  &lt;修改单号&gt;
 * 修改内容:  &lt;修改内容&gt;
 */
package com.singleton;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 静态内部类实现延时加载
 *
 * @author lutengfei
 * @version [版本号, 2020/6/22 0022]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class Singleton {
    private static Logger log = LogManager.getLogger();

    private Singleton() {
    }

    private static class SingletonHandle {
        private static Singleton singleton = new Singleton();

        static {
            log.info("load innner class");
        }
    }

    public static Singleton getInstance() {
        return SingletonHandle.singleton;
    }
}