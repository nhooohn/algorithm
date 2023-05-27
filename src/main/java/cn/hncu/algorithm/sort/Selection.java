package cn.hncu.algorithm.sort;

/**
 * 选择排序
 */
public class Selection {
    public static void sort(Comparable[] a){
        //最后一次拿倒数第二个元素与倒数第一个比较
        for (int i=0;i<=a.length-2;i++){
            //假定本次遍历，最小值所在的索引是i
            int minIndex=i;
            for (int j=i+1;j<a.length;j++){
                if (greater(a[minIndex],a[j])){
                    //跟换最小值所在的索引
                    minIndex=j;
                }
            }
            //交换i索引处和minIndex索引处的值
            exch(a,i,minIndex);
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
