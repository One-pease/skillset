/*
 * 文 件 名:  单例类
 * 版    权:  Huawei Technologies Co., Ltd. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  &lt;描述&gt;
 * 修 改 人:  lutengfei
 * 修改时间:  20200611
 * 跟踪单号:  &lt;跟踪单号&gt;
 * 修改单号:  &lt;修改单号&gt;
 * 修改内容:  &lt;修改内容&gt;
 */
package com.singleton;

/**
 * 单例类
 *
 * @author lutengfei
 * @version [版本号, 2020/6/11 0011]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class SingleObject
{
    /**
     * 创建实例
     */
    private static SingleObject instance = new SingleObject();

    /**
     * 私有构造方法
     */
    private SingleObject(){}

    /**
     * 获取唯一可用对象
     */
    public static SingleObject getInstance()
    {
        return instance;
    }

    public String getMessage()
    {
        return  "hello word";
    }
}