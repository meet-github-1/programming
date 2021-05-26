import java.util.*;
import java.lang.*;
class bridge{
    static int n;
    static List<ArrayList<Integer>> l=new ArrayList<ArrayList<Integer>>();
    static int time=0;
    static void bridgefind(int u,boolean visited[],int disc[],int low[],int parent[]){
           visited[u]=true;
           disc[u]=low[u]=++time;
           for(int i:l.get(u)){
              int v=i;
              if(!visited[v]){
                  parent[v]=u;
                  bridgefind(v,visited,disc,low,parent);
                  low[u]=Math.min(low[u],low[v]);
                  if(low[v]>disc[u]){
                     System.out.println(u+" "+v);
                  }
              }
              else if(v!=parent[u]){
                 low[u]=Math.min(low[u],disc[v]);
              }
           }

    }
    static void brid(int arr[][]){
        for(int i=0;i<n;i++){
           l.add(new ArrayList<Integer>());
        }
        for(int ar[]:arr){
          l.get(ar[0]).add(ar[1]);
          l.get(ar[1]).add(ar[0]);
        }
        boolean visited[]=new boolean[n];
        int disc[]=new int[n];
        int low[]=new int[n];
        int parent[]=new int[n];
        Arrays.fill(parent,-1);
        for(int i=0;i<n;i++){
            if(!visited[i]){
                bridgefind(i,visited,disc,low,parent);
            }
        }
    }
	public static void main(String[] args){
	   Scanner in=new Scanner(System.in);
	    n=in.nextInt();
	   int arr[][]=new int[n][2];
	   for(int i=0;i<n;i++){
	     arr[i][0]=in.nextInt();
	     arr[i][1]=in.nextInt();
	   }
	   brid(arr,n);
	}
}