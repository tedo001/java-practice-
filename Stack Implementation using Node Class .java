// Main class to demonstrate the stack
public class StackWithNode {
    
    // 1. Define the Node class
    private static class Node {
        int data;       // Stores the value
        Node next;      // Reference to the next node
        
        // Node constructor
        Node(int data) {
            this.data = data;
            this.next = null;  // Initially, node doesn't point to anything
        }
    }
    
    // 2. Stack class implementation
    private static class Stack {
        private Node top;   // Reference to the top node of the stack
        private int size;   // Tracks the number of elements in the stack
        
        // Stack constructor
        public Stack() {
            top = null;     // Empty stack initially
            size = 0;       // Size is 0 for empty stack
        }
        
        // 3. Push operation: Add element to top of stack
        public void push(int value) {
            Node newNode = new Node(value); // Create new node
            newNode.next = top;             // New node points to current top
            top = newNode;                  // Update top to be the new node
            size++;                         // Increase size counter
            System.out.println("Pushed: " + value);
        }
        
        // 4. Pop operation: Remove and return top element
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow! Cannot pop from empty stack.");
                return -1;  // Return sentinel value indicating error
            }
            
            int poppedValue = top.data;  // Store the value to return
            top = top.next;              // Move top to next node
            size--;                      // Decrease size counter
            System.out.println("Popped: " + poppedValue);
            return poppedValue;
        }
        
        // 5. Peek operation: View top element without removing
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty. Nothing to peek.");
                return -1;
            }
            return top.data;
        }
        
        // 6. Check if stack is empty
        public boolean isEmpty() {
            return top == null;
        }
        
        // 7. Get the size of the stack
        public int size() {
            return size;
        }
        
        // 8. Display all elements in the stack (top to bottom)
        public void display() {
            if (isEmpty()) {
                System.out.println("Stack is empty.");
                return;
            }
            
            System.out.print("Stack (top → bottom): ");
            Node current = top;
            while (current != null) {
                System.out.print(current.data + " → ");
                current = current.next;
            }
            System.out.println("NULL");
        }
        
        // 9. Clear the entire stack
        public void clear() {
            top = null;
            size = 0;
            System.out.println("Stack cleared.");
        }
    }
    
    // 10. Main method to test the stack
    public static void main(String[] args) {
        Stack stack = new Stack();
        
        System.out.println("=== Stack Operations ===");
        
        // Push operations
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display(); // Should show: 30 → 20 → 10 → NULL
        
        // Peek operation
        System.out.println("Top element: " + stack.peek()); // Should be 30
        
        // Pop operations
        stack.pop();
        stack.display(); // Should show: 20 → 10 → NULL
        
        stack.pop();
        stack.pop();
        stack.pop(); // This should show underflow message
        
        // Test isEmpty and size
        System.out.println("Is stack empty? " + stack.isEmpty()); // true
        System.out.println("Stack size: " + stack.size());        // 0
        
        // Add more elements
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.display(); // Should show: 300 → 200 → 100 → NULL
        
        // Clear stack
        stack.clear();
        stack.display(); // Should show: Stack is empty.
    }
}
