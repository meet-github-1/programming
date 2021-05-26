/*
BCCI wants to select the group of bowlers for an upcoming test-series, you want
to choose the group with highest number of wickets, which is the sum of wickets
taken by all the bowlers in that group.

However, the bowler group is not allowed to have any disputes. 
A dispute exists if a younger bowler has strictly highest wickets than an 
older bowler. A dispute does not occur between bowlers of the same age.

You are given information of N bowlers as two lists, wickets and ages, 
where each wickets[i] and ages[i] represents the wickets and age of the i-th bowler, 
respectively, return the highest number of wickets of all possible bowler groups.

Input Format:
-------------
Line-1: An integer N, number of bowlers.
Line-2: N space separated integers, wickets[].
Line-3: N space separated integers, ages[].

Output Format:
--------------
An integer, highest number of wickets of all possible bowler groups.


Sample Input-1:
---------------
4
5 3 5 6
3 5 4 2

Sample Output-1:
----------------
10

Explanation:
------------
It is best to choose 2 bowlers of age 3 and 4. 


Sample Input-2:
---------------
5
5 3 5 6 3
2 5 4 2 1

Sample Output-2:
----------------
14

Explanation:
------------
It is best to choose 3 bowlers of age 1 and 2. 
Notice that you are allowed to choose multiple bowlers of the same age.

Sample Input-3:
---------------
5
1 3 5 10 15
1 2 3 4 5

Sample Output-3:
----------------
34

Explanation:
------------
You can choose all the bowlers.
*/
import java.util.*;
import java.lang.*;
class bowler{
    int wt;
    int ag;
    public String toString(){
        return ag+" "+wt;
    }
}
class bcci implements Comparator<bowler>{
    public int compare(bowler b1,bowler b2){
        if(b1.ag==b2.ag){
            return b2.wt-b1.wt;
        }
        return b2.ag-b1.ag;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int wt[]=new int[n];
        int ag[]=new int[n];
        for(int i=0;i<n;i++){
            wt[i]=in.nextInt();
        }
        for(int i=0;i<n;i++){
            ag[i]=in.nextInt();
        }
        List<bowler> li=new ArrayList<bowler>();
        for(int i=0;i<n;i++){
              bowler b=new bowler();
              b.wt=wt[i];
              b.ag=ag[i];
              li.add(b);
        }
        li.sort(new bcci());
        //System.out.println(li);
        int dp[]=new int[n];
        dp[0]=li.get(0).wt;
        int max=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            int mx=0;
            for(int j=i-1;j>=0;j--){
                if(li.get(i).wt<=li.get(j).wt){
                    mx=Math.max(mx,li.get(i).wt+dp[j]);
                    //System.out.println(i+" "+mx);
                }
                dp[i]=Math.max(mx,li.get(i).wt);
                max=Math.max(max,dp[i]);
            }
        }
        //System.out.println(Arrays.toString(dp));
        System.out.println(max);
        
        }
}
