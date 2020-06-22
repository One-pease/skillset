/*
 * 文 件 名:  皇帝类
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
 * Emperor
 *
 * @author lutengfei
 * @version [版本号, 2020/6/22 0022]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class Emperor
{
    public static Logger LOG = LogManager.getLogger();
    private static final Emperor emperor = new Emperor();

    private Emperor()
    {
        // 私有构造函数 不允许创建
    }

    public static Emperor getInstance()
    {
        return emperor;
    }

    public void say()
    {
        LOG.info("i am emperor jialilue one...");
    }

}