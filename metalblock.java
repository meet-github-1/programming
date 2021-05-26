import java.util.*;
import java.lang.*;
class metalblock{
    static char arr[][];
    static int right(int i1,int j1,int r,int c){
        int count=0;
        for(int j=0;j<c;j++){
            if(arr[i1][j]=='B'){
                count++;
            }
            if(arr[i1][j]=='M'){
                count=0;
            }
        }
        return count;
    }
    static int down(int i1,int j1,int r,int c){
        int count=0;
        for(int i=0;i<r;i++){
            if(arr[i][j1]=='B'){
                count++;
            }
            if(arr[i][j1]=='M'){
                count=0;
            }
        }
        return count;
        
    }
    //p
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int r=in.nextInt();
        int c=in.nextInt();
        arr=new char[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=in.next().charAt(0);
            }
        }
        int max=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]=='0'){
                   max=Math.max(max,down(i,j,r,c)+right(i,j,r,c));
                }
            }
        }
        System.out.println(max);
    }
}