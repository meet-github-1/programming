/*
Jagannadham is working with a set of words[], 
He wants to find out the common substring in all the words in the set,
and the substring should be the longest and also a prefix.

Can you help Jagannadham to find such substring.
If the substring is found, print it.
Otherwise, print an empty string,"".

Input Format:
-------------
Space separated strings, set of words[].

Output Format:
--------------
Print a string, the substring.


Sample Input-1:
---------------
apple applet application append

Sample Output-1:
----------------
"app"


Sample Input-2:
---------------
ant fox cat camel fish

Sample Output-2:
----------------
""

NOTE: 
	- " ", added for clarity no need to add in the output.
	- all the words consist of lowercase letters only.
*/
import java.util.*;
import java.lang.*;
class commonsubstring{
    static String cp(String s1,String s2){
        int len1=s1.length();
        int len2=s2.length();
        String res="";
        boolean flag=true;
        int i=0;
        for(i=0;i<Math.min(len1,len2);i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                res=s1.substring(0,i);
                flag=false;
                break;
            }
        }
        if(flag){
            res=s1.substring(0,i);
        }
        return res;
    }
    static String commsubstring(String arr[],int st,int ed){
        if(st==ed){
            return arr[st];
        }
        else if(ed-st+1==2){
            return cp(arr[st],arr[ed]);
        }
        else{
            int mid=(st+ed)/2;
            String s1=commsubstring(arr,st,mid);
            String s2=commsubstring(arr,mid+1,ed);
            return cp(s1,s2);
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String arr[]=in.nextLine().split(" ");
        int len=arr.length;
        System.out.println(commsubstring(arr,0,len-1));
    }
}