
/*Ananth interested in creating the acronyms for any word.
The definition of acronym is another word with a concatenation of its first letter,
 the number of letters between the first and last letter, and its last letter. 
 
 If a word has only two characters, then it is an acronym of itself.
 
 Examples:
	- Acronym of 'dog' is 'd1g'.
	- Acronym of 'another' is 'a5r'.
	- Acronym of 'ab' is 'ab'.

You are given a list of vocabulary, and another list of words.
Your task is to check is word with the vocabulary and
return "true" if atleast one of the following rules satisfied:
	1. acronym of the word should not match with any of the acronyms of vocabulary
	2. if acronym of the word matches with any of the acronyms of vocabulary
	'the word' and matching words in vocabulary should be same.
Otherwise, return 'false'.

Input Format:
-------------
Line-1: Space separated strings, vocabulary[] 
Line-2: Space separated strings, words[] 

Output Format:
--------------
Print N boolean values, where N = words.length. 


Sample Input-1:
---------------
cool bell cool coir move more mike
cool char move 

Sample Output-1:
----------------
true false false
*/
import java.util.*;
import java.lang.*;
import java.io.*;
class acronym{
    static int[] getarray(String s){
        int arr[]=new int[2];
        arr[0]=(int)s.charAt(0);
        arr[1]=(int)s.charAt(s.length()-1);
        return arr;
    }
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String arr1[]=bf.readLine().split(" ");
        String arr2[]=bf.readLine().split(" ");
        boolean ans[]=new boolean[arr2.length];
        int ind=0;
        for(String s:arr2){
            int ar[]=getarray(s);
            boolean flag=true;
            for(String s1:arr1){
                int ar1[]=getarray(s1);
                if(ar[0]==ar1[0] && ar[1]==ar1[1] && s.length()==s1.length()){
                    if(!s.equals(s1)){
                        flag=false;
                    }
                }
            }
            ans[ind]=flag;
            ind++;
        }
        for(boolean bn:ans){
            System.out.print(bn+" ");
        }
        
    }
}