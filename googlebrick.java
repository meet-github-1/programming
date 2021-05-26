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
class googlebrick implements Comparator<brick>{
    public int compare(brick b1,brick b2){
        /*if(b1.w<b2.w){
            return -1;
        }
        else if(b1.w==b2.w && b1.l<b2.l){
            return -1;
        }
        else if(b1.w==b2.w && b1.l==b2.l && b1.h<b2.h){
            return -1;
        }*/
        //return 1;
        return b1.w*b1.l-b2.w*b2.l;
        
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
        for(int i=0;i<n;i++){
            h=in.nextInt();
            w=in.nextInt();
            l=in.nextInt();
            li.add(new brick(h,w,l));
            li.add(new brick(w,h,l));
            li.add(new brick(l,h,w));
        }
        li.sort(new googlebrick());
        int dp[]=new int[3*n];
        int ln=3*n;
        int globalmax=Integer.MIN_VALUE;
        int max;
        //System.out.println(li);
        for(int i=ln-1;i>=0;i--){
            dp[i]=li.get(i).h;
            max=Integer.MIN_VALUE;
            for(int j=i;j<=ln-1;j++){
                if(small(li.get(j),li.get(i))){
                    max=Math.max(max,dp[i]+dp[j]);
                }
            }
            dp[i]=max==Integer.MIN_VALUE?dp[i]:max;
            globalmax=Math.max(globalmax,dp[i]);
        }
        //System.out.println(Arrays.toString(dp));
        System.out.println(globalmax);
    }
}