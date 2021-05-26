/*
You are provided a string of characters(lowercase only),
You can change the order of the characters of the string.
After changing the order, the resultant string should be 
no two immidiate characters equal.

Return true, if you are able to find such resultant string, 
Otherwise false.

Input Format:
-------------
A String S

Output Format:
--------------
Print a boolean value.


Sample Input-1:
---------------
aaabd

Sample Output-1:
----------------
true

Sample Input-2:
---------------
aaab

Sample Output-2:
----------------
false
*/
import java.util.*;
import java.lang.*;
class reorder{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        char arr[]=in.next().toCharArray();
        int ln=arr.length;
        Map<Character,Integer> mp=new HashMap<Character,Integer>();
        for(char c:arr){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        boolean flag=true;
        for(Map.Entry<Character,Integer> e:mp.entrySet()){
            int val=e.getValue();
            if(val>=2){
                if(ln%2==0){
                    if(val>ln/2){
                        flag=false;
                        break;
                    }
                }
                else{
                    if(val>ln/2+1){
                        flag=false;
                        break;
                    }
                }
            }
        }
        System.out.println(flag);
        
    }
}