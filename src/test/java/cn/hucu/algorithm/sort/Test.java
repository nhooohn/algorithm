package cn.hucu.algorithm.sort;

import cn.hncu.algorithm.sort.Bubble;
import cn.hncu.algorithm.sort.Student;

public class Test {
    @org.junit.Test
    public void main() {
        Student stu1 = new Student();
        stu1.setUsername("zhangsan");
        stu1.setAge(17);
        Student stu2 = new Student();
        stu2.setUsername("lisi");
        stu2.setAge(19);
        Comparable max = getMax(stu1, stu2);
        System.out.println("年龄较大者"+max);
    }

    //测试方法，获取两个元素中的较大值
    private static Comparable getMax(Comparable stu1, Comparable stu2) {
        int i = stu1.compareTo(stu2);
        return i > 0 ? stu1 : stu2;
    }

    @org.junit.Test
    public  void test(){
        Student stu1 = new Student();
        stu1.setUsername("zhangsan");
        stu1.setAge(100);
        Student stu2 = new Student();
        stu2.setUsername("lisi");
        stu2.setAge(19);
        Student stu3 = new Student("aaa",123);
        Student stu4 = new Student("abc",22);
        Student[] students={stu1,stu2,stu3,stu4};
        Bubble.sort(students);
        for (Student student : students) {
            System.out.println(student);
        }
    }

}
