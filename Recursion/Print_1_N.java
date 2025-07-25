package Recursion;

public class Print_1_N {
    public static void Name(int i , int N){
        if(i>N){
            return;
        }
        System.out.println(i);
        Name(i+1, N);
    }

    public static void main(String[] args) {
        int n = 20;
        Name(1,n);
    }
}
