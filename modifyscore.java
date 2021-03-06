/*
There are N players, played a game.
You are given the scores of the N players as scores[] array,
where i-th player score is score[i].
You are given P chances to modify the score of the players.

In each chance you can modify the score of i-th player as follows:
  - You are allowed increment the score of i-th player by 1.
You have to perform these increments, in order to maximize the occurences of any score.

Your task is to maximize occurences of a score, after utlizing atmost P chances.

Input Format:
-------------
Line-1: Two space separated integers N and P, players count, and number of chances.
Line-2: N space separated integers, scores of N players scores[].

Output Format:
--------------
Print an integer, maximum occurences of a score!


Sample Input-1:
---------------
5 3
2 3 5 6 9

Sample Output-1:
----------------
2

Explanation:
------------
Increment the first element three times and the second element two times to make
nums = [2, 3, 5, 6, 9].

    Chance-1: increment value at index-0 by 1 becomes 3, now 3 occured 2 times
    Chance-2: increment value at index-0 by 1 becomes 4, now 3 occured 1 time only
    Chance-3: increment value at index-1 by 1 becomes 4, now 4 occured 3 times.

Now 3 or 4 occured 2 times, so the maximum occurrences is 2.


Sample Input-2
---------------
6 5
2 3 4 6 8 9

Sample Output-2:
----------------
3
*/
import java.util.*;
import java.lang.*;
class modifyscore{
    static int getmaxscore(int arr[],int len,int p){
       Arrays.sort(arr);
       int left=0;
       int sum=0;
       int ans=0;
       for(int right=0;right<len;right++){
           sum+=arr[right];
           while(arr[right]*(right-left+1)-sum>p){
               sum=sum-arr[left];
               left++;
           }
           ans=Math.max(ans,(right-left+1));
       }
       return ans;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int p=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(getmaxscore(arr,n,p));
    }
}