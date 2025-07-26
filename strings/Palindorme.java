
public class Palindorme {

    public static void main(String[] args) {
        String s = "madamw";
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(right) != s.charAt(left)) {
                System.out.println("Not palindrome");
                return;
            }
            left++;
            right--;
        }
        System.out.println("Palindrome");
    }
}
