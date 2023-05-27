package cn.hucu.algorithm.sort;

public class TestFactorial {
    public static void main(String[] args) throws Exception {
        int result = factorial(0);//Exception in thread "main" java.lang.StackOverflowError
        System.out.println(result);
    }
    public static int factorial(int n){
        if (n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
}
