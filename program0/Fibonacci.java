public class Fibonacci {
    /** Returns fib o f x */
    public static int fib(int x){
        int pre = 0;
        int cur = 1;
        int temp = 0;

        for (int i=0;i < x;i++) {
            if (x == 0) {
                return 1;
            }else
                temp = cur;
                cur += pre;
                pre = temp;
        }
        return pre;
    }
    public static void main(String[] args) {
        System.out.println(fib(8));
    }
}