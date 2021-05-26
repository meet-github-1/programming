import java.util.*;
import java.lang.*;
class validparenthesis1{
    public boolean checkValidString(String s) {
       Stack<Integer> open=new Stack<Integer>();
        Stack<Integer> star=new Stack<Integer>();
        int len=s.length();
       for(int i=0;i<len;i++){
           if(s.charAt(i)=='('){
               open.push(i);
           }
           else if(s.charAt(i)=='*'){
               star.push(i);
           }
           else{
               if(!open.isEmpty()) open.pop();
               else if(!star.isEmpty()) star.pop();
               else return false;
           }
       }
      while(!open.isEmpty()){
          if(star.isEmpty() || star.pop()<open.pop()){
              return false;
          }
      }
        return true;
    }
    public static void main(String[] args){
       Scanner in=new Scanner(System.in);
       String s=in.next();
       System.out.println(new validparenthesis().checkValidString(s));
    }
}