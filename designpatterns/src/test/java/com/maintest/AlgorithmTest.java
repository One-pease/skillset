package com.maintest;

import java.util.ArrayList;

public class AlgorithmTest
{
    public static void main(String[] args)
    {
        binarySearch();
    }

    // 阶乘
    private void factorial(){}

    // 二分法查找
    private static void binarySearch()
    {
        // 先排序再查找
        int[] a = new int[]{1,2,3,5,7,9};
        int key = 9;
        // 得到上边界和下边界 取中间值
        // 大于 上边界变为中间值 下边界仍是下边界
        // 小于 下边界变为中间值 上边界仍是上边界
        // 等于 返回
        int low = 0;
        int high = a.length-1;

        if(a[a.length-1] == key)
        {
            System.out.println(a.length-1);
            return;
        }
        while (low<high)
        {
            int mid = (low + high)/2;
            if(a[mid] < key)
            {
                low = mid + 1;
            }
            else if(a[mid] > key)
            {
                high = mid - 1;
            }
            else
            {
                    System.out.println(mid);
                    break;
            }
        }
        System.out.println(low+""+high);
    }

    // 冒泡排序
    private void bubbleSort()
    {
        int[] a = new int[]{1,16,4,3,7,8,3};

        // 两层循环 第一层循环 将数组元素最大值冒泡（放到最后面）
        for (int i=0; i<a.length-1; i++)
        {
            // 第二层循环是减去已经排序好的元素下标 即 a.length-1-i
            for(int j = 0; j<a.length-1-i; j++)
            {
                if(a[j] > a[j+1])
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        System.out.println(a);
    }
}
