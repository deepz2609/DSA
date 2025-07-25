package Recursion;

public class Reverse_array {
    public static void revrese(int a[],int start,int end){
        if(start<end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            revrese(a,start+1,end-1);
        }
    }
    public static void main(String[] args) {
        int a[] = {1,2,4,5,6};
        revrese(a,0,a.length-1);
        for(int i: a){
            System.out.println(i);
        }
    }
}
