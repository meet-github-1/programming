import java.util.*;
import java.lang.*;
class exitdp{
     static boolean isvalid(int i,int j,int r,int c){
           return(i<r && i>=0 && j<c && j>=0);
     }
     static void getnearest(int arr[][],Queue<int[]> q,int r,int c){
         while(!q.isEmpty()){
             int ar[]=q.remove();
             if(isvalid(ar[0]-1,ar[1],r,c) && arr[ar[0]-1][ar[1]]==500){
                   arr[ar[0]-1][ar[1]]=arr[ar[0]][ar[1]]+1;
                   q.add(new int[]{ar[0]-1,ar[1]});
             }
             if(isvalid(ar[0]+1,ar[1],r,c) && arr[ar[0]+1][ar[1]]==500){
                   arr[ar[0]+1][ar[1]]=arr[ar[0]][ar[1]]+1;
                    q.add(new int[]{ar[0]+1,ar[1]});
             }
             if(isvalid(ar[0],ar[1]-1,r,c) && arr[ar[0]][ar[1]-1]==500){
                   arr[ar[0]][ar[1]-1]=arr[ar[0]][ar[1]]+1;
                    q.add(new int[]{ar[0],ar[1]-1});
             }
             if(isvalid(ar[0],ar[1]+1,r,c) && arr[ar[0]][ar[1]+1]==500){
                   arr[ar[0]][ar[1]+1]=arr[ar[0]][ar[1]]+1;
                    q.add(new int[]{ar[0],ar[1]+1});
             }
         }
     }
	 public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    int r=in.nextInt();
	    int c=in.nextInt();
	    int arr[][]=new int[r][c];
	    Queue<int[]> q=new LinkedList<int[]>();
	    for(int i=0;i<r;i++){
	      for(int j=0;j<c;j++){
	        arr[i][j]=in.nextInt();
	        if(arr[i][j]==0){
	          int out[]=new int[2];
	          out[0]=i;
	          out[1]=j;
	          q.add(out);
	        }
	      }
	    }
	    getnearest(arr,q,r,c);
	    for(int ar[]:arr){
	      for(int j:ar){
	         System.out.print(j+" ");
	      }
	      System.out.println();
	    }
	 }
}