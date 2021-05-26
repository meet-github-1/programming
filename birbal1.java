import java.util.*;
class birbal1{
	static int iftravel(int arr[][],int n){
		int gol,j,vill;
           for(int i=0;i<arr.length;i++){
           	gol=0;
           	j=i;
           	vill=0;
           	do{
               gol=gol+(arr[j][0]-arr[j][1]);
               System.out.println(gol+"->"+i+" "+"clockwise");
               if(j==n-1){
               	j=0;
               	gol=gol+(arr[j][0]-arr[j][1]);
               	vill++;
               }
               j++;
               vill++;
               if(gol<0){
               	  break;
               }
 
           	}while(vill<n);
           	System.out.println(gol+" "+i+" "+"clockwise");
           	if(gol>=0 && vill==n){
           		return i;
           	}
           }
           for(int i=0;i<arr.length;i++){
           	gol=0;
           	j=i;
           	vill=0;
           	do{
               gol=gol+(arr[j][0]-arr[j][1]);
               System.out.println(gol+" ->"+i+" "+"anticlockwise");
                if(j==0){
               	j=n-1;
               	gol=gol+(arr[j][0]-arr[j][1]);
               	vill++;
               }
               j--;
               vill++;
               if(gol<0){
               	  break;
               }
           	}while(vill<n);
           System.out.println(gol+" "+i+" "+"anticlockwise");
           	if(gol>=0 && vill==n){
           		return i;
           	}
           }
           return -1;


	}
	public static void main(String[] args){
                Scanner in=new Scanner(System.in);
                int n=in.nextInt();
                int arr[][]=new int[n][2];
                for(int i=0;i<n;i++){
                      arr[i][0]=in.nextInt();
                      arr[i][1]=in.nextInt();
                }
                 if(n==1){
                if((arr[0][0]-arr[0][1])>=0){
                    System.out.println(0);
                }
                else{
                    System.out.println("-1");
                }
                    
                    
                }
                else{
               System.out.println(iftravel(arr,n));
           }

	}
}