/*change the all  system.o.p into caps*/
import java.util.scanner;

public class Main{
  static int MAX = 10;
  static in[][] adjMatrix = new int[MAX][MAX];
    static in[][] visited = new int[MAX][MAX];
  static int n;

static void DFS()(int vertex)
  sysytem.out.print( vertex +" ");{
   visited[vertex] = true;

for(int i =0; i<n;i++){
  if(adjMatrix[vertex][i]== 1 && !visited[i]){
    DFS(i);
  }
}
}
public static void main(string[] args){
  scanner sc = new scanner(system.in);

  system.out.print("enter no of vertices;");
  n= sc.nextInt();

  system.out.print("enter no of edges");
  int edges = sc.nextInt();

  for(int i =0;i<n;i++){
    visited[i] =false;
    for(int j=0; j<n;j++){
      adjmMatrix[i][j]=0;
    }
  }
  for(int i=0;i<edges;i++){
    system.out.print("enter no edege(u v:):");
    int u =sc.nextint();
     int v =sc.nextint();
    adjMatrix[u][v]=1;
     adjMatrix[v][u]=1;
  }
  system.out.print("Dfs treversak starting from vetrtex 0:");
  DFS(0);
  sc.close();
  
