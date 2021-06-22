/*
In a school, there are N students in a class numbered from 1,2,3..N.
During the play time in school, drill master wants to split them into 
two teams based on their interest.

If the pair of students want to play opposite each other, drill master should 
put them in different teams, e.g. pair[i] = (A,B), it is not allowed to 
put A and B in same team.
 
You need to find out wether is it possible to put everyone into two teams or not
return true if it is possible, otherwise false.

Input Format:
----------------
Line-1 -> Two Integers, N and P, number of students N, number of pairs P.
Next P lines -> Two integers, one pair[i], where 'i' is from 0 to P-1

Output Format:
------------------
Print a boolean result.


Sample Input-1:
-------------------
5 4
1 2
1 3
2 4
3 5

Sample Output-1:
---------------------
true

Explanation: 
----------------
team1 [1,4,5], team2 [2,3]


Sample Input-2:
-------------------
5 5
1 2
2 3
3 4
4 5
1 5

Sample Output-2:
---------------------
false
*/
import java.util.*;
import java.lang.*;
class form2team{
    static boolean vis[];
    static int color[];
    static boolean dfs(int node,Map<Integer,Set<Integer>>  mp,int col){
        vis[node]=true;
        color[node]=col;
       // System.out.println(node+" "+col);
        for(int opp:mp.get(node)){
            //System.out.println(opp);
            if(!vis[opp]){
                boolean val=dfs(opp,mp,col==1?-1:1);
                if(!val){
                    return false;
                }
            }
            else{
                if(color[node]==color[opp]){
                    return false;
                }
            }
        }
        //System.out.println(node+" "+"goingback");
        return true;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int p=in.nextInt();
        int arr[][]=new int[p][2];
        Map<Integer,Set<Integer>> mp=new HashMap<Integer,Set<Integer>>();
        for(int i=0;i<p;i++){
           arr[i][0]=in.nextInt();
           arr[i][1]=in.nextInt();
            if(mp.get(arr[i][0])==null){
                mp.put(arr[i][0],new HashSet<Integer>());
            }
            if(mp.get(arr[i][1])==null){
                mp.put(arr[i][1],new HashSet<Integer>());
            }
            mp.get(arr[i][0]).add(arr[i][1]);
            mp.get(arr[i][1]).add(arr[i][0]);
        }
        //System.out.println(mp);
        vis=new boolean[n+1];
        color=new int[n+1];
        boolean flag=true;
       for(int i=1;i<=n;i++){
           if(!vis[i]){
              flag=dfs(i,mp,1);
              if(!flag){
                  break;
              }
           }
       }
       System.out.println(flag);
    }
}
