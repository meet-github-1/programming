import java.util.*;
import java.lang.*;
class Node{
	 int x;
	 int y;
	 Node(int x,int y){
	  this.x=x;
	  this.y=y;
	 }
}
class delivery{
    static int MAX=-99999;
    static boolean isvalid(int i,int j,int r,int c){
             return(i>=0 && i<r && j>=0 && j<c);
    }
	public static void main(String[] args){
	   Scanner in=new Scanner(System.in);
	   int r=in.nextInt();
	   int c=in.nextInt();
	   int arr[][]=new int[r][c];
	   Queue<Node> q=new LinkedList<Node>();
	   for(int i=0;i<r;i++){
	       for(int j=0;j<c;j++){
	           arr[i][j]=in.nextInt();
	           if(arr[i][j]==1){
	              q.add(new Node(i,j));
	           }
	       }
	   }
	   int max=Integer.MIN_VALUE;
	   while(!q.isEmpty()){
	        Node n=q.poll();
	        //System.out.println(n.x+" "+n.y);
	        int i=n.x;
	        int j=n.y;
	        int a=MAX,b=a,c1=b,d=c1;
	        if(isvalid(i+1,j,r,c) && arr[i+1][j]==0){
	             arr[i+1][j]=arr[i][j]+1;
	             a=arr[i+1][j];
	             q.add(new Node(i+1,j));
	        }
	        if(isvalid(i-1,j,r,c) && arr[i-1][j]==0){
	             arr[i-1][j]=arr[i][j]+1;
	             b=arr[i-1][j];
	             q.add(new Node(i-1,j));
	        }
	         if(isvalid(i,j+1,r,c) && arr[i][j+1]==0){
	             arr[i][j+1]=arr[i][j]+1;
	             c1=arr[i][j+1];
	             q.add(new Node(i,j+1));
	        }
	         if(isvalid(i,j-1,r,c) && arr[i][j-1]==0){
	             arr[i][j-1]=arr[i][j]+1;
	             d=arr[i][j-1];
	             q.add(new Node(i,j-1));
	        }
	        max=Math.max(Math.max(Math.max(Math.max(a,b),c1),d),max);
	   }
	   System.out.println(max-1);
	}
}