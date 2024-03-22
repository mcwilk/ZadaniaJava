public class Palindrome2 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("kajak"));
    }

    public static boolean isPalindrome(String word) {
        int len = word.length();

        for (int i=0; i<(len/2); i++) {
            if (word.charAt(i) != word.charAt(len-1-i)) {
                return false;
            }
        }
        return true;
    }
}
