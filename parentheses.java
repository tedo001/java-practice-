import java.util.Scanner;
import java.util.*;


class Main{
  static boolean isValid(string s){
    stack<charactr> stack= new stack<>();
    for(char c:s){
      if(c=='(' || c=='[' || c=='{' ){
              stack.push(c);
      }
      else{
        if(stack.isEmpty())   return false;
         else{
              char top=stack.pop();
              if(c==')' && top!='(') ||
                (ch==']' && top!='[') ||
                (ch==')'  && top!='{' ) {
                return false;
              }
         }
        public static void main (string args[]){
            Scanner r = new Scanner(System.in);
            string str = nextLine();
            if(isValid(str)){
                System.out.print("valid parentheses");
            }
           else {
             System.out.print("invalid");
           }
  }
