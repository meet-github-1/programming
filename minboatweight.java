/*
A group of people planned to go Antarvedi Temple, 
They have reached Narsapur Railway station.

From the station they have reached to a boating point to cross the river Godavari.
All of them formed in a line, and you are given their weights as an array Weights[].
Where i-th person weight is Weights[i].

Each boat can carry only few people whose total weight is atmost W.
Each person from the group get into the boat according to the given order only.
The boat takes T number of trips to transport all the people of the group.

You will be given the weights of the people in the line, and number of trips T.
Now, its your turn to find out the minimum weight, the boat can carry, 
So that the boat can transport all the people to cross the river.


Input Format:
-------------
Line-1: Two space separated integers, N and T, Number of people and T trips.
Line-2: N space separated integers, weights of the people.

Output Format:
--------------
Print an integer, minimum weight, the boat can carry.


Sample Input-1:
---------------
6 3
3 2 3 4 1 5

Sample Output-1:
----------------
7

Explanation:
------------
A boat can carry a weight 7 is the minimum to transport all the people in 3 trips:
    trip-1: 3, 2
    trip-2: 3, 4
    trip-3: 1, 5



Sample Input-2:
---------------
8 4
1 2 3 4 5 6 7 8

Sample Output-2:
----------------
11

Explanation:
------------
A boat can carry a weight 11 is the minimum to transport all the people in 4 trips:
    1st day: 1, 2, 3, 4
    2nd day: 5, 6
    3rd day: 7
    4th day: 8

Note:
-----
The people must be transported in the order given, so using a
boat can carry a weight 10 and splitting the packages into parts like 
(8, 1), (7, 2), (6, 3), (5, 4) is not allowed.
*/
import java.util.*;
import java.lang.*;
class minboatweight{
    static boolean part(int arr[],int n,int par,int mid){
        int count=0;
        int sum=0;
        for(int i:arr){
            if(i>mid){
                return false;
            }
            sum=sum+i;
            //System.out.println(sum);
            if(sum>mid){
                sum=i;
                count++;
            }
        }
        count++;
        //System.out.println(count);
        if(count<=par) return true;
        return false;
    }
    static int getmin(int arr[],int low,int high,int par){
        int mx=Integer.MIN_VALUE;
        for(int i:arr){
            mx=Math.max(mx,i);
        }
        int st=mx;
        int ed=0;
        for(int i:arr){
            ed=ed+i;
        }
        int res=0;
        //System.out.println(st+" "+ed);
        while(st<=ed){
            int mid=(st+ed)/2;
            if(part(arr,high,par,mid)){
                res=mid;
                ed=mid-1;
            }
            else{
                st=mid+1;
            }
            //System.out.println(mid+" "+res);
        }
        return res;
        
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int tr=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(getmin(arr,0,n,tr));
    }
}