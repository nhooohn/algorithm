package cn.hncu.algorithm.sort;

/**
 * 归并排序
 */
public class Merge {
    //定义一辅助数组，空间换时间
    private static Comparable[] assist;

    //对数组a中的元素进行排序
    public static void sort(Comparable[] a){
        //1.初始化辅助数组assist；
        assist = new Comparable[a.length];
        //2.定义一个lo变量，和hi变量，分别记录数组中最小的索引和最大的索引；
        int lo=0;
        int hi=a.length-1;
        //3.调用sort重载方法完成数组a中，从索引lo到索引hi的元素的排序
        sort(a,lo,hi);
    }
    //对数组a中从lo到hi的元素进行排序
    private static void sort(Comparable[] a, int lo, int hi){
        //安全校验:递归终止条件
        if (hi<=lo){
            return;
        }
        //对lo到hi之间的数据分为两个组
        int mid = lo+(hi-lo)/2;//   5,9  mid=7

        //分别对每一组数据进行排序：递归
        sort(a,lo,mid);
        sort(a,mid+1,hi);

        //再把两个组中的数据进行归并
        merge(a,lo,mid,hi);
    }

    //对数组中，从lo到mid为一组，从mid+1到hi为一组，对这两组数据进行归并
    private static void merge(Comparable[] a, int lo, int mid, int hi){
        //lo到mid这组数据和mid+1到hi这组数据归并到辅助数组assist对应的索引处
        int i = lo;//定义一个指针，指向assist数组中开始填充数据的索引
        int p1 = lo;//定义一个指针，指向第一组数据的第一个元素
        int p2 = mid + 1;//定义一个指针，指向第二组数据的第一个元素

        //遍历，移动p1指针和p2指针，比较对应索引处的值，找出小的那个，放到辅助数组的对应索引处
        while(p1<=mid && p2<=hi){
            //比较对应索引处的值
            if (less(a[p1],a[p2])){
                assist[i++] = a[p1++];
            }else{
                assist[i++]=a[p2++];
            }
        }

        //上面的循环结束后，如果退出循环的条件是p1<=mid，则证明左边小组中的数据已经归并完毕，如果退出循环的条件是p2<=hi,则证明右边小组的数据已经填充完毕；
        //所以需要把未填充完毕的数据继续填充到assist中, //下面两个循环，只会执行其中的一个
        while(p1<=mid){
            assist[i++]=a[p1++];
        }

        while(p2<=hi){
            assist[i++]=a[p2++];
        }
        //把辅助数组中的元素拷贝到原数组中
        for(int index=lo;index<=hi;index++){
            a[index]=assist[index];
        }
    }

    //比较v元素是否小于w元素
    private static boolean less(Comparable v,Comparable w){
        return v.compareTo(w)<0;
    }

    //数组元素i和j交换位置
    private static void exch(Comparable[] a,int i,int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
