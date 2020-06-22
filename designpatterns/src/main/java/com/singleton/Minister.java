/*
 * 文 件 名:  minister
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
 * 大臣
 *
 * @author lutengfei
 * @version [版本号, 2020/6/22 0022]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class Minister
{
    private static Logger LOG = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
    public static void main(String[] args)
    {
        Emperors.getInstance().say();
        LOG.info("minister one see emperor jialilue one");
    }
}