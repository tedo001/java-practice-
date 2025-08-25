import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {
    static Node head = null;

    // Insert a new node at the beginning of the list
    static void insertAtBegin(int data) {
        Node newNode = new Node(data);
        newNode.next = head;  // Link new node to current head
        head = newNode;       // Update head to new node
    }

    // Display the linked list
    static void display() {
        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter data for node " + (i + 1) + ": ");
            int data = sc.nextInt();
            if (data > 0) {
                insertAtBegin(data);
            } else {
                System.out.println("Only positive integers are allowed.");
            }
        }

        display();
        sc.close();
    }
}
