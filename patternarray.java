/*Pramod is working on patterns.
He is given a pattern P of length N-1, He needs to construct a list L[] of length N.
And the list L[] has to construct using the integers from 1 to N only.

To construct the list, He defined a rule set as follows based on the pattern P:
	- if P[i] == 'A', then L[i] < L[i+1].
	- if P[i] == 'D', then L[i] > L[i+1].
	- And the L[] should be lexicographically smallest.

You will be given the pattern P of length N-1 
Your task is to construct the list using the pattern and 
according to the rules set by Pramod.

NOTE:
Can you solve the problem in O(N) time complexity?

Input Format:
-------------
A string, the pattern consist of only A and D alphabets.

Output Format:
--------------
Print the list, according to the given pattern.


Sample Input-1:
---------------
DAA

Sample Output-1:
----------------
[2, 1, 3, 4]

Explanation:
------------
Using the sequence DAA there are more than one way of creating the list:
for example: [2,1,3,4], [3,1,2,4], [4,1,2,3].
According to the given info, the result should be lexicographically smallest.
So the answer is [2,1,3,4].


Sample Input-2:
---------------
ADA

Sample Output-2:
----------------
[1, 3, 2, 4]

Explanation:
------------
Using the sequence ADA there are more than one way of creating the list:
for example: [1,3,2,4], [1,4,2,3], [2,4,1,3], [2,3,1,4]..etc
According to the given info, the result should be lexicographically smallest.
So the answer is [1,3,2,4].
*/
import java.util.*;
import java.lang.*;
class patternarray{
    static void reverse(int st,int ed,int arr[]){
        int len=ed-st+1;
        //System.out.println(st+" "+ed);
        for(int i=0;i<len/2;i++){
            int temp=arr[st+i];
            arr[st+i]=arr[ed-i];
            arr[ed-i]=temp;
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s=in.next();
        int len=s.length();
        int arr[]=new int[len+1];
        for(int i=0;i<=len;i++){
            arr[i]=i+1;
        }
        int prev=-1;
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='D' && prev==-1){
                prev=i;
            }
            else if(s.charAt(i)=='A'){
                if(prev!=-1){
                    reverse(prev,i,arr);
                    prev=-1;
                }
                
            }
        }
        if(prev!=-1){
            if(prev==len-1){
                int temp=arr[prev];
                arr[prev]=arr[prev+1];
                arr[prev+1]=temp;
            }
            else{
                //p
                reverse(prev,len,arr);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
