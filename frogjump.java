import java.util.*;
import java.lang.*;
class frogjump{
    static int jmp(int arr[],int len,int stp,int pos){
          int flag=-1;
          for(int i=pos+1;i<len;i++){
               if(arr[i]-arr[pos]==stp){
                   flag=i;
                   break;
               }
          }
          if(arr[len-1]-arr[pos]<=stp){
             return len-1;
          }
          return flag;
    }
    static boolean jump(int arr[],int len,int k,int pos){
    	   System.out.println(pos);
           if(pos>=len-1){
              return true;
           }
           else{
              int ps;
              ps=jmp(arr,len,k-1,pos);
              if(ps!=-1 && jump(arr,len,k-1,ps)){
                 return true;
              }
              ps=jmp(arr,len,k,pos);
              if(ps!=-1 && jump(arr,len,k,ps)){
                 return true;
              }
              ps=jmp(arr,len,k+1,pos);
              if(ps!=-1 && jump(arr,len,k+1,ps)){
                 return true;
              }
              return false;
           }
    }
    static boolean canCross(int arr[]){
        int len=arr.length;
        if(len>=2 && arr[1]-arr[0]==1){
            return jump(arr,len,1,1);
        }
        else if(len<=1){
            return true;
        }
        else{
             return false;
        }
    }
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
       System.out.println(canCross(arr));
	}
}