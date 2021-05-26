/*
Given a set of weights of n items weights[], and another item wieght w.
Your task is to check if the sum of weights of continuous subset is equal to 
one of the multiple of w, where subset size should be minimum 2.

For example: Mulitple of w means, w=3 then multiple of w are
3, 6, 9, 12, .... so on.

Print true, if such subset sum is possible.
Otherwise, print false.

Input Format:
-------------
Line-1 : Two integers n and w, number of weights and weight to match.
Line-2 : n space separated integers, weights of n items.

Output Format:
--------------
Print a boolean value.


Sample Input-1:
---------------
5 4
1 2 3 5 6

Sample Output-1:
----------------
false


Sample Input-2:
---------------
5 4
1 2 3 6 5

Sample Output-2:
----------------
true

Explanation: 
------------
sum of  continuous subset of weights [1,2,3,6]  equals to 12, multiple of 4.

*/
import java.util.*;
import java.lang.*;
class multiplesubset{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int w=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
       int csum=0;
       int mod[]=new int[w];
       for(int i=0;i<n;i++){
           csum+=arr[i];
           mod[((csum%w)+w)%w]+=1;
       }
       boolean flag=false;
        for(int i=0;i<w;i++){
            if(mod[i]>1){
                flag=true;
                break;
            }
        }
        System.out.println(flag);
    }
}