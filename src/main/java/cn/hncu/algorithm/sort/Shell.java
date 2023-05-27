package cn.hncu.algorithm.sort;

/**
 * 希尔排序：变种的插入排序，对插入排序做分组，提高插入排序的效率
 */
public class Shell {
    public static void sort(Comparable[] a) {
        //确定增量h的最大值
        int h = 1;
        while (h <= a.length / 2) {
            h = 2 * h + 1;
        }
        //当增长量h小于1，排序结束
        while (h >= 1) {
            //进行希尔排序
            //找到待插入的元素：第一个从h开始
            for (int i = h; i < a.length; i++) {
                //a[i]就是待插入的元素
                //把a[i]插入到a[i-h],a[i-2h],a[i-3h]...序列中
                for (int j = i ; j >= h; j-=h) {
                    //a[j]就是待插入元素，依次和a[j-h],a[j-2h],a[j-3h]进行比较，如果a[j]小，那么交换位置，如果不小于，a[j]大，则插入完成。
                    if (greater(a[j - h], a[j])) {
                        exch(a, j - h, j);
                    }else{
                        break;
                    }
                }
            }
            h = h / 2;
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
