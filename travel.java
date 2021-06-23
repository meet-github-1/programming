/*
There are N cities in a state.
The cities are connected with two types of roadways:
1) concrete roadway 2) asphalt roadway.
The roadways may be parallel.

You are given the lists of concrete roadways and asphalt roadways
between the cities. All roadways are unidirectional.
Concrete_Roadway[i,j] indiactes: a concrete road from city-i to city-j. Similarly,
Asphalt[i,j] indiactes: an asphalt road from city-i to city-j. Similarly,

Your task is to find and return the list of lengths of the shortest paths from 
city-0 to city-P, where P start from 0 to N-1. And the path should contains 
alternative roadways like as follows: concrete - asphalt - concrete -asphalt --etc
or vice versa. If there is no such shortest path exist print -1.

Input Format:
-------------
Line-1: 3 space separated integers N, C & A, Number of cities, routes between the cities.
		number of concrete roads and number of asphalt roads
Next C lines: Two space separated integers, concrete road between city-i to city-j.		
Next A lines: Two space separated integers, asphalt road between city-i to city-j.		

Output Format:
--------------
Print the list of lengths, the shortest paths.


Sample Input-1:
---------------
4 2 1
0 1
2 3
1 2

Sample Output-1:
----------------
0 1 2 3

Sample Input-2:
---------------
4 2 1
1 0
2 3
1 2

Sample Output-2:
----------------
0 -1 -1 -1


Sample Input-3:
---------------
4 3 2
1 0
1 2
2 3
0 1
1 2

Sample Output-3:
----------------
0 1 2 -1
*/
import java.util.*;
import java.lang.*;
class travel{
    static boolean vis[];
    static int MAX=9999;
    static int dfs(int sr,int ds,int r,Map<Integer,Map<String,ArrayList<Integer>>> mp){
        if(sr==ds){
            return 0;
        }
        else if(vis[sr]){
            return MAX;
        }
        else{
            vis[sr]=true;
            if(mp.get(sr)==null){
                return MAX;
            }
            else if(r==0){
                int cost1=MAX;
                int cost2=MAX;
                for(int cn:mp.get(sr).get("conn")){
                    cost1=1+dfs(cn,ds,1,mp);
                }
                for(int cn:mp.get(sr).get("asp")){
                    cost2=1+dfs(cn,ds,-1,mp);
                }
                return Math.min(cost1,cost2);
            }
            else if(r==1){
                int cost=MAX;
                for(int cn:mp.get(sr).get("asp")){
                    cost=1+dfs(cn,ds,-1,mp);
                }
                return cost;
            }
            else{
                int cost=MAX;
                for(int cn:mp.get(sr).get("conn")){
                    cost=1+dfs(cn,ds,1,mp);
                }
                return cost;
            }
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int con=in.nextInt();
        int asp=in.nextInt();
        Map<Integer,Map<String,ArrayList<Integer>>> mp=new HashMap<Integer,Map<String,ArrayList<Integer>>>();
        //System.out.println(n+" "+con+" "+asp);
        for(int i=0;i<con;i++){
            int sr=in.nextInt();
            int ds=in.nextInt();
            if(mp.get(sr)==null){
                mp.put(sr,new HashMap<String,ArrayList<Integer>>());
                mp.get(sr).put("conn",new ArrayList<Integer>());
                mp.get(sr).put("asp",new ArrayList<Integer>());
            }
            mp.get(sr).get("conn").add(ds);
        }
        for(int i=0;i<asp;i++){
            int sr=in.nextInt();
            int ds=in.nextInt();
            if(mp.get(sr)==null){
                mp.put(sr,new HashMap<String,ArrayList<Integer>>());
                mp.get(sr).put("conn",new ArrayList<Integer>());
                mp.get(sr).put("asp",new ArrayList<Integer>());
            }
            mp.get(sr).get("asp").add(ds);
        }
        List<Integer> l=new ArrayList<Integer>();
        l.add(0);
        for(int i=1;i<n;i++){
            vis=new boolean[n];
            int sp=dfs(0,i,0,mp);
            l.add(sp==MAX?-1:sp);
        }
        System.out.println(l);
    }
}
