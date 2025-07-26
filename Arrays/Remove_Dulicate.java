
import java.util.Arrays;

public class Remove_Dulicate {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 2, 5, 3, 6, 7, 4};
        Arrays.sort(a); // Sort the array first
        int i = 0;
        for (int j = 1; j < a.length; j++) {
            if (a[i] != a[j]) {
                i++;
                a[i] = a[j];
            }
        }
        for (int k = 0; k <= i; k++) {
            System.out.print(a[k] + " ");
        }
        System.out.println();
    }
}
