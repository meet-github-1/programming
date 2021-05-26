import java.util.*;
class dominant{
    static int getfactorsum(int x){
        int sum=0;
        for(int i=2;i<x;i++){
            if(x%i==0){
                sum+=i;
            }
        }
        return sum;
    }
    static String getdominant(int n,int k){
        int x=getfactorsum(n);
        int y=getfactorsum(k);
        if(x>y){
            return Integer.toString(n);
        }
        else if(y>x){
            return Integer.toString(k);
        }
        else{
            return "No dominance";
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        System.out.println(getdominant(n,k));
    }
}