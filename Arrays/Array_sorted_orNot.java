
public class Array_sorted_orNot {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 2, 5, 3, 6, 7, 4};
        int b[] = {1, 2, 3, 4, 5, 7};
        boolean bool = true;
        for (int i = 1; i < b.length; i++) {
            if (b[i - 1] > b[i]) {
                bool = false;
                break;
            }
        }
        if (bool) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
