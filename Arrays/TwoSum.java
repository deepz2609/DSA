
import java.util.*;

public class TwoSum {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 2, 5, 3, 6, 7, 4};
        Arrays.sort(a);
        int target = 8;
        int left = 0, right = a.length - 1;
        while (left < right) {
            int sum = a[left] + a[right];
            if (sum == target) {
                System.out.println("(" + a[left] + " " + a[right] + ")");
                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
    }
}
