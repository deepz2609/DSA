package Math;

import java.util.ArrayList;

public class Divisors {
    public static void main(String[] args) {
        int a=36;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=a;i++){
            if(a%i==0){
                list.add(i);
            }
        }
        for(int a1:list){
            System.out.print(a1+" ");
        }
    }
}
