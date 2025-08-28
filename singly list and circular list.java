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
