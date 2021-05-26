import java.util.*;
import java.lang.*;
import java.io.*;
class findelement{
    static boolean isvalid(int i ,int j,int r,int c){
        if(i<0 || i>=r || j<0 || j>=c) return false;
        return true;
    }
    static boolean isavailable(int arr[][],int r,int c,int given){
        int i=0;
        int j=c-1;
        int el=arr[i][j];
        boolean f=false;
        while(isvalid(i+1,j-1,r,c)){
            if(el==given){
                f=true;
                break;
            }
            else if(given>el){
                i++;
                el=arr[i][j];
            }
            else{
                j--;
                el=arr[i][j];
            }
            //System.out.println(el+" "+given);
            
        }
        return f;
    }
	public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int r=in.nextInt();
	int c=in.nextInt();
	int arr[][]=new int[r][c]; 
	for(int i=0;i<r;i++){
	    for(int j=0;j<c;j++){
	        arr[i][j]=in.nextInt();
	        
	    }
	}
	int given=in.nextInt();
	System.out.println(isavailable(arr,r,c,given));
	}
}