
//     public static void main(String[] args) {
//         int a[] = {1};
//         ArrayList<Integer> arr = new ArrayList<>();
//         int i;
//         for (i = 1; i <= a.length - 1; i++) {
//             arr.add(a[i]);
//         }
//         arr.add(a[0]);
//         System.out.println(arr);
//     }
// }
import java.util.Arrays;

public class LeftRotateArrayByOne {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6};
        int temp = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }
        a[a.length - 1] = temp;

        System.out.println(Arrays.toString(a));
    }
}
