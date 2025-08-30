public class CustomStack {
    private int maxSize;
    private int[] stackArray;
    private int top;
    
    // Constructor
    public CustomStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // Stack is initially empty
    }
    
    // Push operation
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
            return;
        }
        stackArray[++top] = value;
    }
    
    // Pop operation
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stackArray[top--];
    }
    
    // Peek operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stackArray[top];
    }
    
    // Check if stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }
    
    // Check if stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }
    
    // Display stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack (top -> bottom): ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
    
    // Main method to test
    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display(); // 30 20 10
        
        System.out.println("Peek: " + stack.peek()); // 30
        System.out.println("Pop: " + stack.pop());   // 30
        stack.display(); // 20 10
        
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.display(); // 60 50 40 20 10
        
        stack.push(70); // Stack is full message
    }
}
