import java.util.*;
import java.lang.*;
class kpartition{
    static boolean iskpartitionpossible(int arr[],int sm[],int tk[],int st,int sp,int ln,int cind,int lind){
        if(sm[cind]==st){
            if(cind==sp-2){
               return true;
            }
            return iskpartitionpossible(arr,sm,tk,st,sp,ln,cind+1,ln-1);
        }
        for(int i=lind;i>=0;i--){
         if(tk[i]!=-1){
            continue;
         }
         int tmp=sm[cind]+arr[i];
         if(tmp<=st){
            tk[i]=cind;
            sm[cind]=sm[cind]+arr[i];
            boolean nt=iskpartitionpossible(arr,sm,tk,st,sp,ln,cind,i-1);
            if(nt){
               return true;
            }
            tk[i]=-1;
            sm[cind]=sm[cind]-arr[i];
         }
        }
        return false;
    }
    static boolean iskpartition(int n,int arr[],int k){
         if(k==1){
            return true;
         }
         else if(n<k){
            return false;
         }
         else{
             int sum=0;
             for(int i:arr){
                sum+=i;
             }
             if(sum%k!=0){
                return false;
             }
             int subsetsum[]=new int[k];
             int subset=sum/k;
             int taken[]=new int[n];
             Arrays.fill(taken,-1);
             subsetsum[0]=arr[n-1];
             taken[n-1]=0;
             return iskpartitionpossible(arr,subsetsum,taken,subset,k,n,0,n-1);
         }
    }
	public static void main(String[] args){
	   Scanner in=new Scanner(System.in);
	   int n=in.nextInt();
	   int arr[]=new int[n];
	   for(int i=0;i<n;i++){
	      arr[i]=in.nextInt();
	   }
	   int k=in.nextInt();
	   System.out.println(iskpartition(n,arr,k));
	}
}