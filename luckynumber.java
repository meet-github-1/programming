import java.util.*;
import java.lang.*;
class luckynumber{
	public static void main(String[] args){
	     Scanner in=new Scanner(System.in);
	     int r=in.nextInt();
	     int c=in.nextInt();
	     int arr[][]=new int[r][c];
	     int minind[]=new int[r];
	     int min=9999999,ind=-1;
	     for(int i=0;i<r;i++){
	     	for(int j=0;j<c;j++){
	     		arr[i][j]=in.nextInt();
	     		if(arr[i][j]<min){
	     			min=arr[i][j];
	     			//System.out.println(min);
	     			ind=j;


	     	}
	     }
	     minind[i]=ind;
	     min=999999999;
	     ind=-1;
	 }
	 //System.out.println(Arrays.toString(minind));
	     int val=0;
	     for(int i=0;i<r;i++){
	     	ind=minind[i];
	     	int inc=i;
            val=arr[i][ind];
	     	int count=1;
	     	int next=0; 
	     	int flag=0;
	     	while(count<r){
	     		next=(inc+1)%r;
	     		//System.out.println(val+" "+arr[next][ind]+" "+next+" "+ind);
	     		if(arr[next][ind]>val){
	     			flag=1;
	     			break;
	     		}
	     		inc++;
	     		count++;

	     	}
	     	if(flag==0){
	     		System.out.println(val);
	     		break;
	     	}
	     }


	}
}