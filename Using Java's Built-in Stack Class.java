import java.util.Stack;

public class BuiltInStackExample {
    public static void main(String[] args) {
        // Create a stack
        Stack<Integer> stack = new Stack<>();
        
        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        // Peek at top element
        System.out.println("Top element: " + stack.peek()); // 30
        
        // Pop elements
        System.out.println("Popped: " + stack.pop()); // 30
        System.out.println("Popped: " + stack.pop()); // 20
        
        // Check if empty
        System.out.println("Is empty: " + stack.isEmpty()); // false
        
        // Size of stack
        System.out.println("Size: " + stack.size()); // 1
    }
}
