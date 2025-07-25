package Math;

public class GcdOrHcf {
    public static void main(String[] args) {
        int a= 20;
        int b=15;
        while(a > 0 && b > 0){
            if(a>b){
                a%=b;
            }
            else{
                b%=a;
            }

        }
        if(a == 0){
            System.out.println(b);
        }
        else{
            System.out.println(a);
        }
    }
}
