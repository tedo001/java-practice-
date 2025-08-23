import java.util.Scanner;
class Node {
	int data ;
	Node next;
	Node(int data) {
		this.data=data;
		this.next= null;
	}
}
public class Main
{
	static Node head= null;
	static void append(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
		}
		else {
			Node temp = head;
		}	
		while(temp.next!=null) {
				System.out.println(temp.data+"");
				temp=temp.next;
			}
	}
	public static void main(String[] args) {
		scanner sc = new scanner(System.in);
		System.out.println("enter no of nodes:");
		int n= sc.nextInt();
		for(int i=0; i<n; i++) {
			int data=sc.nextint();
			if(data>0) {
				append(data);
			}
		}
		display();
	}
}
