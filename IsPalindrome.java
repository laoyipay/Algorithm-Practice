package Java;

/**
 *
 * @author Yi
 */
public class IsPalindrome {

    public static boolean isPalindrome(String str) {
        if (str.length() == 0 || str == null) {
            return false;
        }

        for (int i = 0; i < str.length() / 2 - 1; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String name = "laoyi";
        String pal = "aka";

        System.out.print("Is laoyi Palindrome? " + isPalindrome(name));
        System.out.print("Is aka Palindrome? " + isPalindrome(pal));

    }

}
