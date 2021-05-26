import java.util.*;
import java.lang.*;
class brick{
    int h;
    int w;
    int l;
    brick(int h,int w,int l){
        this.h=h;
        this.w=w;
        this.l=l;
    }
    public String toString(){
        return h+" "+w+" "+l;
    }
}
class googlebrick /*implements Comparator<brick>*/{
    static int dp[];
    /*public int compare(brick b1,brick b2){
        if(b1.w<b2.w){
            return -1;
        }
        else if(b1.w==b2.w && b1.l<b2.l){
            return -1;
        }
        else if(b1.w==b2.w && b1.l==b2.l && b1.h<b2.h){
            return -1;
        }
        return 1;
        //return b1.w*b1.l-b2.w*b2.l;
        
    }*/
    static int getmaxs(List<brick> l,int len,int ind){
        if(ind==len){
            return 0;
        }
        else if(dp[ind]!=0){
            return dp[ind];
        }
        else{
            int max=Integer.MIN_VALUE;
            dp[ind]=l.get(ind).h;
            for(int i=0;i<len;i++){
                if(ind!=i && small(l.get(i),l.get(ind))){
                    max=Math.max(max,dp[ind]+getmaxs(l,len,i));
                }
            }
            dp[ind]=(max==Integer.MIN_VALUE?dp[ind]:max);
            return dp[ind];
        }
        
    }
    static boolean small(brick b1,brick b2){
        if(b2.l<b1.l && b2.w<b1.w){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int h=0,w=0,l=0;
        List<brick> li=new ArrayList<brick>();
        //System.out.println(li.size());
        int arr[][];
        for(int i=0;i<n;i++){
            h=in.nextInt();
            w=in.nextInt();
            l=in.nextInt();
            arr=new int[][]{{h,w,l},{l,w,h},{l,h,w},{h,l,w},{w,l,h},{w,h,l}};
            for(int ar[]:arr){
                if(ar[1]<ar[2]){
                    li.add(new brick(ar[0],ar[1],ar[2]));
                }
            }
        }
        dp=new int[3*n];
        int len=li.size();
        for(int i=0;i<len;i++){
           getmaxs(li,len,i);
        }
        //System.out.println(Arrays.toString(dp));
        int max=Integer.MIN_VALUE;
        for(int i:dp){
            max=Math.max(max,i);
        }
        System.out.println(max);
        
    }
}