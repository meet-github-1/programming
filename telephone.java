import java.util.*;
import java.lang.*;
class telephone{
	static Map<Integer,ArrayList<Integer>> mp=new HashMap<Integer,ArrayList<Integer>>();
	static int row[];
	static int col[];
	static int dp[][];
	static boolean isvalid(int i,int j){
		if(i==3 && (j==0 || j==2)){
			return false;
		}
		return(i>=0 && i<4 && j>=0 && j<3);
	}
	static void formmap(char arr[][]){
		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				ArrayList<Integer> al=new ArrayList<Integer>();
				if(isvalid(i,j)){
				  al.add(Integer.parseInt(String.valueOf(arr[i][j])));
				for(int k=0;k<4;k++){
					int r=i+row[k];
					int c=j+col[k];
					if(isvalid(r,c)){
						al.add(Integer.parseInt(String.valueOf(arr[r][c])));
					}
				}
				mp.put(Integer.parseInt(String.valueOf(arr[i][j])),al);
			}
			}
		}

	}
	static int getcount(int st,int n){
		if(n==0){
			 return 1;
		}
		if(dp[st][n]!=0){
			return dp[st][n];
		}
		else{
			for(int i:mp.get(st)){
				dp[st][n]=dp[st][n]+getcount(i,n-1);
			}
			return dp[st][n];
		}
	}
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    char arr[][]=new char[4][3];
	    int count=0;
	     for(int i=0;i<3;i++){
	         for(int j=0;j<3;j++){
	           arr[i][j]=(char)(++count+'0');
	         }
	     }
	     arr[3][0]='*';
	     arr[3][1]='0';
	     arr[3][2]='#';
	     row=new int[]{1,-1,0,0};
	     col=new int[]{0,0,1,-1};
	     int n=in.nextInt();
	     dp=new int[10][n+1];
	     count=0;
	     formmap(arr);
	     for(int i=0;i<=9;i++){
	     	count=count+getcount(i,n-1);
	     }
	     System.out.println(count);
	}
}