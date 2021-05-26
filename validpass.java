import java.util.*;
import java.lang.*;
class validpass{
    static int jp[][];
    static boolean vis[];
    static int getpass(int nt,int len,int count,int m,int n){
        if(len>=m){
            count++;
        }
        if(len>=n){
            return count;
            
        }
        vis[nt]=true;
        for(int i=1;i<=9;i++){
            int jmp=jp[nt][i];
            if(!vis[i] && (jmp==0 || vis[jmp])){
                count=getpass(i,len+1,count,m,n);
            }
            
        }
        vis[nt]=false;
        return count;
        
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        jp=new int[10][10];
        vis=new boolean[10];
        jp[1][3]=jp[3][1]=2;
        jp[1][7]=jp[7][1]=4;
        jp[1][9]=jp[9][1]=5;
        jp[2][8]=jp[8][2]=5;
        jp[4][6]=jp[6][4]=5;
        jp[3][7]=jp[7][3]=5;
        jp[3][9]=jp[9][3]=6;
        jp[7][9]=jp[9][7]=8;
        int count=0;
        count+=4*getpass(1,1,0,m,n);
        count+=4*getpass(2,1,0,m,n);
        count+=getpass(5,1,0,m,n);
        System.out.println(count);
    }
}