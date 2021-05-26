import java.util.*;
import java.lang.*;
class palindromestring{
   static boolean valid(int i,int j,int r,int c){
   	   return(i>=0 && i<r && j>=0 && j<c);
   }
   static boolean palindrome(String s){
        StringBuilder sb=new StringBuilder(s);
        if(sb.reverse().toString().equals(s)){
           return true;
        }
        return false;
   }
   static int numofpl(char arr[][],int r,int c,int i,int j,String s){
         if(!valid(i,j,r,c)){
             return 0;
         }
         else if(i==r-1 && j==c-1){
         	 s=s+arr[i][j];
             if(palindrome(s)){
                return 1;
             }
             return 0;
         }
         else{
             int sum=0;
             sum+=numofpl(arr,r,c,i+1,j,s+arr[i][j]);
             sum+=numofpl(arr,r,c,i,j+1,s+arr[i][j]);
             return sum;

         }

   }
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    int r=in.nextInt();
	    int c=in.nextInt();
	    char arr[][]=new char[r][c];
	    for(int i=0;i<r;i++){
	        for(int j=0;j<c;j++){
	           arr[i][j]=in.next().charAt(0);
	        }
	    }
	    System.out.println(numofpl(arr,r,c,0,0,""));
	}
}