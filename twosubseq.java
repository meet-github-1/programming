/*
Sundeep is working with integer sets.
He is given a set of integers nums[], consist of positive integers.
You have to find a subsequence of integet set nums[], where the sum of elements
is equal to the sum of the rest of the elements.

Check whether you are able to split the entire set nums[], into two subsequences
where the two subsequences never share the elements from same index.

If it is possible to split, print true.
otherwise print false.

Input Format:
-------------
Line-1: An integer N.
Line-2: N space separated integers, List[]

Output Format:
--------------
Print an integer output, the highest product.


Sample Input-1:
---------------
4
4 2 8 6

Sample Output-1:
----------------
true

Explanation:
----------
[4,6] and [2,8] sum of both the sets equal to 10.


Sample Input-2:
---------------
5
2 3 4 5 8

Sample Output-2:
----------------
false
*/
import java.util.*;
import java.lang.*;
class twosubseq{
    static int dp[];
    static boolean ispossible(int hsum,int arr[],int n){
        if(hsum==0){
            return true;
        }
        else if(n<0 || hsum<0){
            return false;
        }
        else{
            return(ispossible(hsum-arr[n],arr,n-1)||ispossible(hsum,arr,n-1));
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
            sum+=arr[i];
        }
        if(sum%2==0){
            System.out.println(ispossible(sum/2,arr,n-1));
            //p
            //System.out.println(Arrays.toString(dp));
        }
        else{
            System.out.println("false");
        }
    }
}