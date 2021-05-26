/*
Prashanth Varma is working on integer sets.
He is given an Zero-Set ZS of length N, the set conatins only 0's.
Also he is provided with a set of M triplets[], where triplet[i] = [start, end, val].
The triplet contains the following values: start means starting index, 
end menas last index, and val means value to be added.

Prashanth has to perform M operations as follows:
    - He need to read three values from the triplet[i], where 0<= i < M.
    - He needs to add the value of 'val' to all the elements in ZS,
      between start and end indices, both are inclusive.
    
Your task is to help Prashanth Varma, to perform M operations on ZS
and return the final ZeroSet ZS.

NOTE:
Can you solve the problem in O(n+k) time complexity?

Input Format:
-------------
Line-1: Two space separated integers N and M, size of ZS and number of triplets.
Next M lines: Three space separated integers, the triplets [start, end, val]

Output Format:
--------------
Print the final ZS, after performing M operations.


Sample Input:
-------------
5 3
1 3 2
2 4 3
0 2 -2

Sample Output:
--------------
[-2,0,3,5,3]


Explanation:
------------
Initial state of the ZeroSet is: [0,0,0,0,0]
    - After applying operation [1,3,2] => [0,2,2,2,0]
    - After applying operation [2,4,3] => [0,2,5,5,3]
    - After applying operation [0,2,-2] => [-2,0,3,5,3]

    
*/
import java.util.*;
import java.lang.*;
class zeroset{
    static int check(int num,Map<Integer,Integer> mp){
        if(mp.get(num)==null){
            return 0;
        }
        return mp.get(num);
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int arr[][]=new int[k][3];
        for(int i=0;i<k;i++){
            arr[i][0]=in.nextInt();
            arr[i][1]=in.nextInt();
            arr[i][2]=in.nextInt();
        }
        int fin[]=new int[n];
        for(int quer []:arr){
            int st=quer[0];
            int ed=quer[1];
            int val=quer[2];
            fin[st]=fin[st]+val;
            if(ed+1<n){
                fin[ed+1]=fin[ed+1]-val;
            }
        }
        for(int i=1;i<n;i++){
            fin[i]=fin[i-1]+fin[i];
        }
        System.out.println(Arrays.toString(fin));
    }
}