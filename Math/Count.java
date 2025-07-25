package Math;

public class Count {
    public static void main(String[] args) {
        int a=12345678;
        int count = (int) (Math.log10(a)+1);
        System.out.println("Count of " + a+ "="+count);
    }
}
