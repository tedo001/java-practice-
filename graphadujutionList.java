import.java.util.scanner;
class node{
  int vertex;
  node next;

node(int v ){
  vertex =v;
}
}
public class Main {
  public static void main (string[] args){
    Scanner sc =new Scanner(System.in);

  System.out.println("enter no of vertices:");
    int vertices = sc.nextInt();

  node[] adjList = new node[vertices];

  System.out.println("enter no edege:");
    int edges= sc.int();
    for(int i =0;1< edges;i++){
      System.out.print("enter edge (u v ):");
      int u = sc.nextInt();
      int v = sc.nextInt();

    node newnode = new node(v);
      adjList[u] = newnode;

    newnode = new node(u);
      newnode next =adjList[v];
     
    }
    System.out.printlm("\nAdjacency list:"):
      for(int i=0;i<vertices;i++){
      System.out.print(i+":");
      node temp = adjList[i];
      while (temp!=null ){
        System.out.print(temp.vertex +">");
        temp=temp.next;
      }
      System.out.println("null");
    }
  }
}
    
