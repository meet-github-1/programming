/*
Mounika is creating the binary strings using P 1's and Q 0's.
A binary string contains only 0's and 1's.
She has given a list of binary strings binStr[] to be formed.

Her task is to find, the maximum number of binary strings can be formed, 
with given P 1's and Q 0's only. She cannot use any more 1's or 0's.

Input Format:
-------------
Line-1 -> A single line of space separated binary strings, binStr[].
Line-2 -> Two integers P and Q, P number of 1's and Q number of 0's


Output Format:
--------------
Print an integer as output, maximum number of binary strings can be formed.


Sample Input-1:
---------------
10 0001 111001 1 0
3 5

Sample Output-1:
----------------
4

Explanation:
------------
She can form 4 strings by the using of 3 1's and 5 0's
strings are 10, 0001, 1, 0.


Sample Input-2:
---------------
10 1 0
1 1

Sample Output-2:
----------------
2

Explanation:
------------
She can form 2 strings by the using of 1 1's and 1 0's
strings are 1, 0.
*/
import java.util.*;
import java.lang.*;
class formbin{
    static int dp[][][];
    int maxstrings(String arr[],int ind,int len,int on,int ze){
        if(on<0 || ze<0) return Integer.MIN_VALUE;
        else if(ind>=len) return 0;
        else if(dp[on][ze][ind]!=-1){
            return dp[on][ze][ind];
        }
        int cz=0,co=0;
        for(char c:arr[ind].toCharArray()){
            if(c=='0') cz++;
            else co++;
        }
        dp[on][ze][ind]=Math.max(1+maxstrings(arr,ind+1,len,on-co,ze-cz),maxstrings(arr,ind+1,len,on,ze));
        return dp[on][ze][ind];
        
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String ar[]=in.nextLine().split(" ");
        int len=ar.length;
        int o=in.nextInt();
        int z=in.nextInt();
        dp=new int[o+1][z+1][len];
        for(int i=0;i<=o;i++){
            for(int j=0;j<=z;j++){
                for(int k=0;k<len;k++){
                    dp[i][j][k]=-1;
                }
            }
        }
        //System.out.println("manmeet");
        System.out.println(new formbin().maxstrings(ar,0,len,o,z));
    }
}