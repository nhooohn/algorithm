package cn.hucu.algorithm.sort;

import cn.hncu.algorithm.sort.Merge;

import java.util.Arrays;

public class TestMerge {
    public static void main(String[] args) throws Exception {
        Integer[] arr = {8, 4, 5, 7, 1, 3, 6, 2};
        Merge.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
