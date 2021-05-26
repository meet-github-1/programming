import java.util.*;
import static java.lang.System.out;
//import javafx.util.*;
class samepath{
     static int num(String s){
          Map<String,Integer> map=new HashMap<String,Integer>();
          int x=0,y=0,count=0;
          map.put(Integer.toString(x)+Integer.toString(y),1);
          for(int i=0;i<s.length();i++){
               switch(s.charAt(i)){
                    case 'N':
                      y=y+1;
                      break;
                    case 'S':
                        y=y-1;
                        break;
                    case 'W':
                        x=x-1;
                        break;
                    case 'E':
                         x=x+1;
                         break;
                    default:
                        break;

               }
               String p=Integer.toString(x)+Integer.toString(y);
               if(map.getOrDefault(p,0)==0){
               	map.put(p,1);
                  count=count+5;

               }
               else{
                   count=count+1;
               }

          }
          return count;
     }
	 public static void main(String[] args){
	 	   Scanner in =new Scanner(System.in);
	       String s=in.next();
	       out.println(num(s));



	 }
}