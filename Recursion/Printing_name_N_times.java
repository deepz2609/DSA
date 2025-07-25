package Recursion;

public class Printing_name_N_times {
    public static void Name(int i , int N){
        if(i>N){
            return;
        }
        System.out.println("deepz");
        Name(i+1, N);
    }

    public static void main(String[] args) {
        int n = 20;
        Name(1,n);
    }
}
