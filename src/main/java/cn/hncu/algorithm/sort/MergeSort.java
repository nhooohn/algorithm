package cn.hncu.algorithm.sort;

import java.util.Arrays;

/**
 * 类说明：归并排序
 */
public class MergeSort {
    public static Integer[] sort(Integer[] array) {
        if (array.length < 2) return array;
        /*切分数组，然后递归调用*/
        int mid = array.length / 2;
        Integer[] left = Arrays.copyOfRange(array, 0, mid);
        Integer[] right = Arrays.copyOfRange(array, mid, array.length);
        return merge(sort(left), sort(right));
    }

    /**
     * 归并排序——将两段排序好的数组结合成一个排序数组
     *
     * @param left
     * @param right
     * @return
     */
    public static Integer[] merge(Integer[] left, Integer[] right) {
        Integer[] result = new Integer[left.length + right.length];
        for (int index = 0, i = 0, j = 0; index < result.length; index++) {
            if (i >= left.length)/*左边数组已经取完，完全取右边数组的值即可*/
                result[index] = right[j++];
            else if (j >= right.length)/*右边数组已经取完，完全取左边数组的值即可*/
                result[index] = left[i++];
            else if (left[i] > right[j])/*左边数组的元素值大于右边数组，取右边数组的值*/
                result[index] = right[j++];
            else/*右边数组的元素值大于左边数组，取左边数组的值*/
                result[index] = left[i++];
        }
        return result;
    }
}
