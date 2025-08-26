import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList dll = new DoublyLinkedList();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            dll.insertAtEnd(val);
        }
        
        dll.displayForward();   

        System.out.println();
        dll.displayBackward();  
    }
}


class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
         this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;
    Node tail;

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) { 
            head = tail = newNode;
        } else {
            tail.next = newNode;   
            newNode.prev = tail;   
            tail = newNode;        
        }
        }

    
    public void displayForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("");
         }

    public void displayBackward() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println("");
    }}
