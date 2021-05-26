import java.util.*;
import java.lang.*;
class brahmi{
    static boolean ifvalid(int i,int j,int r,int c){
        return(i>=0 && i<r && j>=0 && j<c);
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
                    q.add(new int[]{i,j});
                }
            }
        }
        while(!q.isEmpty()){
            int ar[]=q.poll();
            if(ifvalid(ar[0]+1,ar[1],r,c) && arr[ar[0]+1][ar[1]]==-2){
                q.add(new int[]{ar[0]+1,ar[1]});
                arr[ar[0]+1][ar[1]]=arr[ar[0]][ar[1]]+1;
            }
            if(ifvalid(ar[0]-1,ar[1],r,c) && arr[ar[0]-1][ar[1]]==-2){
                q.add(new int[]{ar[0]-1,ar[1]});
                arr[ar[0]-1][ar[1]]=arr[ar[0]][ar[1]]+1;
            }
            if(ifvalid(ar[0],ar[1]+1,r,c) && arr[ar[0]][ar[1]+1]==-2){
                q.add(new int[]{ar[0],ar[1]+1});
                arr[ar[0]][ar[1]+1]=arr[ar[0]][ar[1]]+1;
            }
            if(ifvalid(ar[0],ar[1]-1,r,c) && arr[ar[0]][ar[1]-1]==-2){
                q.add(new int[]{ar[0],ar[1]-1});
                arr[ar[0]][ar[1]-1]=arr[ar[0]][ar[1]]+1;
            }
            
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}