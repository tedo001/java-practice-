public class Main {
    private int age ;
    private String name ;
    
    public  void setAge(int NewAge ){
        age = NewAge;
        }
    public  void setName(String NewName){
        name = NewName;
    } 
    public String getName(){
     return name;
   }
    public int getAge(){
     return age;
   }
    public static void main(String[] args) {
        Main m = new Main();
        m.setName("abi");
        m.setAge(10);
        System.out.println("Name:"+m.getName());
        System.out.println("Age:"+m.getAge());
    }
}
https://dodo.quantumnique.tech/