
public class Secondlarge {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 2, 5, 3, 6, 7, 4};
        int large = a[0];
        int secondlarge = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > large) {
                secondlarge = large;
                large = a[i];
            }
        }

        System.out.println("Second large: " + secondlarge);

    }
}
