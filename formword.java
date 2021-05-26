import java.util.*;
import java.lang.*;
class formword{
     static boolean isvalid(char arr[][],int i,int j,int r,int c){
       if(i<0 || i>=r || j<0 || j>=c) return false;
       if(arr[i][j]=='*') return false;
       return true;
     }
     static boolean traversematrix(char arr[][],int x,int y,int r,int c,int k,String pr,int ind,int len){
     if(arr[x][y]!=pr.charAt(ind)){
      return false;
     }
     if(k==len){
        return true;
     }
     else{
         char prev=arr[x][y];
         arr[x][y]='*';
         //System.out.println(x+" "+y);
         if(isvalid(arr,x+1,y,r,c) && traversematrix(arr,x+1,y,r,c,k+1,pr,ind+1,len)){
              return true;
         }
         if(isvalid(arr,x,y+1,r,c) && traversematrix(arr,x,y+1,r,c,k+1,pr,ind+1,len)){
              return true;
         }
         if(isvalid(arr,x-1,y,r,c) && traversematrix(arr,x-1,y,r,c,k+1,pr,ind+1,len)){
              return true;
         }
         if(isvalid(arr,x,y-1,r,c) && traversematrix(arr,x,y-1,r,c,k+1,pr,ind+1,len)){
              return true;
         }
         //System.out.println(x+" "+y);
         arr[x][y]=prev;
         return false;

     }


     }
	public static void main(String[] args){
	 Scanner in=new Scanner(System.in);
     int r=in.nextInt();
     int c=in.nextInt();
     char arr[][]=new char[r][c];
     for(int i=0;i<r;i++){
     for(int j=0;j<c;j++){
     arr[i][j]=in.next().charAt(0);
     }
     }
     String s=in.next();
     int len=s.length();
     int pos1=-1;
     int pos2=-1;
     boolean res=false;
     for(int i=0;i<r;i++){
     for(int j=0;j<c;j++){
        if(arr[i][j]==s.charAt(0)){
              pos1=i;
              pos2=j;
          res=traversematrix(arr,pos1,pos2,r,c,1,s,0,len);
          if(res){
          System.out.println(res);
          System.exit(1);
      }
        }
     }
     }
     System.out.println(res);

	}
}