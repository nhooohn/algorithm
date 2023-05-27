package cn.hucu.algorithm.sort;

import cn.hncu.algorithm.sort.Quick;

import java.util.Arrays;

public class TestQuick {
    public static void main(String[] args) {
        Integer[] a = {4,6,8,7,9,2,10,1,4,3,2,10,12,1,5,6};
        Quick.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
