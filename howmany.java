import java.util.*;
import java.lang.*;
class howmany{
   static boolean visited[];
   static int distance[];
   static void getnumber(List<ArrayList<Integer>> l,int sr){
       Queue<Integer> q=new LinkedList<Integer>();
       q.add(sr);
       visited[sr]=true;
       while(!q.isEmpty()){
       	    int ele=q.poll();
       	    for(int i: l.get(ele)){
       	    	if(!visited[i]){
       	    	distance[i]=distance[ele]+1;
       	    	visited[i]=true;
       	    	q.add(i);
       	    }
       	    }
       }
   }
	public static void main(String[] args){
	   Scanner in=new Scanner(System.in);
	   int nd=in.nextInt();
	   int n=in.nextInt();
	   List<ArrayList<Integer>> l=new ArrayList<ArrayList<Integer>>();
	   for(int i=0;i<nd;i++){
	      l.add(new ArrayList<Integer>());
	   }
	   for(int i=0;i<n;i++){
	      int sr=in.nextInt();
	      int tr=in.nextInt();
	      l.get(sr).add(tr);
	      l.get(tr).add(sr);
	   }
	   int q=in.nextInt();
	   int arr[][]=new int[q][2];
	   for(int i=0;i<q;i++){
	      arr[i][0]=in.nextInt();
	      arr[i][1]=in.nextInt();
	   }
	   int count;
	   for(int ar[]:arr){
	       visited=new boolean[nd];
	        distance=new int[nd];
	       getnumber(l,ar[0]);
	       count=0;
	       //System.out.println(Arrays.toString(distance));
	       for(int i:distance){
	       	  if(i==ar[1]){
	       	  	  count++;
	       	  }
	       }
	       System.out.println("number of nodes are"+" "+count);
	   }
	}
}