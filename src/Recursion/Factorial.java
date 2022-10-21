package Recursion;

public class Factorial {

    public static int factorial(int n) {
        //Base Case
        if (n <= 1) {
            return n;
        //Recursive case
        } return n * factorial(n - 1);

    }

    public static void main(String[] args) {
        System.out.println(factorial(6));
    }
}
