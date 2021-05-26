/*
A cricket player wants to score maximum runs in every game
than his previous games. 
Suppose if he score 10 runs in current game and his previous game 
scores are as follows: 11, 8, 13, then he failed to beat the maximum 
scores of two games among all, (11,10) and (13,10).

You will be given scores of N games of the player.
Your task is to find the count of failures in N games.

Hint: You need to count the failures after every game.

Input Format:
-------------
Line-1 -> N,number of games.
Line-2 -> N space separated runs scored in each game.

Output Format:
--------------
Print an integer as Maximum number of failures.

Sample Input-1:
---------------
4
8 4 2 1

Sample Output-1:
----------------
6

Explanation:
------------
Given data has six failures:
(8, 4), (4, 2), (8, 2), (8, 1), (4, 1), (2, 1).


Sample Input-2:
---------------
3
3 1 2

Sample Output-2:
----------------
2

Explanation:
------------
Given data has two failures:
(3, 1), (3, 2)  

*/
import java.util.*;
import java.lang.*;
class player{
    static int count=0;
    static void merge(int arr[],int st,int md,int ed){
        int n1=md-st+1;
        int n2=ed-md;
        int l[]=new int[n1];
        int r[]=new int[n2];
        for(int i=0;i<n1;i++){ l[i]=arr[st+i];};
        for(int j=0;j<n2;j++){r[j]=arr[md+j+1];};
        int i=0;
        int j=0;
        int k=st;
        while(i<n1 && j<n2){
            if(l[i]>r[j]){
                arr[k]=r[j];
                j++;
                count+=(n1-i);
            }
            else{
                arr[k]=l[i];
                i++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=l[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=r[j];
            j++;
            k++;
        }
    }
    static void mergesort(int arr[],int st,int ed){
        if(st>=ed){
            return;
        }
        else{
            int md=(st+ed)/2;
            mergesort(arr,st,md);
            mergesort(arr,md+1,ed);
            merge(arr,st,md,ed);
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        mergesort(arr,0,n-1);
        System.out.println(count);
    }
}