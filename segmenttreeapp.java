/*In Hyderabad after a long pandemic gap, 
the Telangana Youth festival Is Organized at HITEX.

In HITEX, there are a lot of programs planned. During the festival in order
to maintain the rules of Pandemic, they put a constraint that one person 
can only attend any one of the programs per day according to planned days.

Now it’s your turn to implement the "Solution" class in such a way that you need 
to return the maximum number of programs you can attend according to given rules.

Explanation:
------------
You have a list of programs ‘p’ and days ’d’, where you can attend only one
program on one day.

Programs [p] = [first day, last day], p is the program's first day and the last day.


Input Format:
-------------
Line-1: An integer N, number of programs.
Line-2: N comma separated pairs, each pair(f_day, l_day) is separated by space.

Output Format:
--------------
An integer, the maximum number of programs you can attend.


Sample Input-1:
---------------
4
1 2,2 4,2 3,2 2

Sample Output-1:
----------------
4


Sample Input-2:
---------------
6
1 5,2 3,2 4,2 2,3 4,3 5

Sample Output-2:
----------------
5
*/
import java.util.*;
class node{
    int x;
    int y;
    node(int x,int y){
        this.x=x;
        this.y=y;
    }
    public String toString(){
        return x+" "+y;
    } 
}
class Segmenttreeapp implements Comparator<node>{
    int sg[];
    public int compare(node n1,node n2){
        if(n1.y==n2.y){
            return n1.x-n2.x;
        }
        return n1.y-n2.y;
    }
    // Method to return the maximum programs can attend
    public int maxPrograms(int[][] programs) {
        PriorityQueue<node> pq=new PriorityQueue<node>(new Segmenttreeapp());
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int arr[]:programs){
            if(arr[0]<min){
                min=arr[0];
            }
            if(arr[1]>max){
                max=arr[1];
            }
            pq.add(new node(arr[0],arr[1]));
        }
        sg=new int[4*(max-min+1)];
        //System.out.println(Arrays.toString(pq.toArray()));
        //System.out.println(min+" "+max);
        int count=0;
        while(!pq.isEmpty()){
            node n=pq.poll();
            if(buildSegmentTree(1,min,max,n.x,n.y)){
                count++;
            }
        }
        //System.out.println(Arrays.toString(sg));
        return count;
    }
    
    // Method to build segment tree
    public boolean buildSegmentTree(int ind,int st,int ed,int sm,int em) {
        if(sm>em){
            return false;
        }
        else if(sg[ind]==(ed-st+1)){
            return false;
        }
        else if(st==ed){
            sg[ind]=1;
            return true;
        }
        else{
            int mid=(st+ed)/2;
            boolean flag=false;
            if(buildSegmentTree(ind*2,st,mid,sm,Math.min(em,mid))){
                flag=true;
            }
            if(flag==false && buildSegmentTree(ind*2+1,mid+1,ed,Math.max(sm,mid+1),em)){
                flag=true;
            }
            sg[ind]=sg[ind*2]+sg[ind*2+1];
            return flag;
        }
        
    }

    //method to perform update segment tree    
   
    
}