import java.util.*;
import java.lang.*;
class logs{
    static List<ArrayList<Integer>> l;
    static int count=0;
    static boolean visited[];
    static void dfs(List<ArrayList<Integer>> l,int st){
          if(visited[st]){
             return;
          }
          else{
             count++;
             visited[st]=true;
             for(int i:l.get(st)){
                dfs(l,i);
             }
             return;
          }
    }
	public static void main(String[] args){
	   Scanner in=new Scanner(System.in);
	   int n=in.nextInt();
	   int log[][]=new int[n][3];
	   for(int i=0;i<n;i++){
	      log[i][0]=in.nextInt();
	      log[i][1]=in.nextInt();
	      log[i][2]=in.nextInt();
	   }
	   Arrays.sort(log,(a,b)->a[0]-b[0]);
	   /*for(int ar[]:log){
	   	  for(int j:ar){
	   	  	 System.out.print(j+" ");
	   	  }
	   	  System.out.println();
	   }*/
	   int nd=in.nextInt();
	   l=new ArrayList<ArrayList<Integer>>();
	   for(int i=0;i<nd;i++){
	       l.add(new ArrayList<Integer>());
	   }
	   int flag=0;
	   for(int i=0;i<n;i++){
	      count=0;
	      visited=new boolean[nd];
	      l.get(log[i][1]).add(log[i][2]);
	      l.get(log[i][2]).add(log[i][1]);
	      dfs(l,0);
	      if(count==nd){
	          System.out.println(log[i][0]);
	          flag=1;
	          break;
	      }

	   }
	   if(flag==0){
	   System.out.println("-1");
	   }
	}
}