public class PalindromeCheckerApp {
    public static boolean isPalindrome(String input) {
        input = input.replaceAll("\\s+", "").toLowerCase();
        char[] chars = input.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        while (start < end) {
            if (chars[start] != chars[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String test1 = "madam";
        String test2 = "hello";
        String test3 = "RaceCar";

        System.out.println(test1 + " -> " + isPalindrome(test1));
        System.out.println(test2 + " -> " + isPalindrome(test2));
        System.out.println(test3 + " -> " + isPalindrome(test3));
    }
}