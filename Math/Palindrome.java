package Math;

public class Palindrome {
    public static void main(String[] args) {
        int a=121;
        int b=a;
        int rev=0;
        int count = (int) (Math.log10(a)+1);
        for(int i=0;i<count;i++){
            int rem=a%10;
            rev*=10;
            rev+=rem;
            a=a/10;

        }
        if(rev==b){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
