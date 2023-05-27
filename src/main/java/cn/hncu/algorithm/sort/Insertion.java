package cn.hncu.algorithm.sort;

/**
 * 插入排序
 */
public class Insertion {

    public static void sort(Comparable[] a) {
        //从第二个元素开始
        for (int i = 1; i < a.length; i++) {
            //当前元素为a[i],依次和i前面的元素比较，找到一个小于等于a[i]的元素
            for (int j = i; j > 0; j--) {
                if (greater(a[j - 1], a[j])) {
                    //交换元素
                    exch(a, j - 1, j);
                } else {
                    //找到了该元素，结束
                    break;
                }
            }
        }
    }

    /*
    比较v元素是否大于w元素
    */
    private static boolean greater(Comparable v, Comparable w) {
        return v.compareTo(w) > 0;
    }

    /*
    数组元素i和j交换位置
    */
    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
