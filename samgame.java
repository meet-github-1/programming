import java.util.*;
import java.lang.*;
import java.io.*;
class samgame{
    static boolean caneat(int n){
        for(int i=1;i<n;i++){
            if(n%i==0){
                return true;
            }
        }
        return false;
    }
    static boolean ispossible(int n,int trn){
        if(!caneat(n) && trn==1){
            return true;
        }
        if(!caneat(n) && trn==0){
            return false;
        }
        for(int i=1;i<n;i++){
            if(n%i==0){
                if(ispossible(n-i,(trn+1)%2)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
         Scanner in=new Scanner(System.in);
         int n=in.nextInt();
         System.out.println(ispossible(n,0));
    }
}