import java.util.*;

public class Main {
    
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

   
    static class Queue {
        Node front, rear;

        Queue() {
            this.front = this.rear = null;
        }

        
        void enqueue(int callId) {
            Node newNode = new Node(callId);
            if (rear == null) {
                front = rear = newNode;
                return;
            }
            rear.next = newNode;
            rear = newNode;
        }

        
        void dequeue() {
            if (front == null) {
                System.out.println("Queue is Empty");
                return;
            }
            System.out.println(front.data);
            front = front.next;

            if (front == null) { 
                rear = null;
            }
        }

       
        void front() {
            if (front == null) {
                System.out.println("Queue is Empty");
            } else {
                System.out.println(front.data);
            }
        }
    }

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        Queue q = new Queue();

        for (int i = 0; i < T; i++) {
            String line = sc.nextLine().trim();
            if (line.startsWith("ENQUEUE")) {
                int callId = Integer.parseInt(line.split(" ")[1]);
                q.enqueue(callId);
            } else if (line.equals("DEQUEUE")) {
                q.dequeue();
            } else if (line.equals("FRONT")) {
                q.front();
            }
        }
    }
}//queue
//stack
  import java.util.Scanner;

public class Main {

    
   static class Node {
        int date;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        private Node top;

        
        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = top;
            top = newNode;
        }

        public int pod() {
            if (top == null) {
                System.out.println("Stack Underflow");
                return -1;
            }
            int popped = top.data;
            top = top.next;
            return popped;
        }

        
        public int peek() {
            if (top == null) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return top.data;
        }

        
        public void printStack() {
            Node temp = top;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();  
        Stack stack = new Stack();

       
        for (int i = 0; i < size; i++) {
            int element = sc.nextInt();
            stack.push(element);
        }

        
        stack.printStack();
    }
}
