package cn.hucu.algorithm.sort;

import cn.hncu.algorithm.sort.Selection;
import cn.hncu.algorithm.sort.Shell;

import java.util.Arrays;

public class TestShell {
    public static void main(String[] args) {
        Integer[] a = {9,1,2,5,7,4,8,6,3,54,6,8,7,9,2,10,1,4,3,2,10,12,1,5,6};
        Shell.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
