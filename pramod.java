/*

Pramod is working on words. He used to remove all the duplicate letters from a
word.

Pramod is given a word W. His task to remove all theduplicated letters from W,
in such a way that the resulatant word R, contains no duplicate letters and all
distinct letters from W should be there in R.and R should appear first in the 
dictionary order. 

Input Format:
-------------
A String, the word W.

Output Format:
--------------
Print a String, resulatant word R.


Sample Input-1:
---------------
cbadccb

Sample Output-1:
----------------
adcb

Sample Input-2:
---------------
silicosis

Sample Output-2:
----------------
ilcos    
*/
import java.util.*;
import java.lang.*;
class pramod{
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        String sr=in.next();
       Stack<Character> s=new Stack<Character>();
       Map<Character,Integer> mp=new HashMap<Character,Integer>();
       char arr[]=sr.toCharArray();
       int length=arr.length;
       for(int i=0;i<length;i++){
           mp.put(arr[i],i);
       }
       for(int i=0;i<length;i++){
           if(s.isEmpty()){
               s.push(arr[i]);
           }
           else if(s.contains(arr[i])){
               continue;
           }
           else{
               while(!s.isEmpty() && s.peek()>arr[i] && mp.get(s.peek())>i){
                   s.pop();
               } 
               s.push(arr[i]);
           }
       }
       StringBuilder r=new StringBuilder();
       while(!s.isEmpty()){
           r=r.append(s.pop());
       }
       System.out.println(r.reverse());
       
       
    }
}