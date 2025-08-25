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

	// Insert a new node at the end of the list
	static void insertAtEnd(int data) {
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

	// Display the linked list
	static void display() {
		Node temp = head;
		System.out.print("Linked List: ");
		while (temp != null) {
			System.out.print(temp.data + " -> ");
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
				insertAtEnd(data);
			} else {
				System.out.println("Only positive integers are allowed.");
			}
		}

		display();
		sc.close();
	}
}
