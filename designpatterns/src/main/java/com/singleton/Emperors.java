/*
 * 文 件 名:  皇帝们
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

import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * huangdimen
 *
 * @author lutengfei
 * @version [版本号, 2020/6/22 0022]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class Emperors {

    // 皇帝数量
    private static int emperorsNum = 2;

    private static List<Emperors> emperorsList = new ArrayList<>();

    private static List<String> nameList = new ArrayList<>();

    // 第几个皇帝
    private static int countNumOfEmperor = 0;

    private static Logger LOG = LogManager.getLogger();

    private Emperors() {
    }

    private Emperors(String name) {
        nameList.add(name);
    }

    static {
        for (int i = 0; i < emperorsNum; i++) {
            emperorsList.add(new Emperors("jialilue" + i));
        }
    }

    public static Emperors getInstance() {
        SecureRandom secureRandom = new SecureRandom();
        countNumOfEmperor = secureRandom.nextInt(emperorsNum);
        return emperorsList.get(countNumOfEmperor);
    }

    public static void say() {
        LOG.info("im" + nameList.get(countNumOfEmperor));
    }
}