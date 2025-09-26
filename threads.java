class mythreads extend threads{
  public void main() {
    System.out.println("next threads");
  }
}
public class Main(string[] args){
  mythreads a = new mythreads();
  a.start();
  System.out.println("first threads");
}
}
