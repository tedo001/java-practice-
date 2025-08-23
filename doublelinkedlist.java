import java.util.Scanner;
class Node {
	int data ;
	Node next;
	Node prev;
	Node(int data) {
		this.data=data;
		this.next=null;
		this.prev=null;
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
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next = newNode;
		    newNode.prev=temp;
		}
		
	}


    static void fwdDisplay() {
    	Node temp= head;
    	while(temp!=null ) {
    		System.out.println(temp.data+" ");
    	temp=temp.next;
    	}
    }
    static void BwdDisplay() {
    	Node temp= head;
    	while(temp!=null ){
    
    		temp=temp.next;
    	}
        while(temp!=null ){
        	System.out.println(temp.data+" ");
            temp=temp.prev;
        }
    }
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("enter no of nodes:");
    	int n= sc.nextInt();
    	for(int i=0; i<n; i++) {
    		int data=sc.nextInt();
    		if(data>0) {
    			append(data);
    		}
    	}
    	System.out.println("froward display");
    	fwdDisplay();
    	System.out.println("backward display");
    	BwdDisplay();
    }
}
