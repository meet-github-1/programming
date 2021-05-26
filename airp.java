/*
Gopal would like to go on Tour, and planned a schedule.
Airport authority has created a new way of issuing tickets.
Gopal purchased a set of airline tickets, 
each ticket contains the 'departure from' and 'arrival to'.

Redesign the Gopal's tour schedule in an order.
Gopal intially must begin his tour from BZA.
Hence the tour schedule's start point should begin with BZA. 

You are given a list of flight tickets which Gopal has purchased.
Your task is to find out and return the tour schedule that has the least lexical order.
Gopal must use all the tickets once and only once.

Note:
------
If there are multiple valid schedules, you should return the schedule 
that has the smallest lexical order when read as a single string. 
For example, the schedule ["BZA", "LGA"] has a smaller lexical order than ["BZA", "LGB"].

All airports are represented by three capital letters.
You may assume all tickets form at least one valid schedule.

Input Format:
-------------
Single Line of tickets separated by comma, and each ticket separated by space, 
Gopal's flight tickets.

Output Format:
--------------
Print the schedule, which is smallest lexical order of tour schedule.


Sample Input-1:
----------------
DEL HYD,BZA DEL,BLR MAA,HYD BLR

Sample Output-1:
--------------------
[BZA, DEL, HYD, BLR, MAA]


Sample Input-2:
------------------
BZA BLR,BZA CCU,BLR CCU,CCU BZA,CCU BLR

Sample Output-2:
------------------
[BZA, BLR, CCU, BZA, CCU, BLR]
*/
import java.util.*;
import java.lang.*;
class airp{
    static String shed;
    static boolean dfs(Map<String,TreeSet<String>> mp,String shd,int ver,String sr){
        if(ver==1){
            shed=shd;
            return true;
        }
        else{
            String arr[]=mp.get(sr).toArray(new String[0]);
            int len=arr.length;
            //System.out.println(mp.get(sr));
            for(int i=0;i<len;i++){
                //System.out.println(shd+" "+arr[i]);
                mp.get(sr).remove(arr[i]);
                if(dfs(mp,shd+" "+arr[i],ver-1,arr[i])){
                    return true;
                }
                mp.get(sr).add(arr[i]);
            }
            return false;
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String ar[]=in.nextLine().split(",");
        int len=ar.length;
        Map<String,TreeSet<String>> mp=new HashMap<String,TreeSet<String>>();
        for(String ary:ar){
            String arr[]=ary.split(" ");
            if(mp.get(arr[0])==null){
                mp.put(arr[0],new TreeSet<String>());
            }
            mp.get(arr[0]).add(arr[1]);
        }
        shed="z";
        dfs(mp,"BZA",len+1,"BZA");
        String shdarr[]=shed.split(" ");
        System.out.println(Arrays.toString(shdarr));
    }
}