import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static boolean isPalindrome(String input) {
        input = input.replaceAll("\\s+", "").toLowerCase();
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            queue.add(ch);   // FIFO
            stack.push(ch);  // LIFO
        }
        while (!queue.isEmpty() && !stack.isEmpty()) {
            char fromQueue = queue.remove(); // dequeue
            char fromStack = stack.pop();    // pop

            if (fromQueue != fromStack) {
                return false;
            }
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