import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        singlyList sl = new singlyList();
        
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            sl.add(value);
        }
        int x = sc.nextInt();
         sl.insertAtBegin(x);
        sl.display();
        sc.close();
    }
}
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class singlyList {
    Node head;
    
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
   
    public void insertAtBegin(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" ");
            }
            temp = temp.next;
        }
    }
}
/////////////circularlist
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        CircularSinglyList cl = new CircularSinglyList();
        
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            cl.add(value);
        }
        int x = sc.nextInt();
        cl.insertAtBegin(x);
        cl.display();
        sc.close();
    }
}

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularSinglyList {
    Node head;
    Node tail; // We need tail to maintain circular reference efficiently
    
    public void add(int data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            // First node - points to itself
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            // Add at end and maintain circularity
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // Last node points back to head
        }
    }
    
    public void insertAtBegin(int data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            // Empty list - new node points to itself
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            // Insert at beginning and maintain circularity
            newNode.next = head;
            head = newNode;
            tail.next = head; // Tail should point to new head
        }
    }
    
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        
        Node temp = head;
        do {
            System.out.print(temp.data);
            if (temp.next != head) { // Check if next is not head to avoid extra space
                System.out.print(" ");
            }
            temp = temp.next;
        } while (temp != head); // Stop when we come back to head
        
        System.out.println(); // Add newline at the end
    }
}
////2nd type
import java.util.Scanner;

public class Main {
    
    // Node class
    static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    // Circular Singly Linked List class
    static class CircularSinglyList {
        Node head;
        Node tail;
        
        // Add node at the end
        public void add(int data) {
            Node newNode = new Node(data);
            
            if (head == null) {
                head = newNode;
                tail = newNode;
                newNode.next = head; // Circular reference
            } else {
                tail.next = newNode;
                tail = newNode;
                tail.next = head; // Maintain circularity
            }
        }
        
        // Insert at beginning
        public void insertAtBegin(int data) {
            Node newNode = new Node(data);
            
            if (head == null) {
                head = newNode;
                tail = newNode;
                newNode.next = head;
            } else {
                newNode.next = head;
                head = newNode;
                tail.next = head; // Update tail to point to new head
            }
        }
        
        // Display the circular list
        public void display() {
            if (head == null) {
                System.out.println();
                return;
            }
            
            Node temp = head;
            boolean first = true;
            do {
                if (!first) {
                    System.out.print(" ");
                }
                System.out.print(temp.data);
                first = false;
                temp = temp.next;
            } while (temp != head);
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            // Read the first integer (number of elements)
            if (!sc.hasNextInt()) {
                System.out.println();
                return;
            }
            int n = sc.nextInt();
            
            CircularSinglyList cl = new CircularSinglyList();
            
            // Read n integers and add to list
            for (int i = 0; i < n; i++) {
                if (!sc.hasNextInt()) {
                    break; // Stop if no more integers
                }
                int value = sc.nextInt();
                cl.add(value);
            }
            
            // Read the integer to insert at beginning
            if (sc.hasNextInt()) {
                int x = sc.nextInt();
                cl.insertAtBegin(x);
            }
            
            // Display the list
            cl.display();
            
        } catch (Exception e) {
            System.out.println();
        } finally {
            sc.close();
        }
    }
}
