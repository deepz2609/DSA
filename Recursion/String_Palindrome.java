package Recursion;

public class String_Palindrome {
    public static void revrese(String s,int start,int end){
        if(start<end){
            int temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            revrese(s,start+1,end-1);
        }
    }
    public static void main(String[] args) {
        String s = "malayalam";
        revrese(s,0,s.length-1);
        for(int i: s){
            System.out.println(i);
        }
    }
}
