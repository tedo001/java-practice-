import java.util.scanner;

public class Main {
  public static void main (string[] args){
    scanner sc = new scanner(system.in);

  int max=10;
    int[][] adjMatrix =new int[max][max];
    boolean[] visted = new boolean[max];
    int[] queue =new int[max];
    int front =0,rear=0;
    system.out.print("enter no of vertices:");
    int n =sc.nextInt();

  system.out.print("enter no of edges:");
    int edges =sc.nextInt();

  for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
      adjMatrix[i][j] = 0;
    }
  }
    
  for(int=0;i<edges;i++){
    system.ou.print("enter (u v):");
    int u =sc.nextInt();
      int v=sc.nextInt();
//*""
???????????????????????
  

              ??    ""*//
    while(front<rear){
      int current =queue[front++];
      sysytem.outprint(current +" ");

    for(int i= 0; i <n;i++){
      if(adjMatrix[current][i])== 1 && !visited[i]){
        visited[i]=true;
        queue[rear++]=i;
      }
    }
    }
  }
  }
