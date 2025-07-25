package Recursion;

public class Sum_first_N {
    public static void sum(int N, int sum) {

        if (N < 1) {
            System.out.println(sum);
            return;
        }
        sum(N-1,sum+N);
    }

    public static void main(String[] args) {
        int n = 20;
        int sum = 0;
        sum(n,sum);

    }
}
