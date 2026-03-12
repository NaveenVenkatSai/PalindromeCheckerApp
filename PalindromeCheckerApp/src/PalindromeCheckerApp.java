public class PalindromeCheckerApp {
    public static boolean isPalindrome(String input) {
        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        int start = 0;
        int end = normalized.length() - 1;
        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String test1 = "Never Odd Or Even";
        String test2 = "Hello World";
        String test3 = "A man a plan a canal Panama";

        System.out.println(test1 + " -> " + isPalindrome(test1));
        System.out.println(test2 + " -> " + isPalindrome(test2));
        System.out.println(test3 + " -> " + isPalindrome(test3));
    }
}