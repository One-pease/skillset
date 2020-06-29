/*
 * 文 件 名:  常用算法
 * 版    权:  Huawei Technologies Co., Ltd. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  &lt;描述&gt;
 * 修 改 人:  ltf
 * 修改时间:  20200615
 * 跟踪单号:  &lt;跟踪单号&gt;
 * 修改单号:  &lt;修改单号&gt;
 * 修改内容:  &lt;修改内容&gt;
 */
package com.maintest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
import netscape.javascript.JSObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 常用算法
 *
 * @author lutengfei
 * @version [版本号, 2020/6/15 0015]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class AlgorithmTest
{
    
    private static Logger LOG = LogManager.getLogger();
    
    public static void main(String[] args)
    {
        
        int[] a = new int[] {6, 32, 4, 5, 7, 8, 3, 5, 7, 2};
        dichotomy(a);
    }
    
    private static void dichotomy(int[] a)
    {
        bubbleSort(a);
        
        int max = a.length;
        int min = 0;
        int key = 2;
        while (min < max)
        {
            int mid = (max + min) / 2;
            if (a[mid] < key)
            {
                min = mid;
            }
            else if (a[mid] > key)
            {
                max = mid;
            }
            else
            {
                LOG.info("mid is " + mid);
                return;
            }
        }
    }
    
    private static void bubbleSort(int[] a)
    {
        // 循环将元素与邻近元素比较并替换位置
        for (int i = 0; i < a.length; i++)
        {
            // 循环将剩余元素与邻近元素比较并替换位置 -1 是最后一位不比较
            for (int j = 0; j < a.length - i - 1; j++)
            {
                int temp;
                if (a[j] > a[j + 1])
                {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        LOG.info("a is " + JSON.toJSONString(a));
        
    }
}