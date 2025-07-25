package Math;

public class ReverseANumber {
    public static void main(String[] args) {
        int a=12345678;
        int rev=0;
        int count = (int) (Math.log10(a)+1);
        for(int i=0;i<count;i++){
            int rem=a%10;
            rev*=10;
            rev+=rem;
            a=a/10;

        }
        System.out.println("Reverse of "+a+"="+rev);
    }
}
