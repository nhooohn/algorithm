package cn.hucu.algorithm.sort;

import cn.hncu.algorithm.sort.Bubble;
import cn.hncu.algorithm.sort.Student;

import java.util.Arrays;

public class TestBubble {
    public static void main(String[] args) {
        Integer[] a = {4, 5, 6, 3, 2, 1};
        Bubble.sort(a);
        System.out.println("方式一："+Arrays.toString(a));

        int[] aa = {4, 5, 6, 3, 2, 1};
        Bubble.sortByBubble(aa);
        System.out.println("方式二："+Arrays.toString(aa));

    }
}
