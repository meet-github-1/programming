/*
Hulk and Thor become best friends now. 
Hulk lives in the P-th house while Thor lives in the N-th house. 
Hulk has decided to meet Thor every day. After going for many days, 
he notices that there are few streets such that he passes every time 
he goes to meet Thor, no matter which path he takes.

You have been given a grid of N houses in the form of undirected graph. 
Houses are numbered from 1 to N.
For each I-th query, you have been given P (Hulk's house). 
You have to say how many streets are there which he encounters in every path 
he takes to go from P to N. If there is no such street, print "-1".
Also, note P can be equal to N.

Input Format:
-------------
Line-1: Two space separated integers N and M, Number of houses, number of streets.
Next M lines: contain two space-separated integers u and v, 
		denoting a street between house-u and house-v.
Next line: contains an integer P.

Output Format:
--------------
Print an integer, number of streets in that path.


Sample Input-1:
---------------
4 3
1 2
1 3
2 4
1

Sample Output-1:
----------------
2

Explanation:
------------
There is only one path 1->2->4. so answer = 2


Sample Input-2:
---------------
4 3
1 2
1 3
2 4
4

Sample Output-2:
----------------
-1

Explanation:
------------
There is no path as they both live in the same house 4.
So answer = -1.
*/
import java.util.*;
import java.lang.*;
class hulkthor{
    static boolean vis[];
    static int count[];
    static boolean traverse(int p,int n,List<ArrayList<Integer>> l){
        //System.out.println(p+" "+n);
        if(p==n){
            return true;
        }
        else if(vis[p]){
            return false;
        }
        else{
            vis[p]=true;
            boolean flag=false;
            for(int i:l.get(p)){
                //System.out.println(i);
                if(traverse(i,n,l)){
                    flag=true;
                    count[i]+=1;
                }
            }
            vis[n]=false;
            return flag;
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int conn=in.nextInt();
        List<ArrayList<Integer>> l=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<=n;i++){
            l.add(new ArrayList<Integer>());
        }
        for(int i=0;i<conn;i++){
            int st=in.nextInt();
            int ed=in.nextInt();
            l.get(st).add(ed);
            l.get(ed).add(st);
        }
        //System.out.println(l);
        int p=in.nextInt();
        if(n==p){
            System.out.println(-1);
        }
        else{
            vis=new boolean[n+1];
            count=new int[n+1];
            traverse(p,n,l);
            //System.out.println(Arrays.toString(count));
            int mx=Integer.MIN_VALUE;
            for(int i:count){
                mx=Math.max(mx,i);
            }
            int cnt=0;
            for(int i=1;i<=n;i++){
                if(count[i]==mx){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
        
    }
}