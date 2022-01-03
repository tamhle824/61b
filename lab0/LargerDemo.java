public class LargerDemo {
    public static int larger(int x, int y) {
        if (x > y){
            return x;
        }
        return y;
    }
    public static void main(String[] args) {
        System.out.println(larger(-5,10));
    }
}
/*
1. Functions must be declared as part of a class in Java.
   A function is part of a class called a "method"
   All functions are methods in Java.
2. TO define a function in Java, use "public static".
3. All parameters of a function must a declared type,
   and return value of function must have a declared type.
   Functions in Java return only one value!
 */

