import java.util.*;
import java.lang.*;
class diagonal{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int r=in.nextInt();
        int c=in.nextInt();
        boolean flag=true;
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=in.nextInt();
            }
        }
    loop1:
    for(int i=0;i<r-1;i++){
           for(int j=0;j<c-1;j++){
               if(arr[i][j]!=arr[i+1][j+1]){
                   flag=false;
                   break loop1;
               }
           }
       }
       System.out.println(flag);
    }
}