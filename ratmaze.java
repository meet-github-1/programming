import java.util.*;
class ratmaze{
	static boolean ifindex(int x,int y,int len){
		if(x>=len || y>=len || x<0 || y<0) return false;
		return true;
	}
	static void callrecursion(int arr[][],int len,int x,int y,String f,String s1){
		if(arr[len-1][len-1]==0){
			return false;
		}
		if(x==len-1 && y==len-1){
			System.out.print(f+" ");
			s1=s1+f;
			return ;
		}
		else if(!ifindex(x,y,len) || arr[x][y]==0){
			return ;
		}
		else{
			arr[x][y]=0;
			callrecursion(arr,len,x-1,y,f+"U",s1);
			callrecursion(arr,len,x+1,y,f+"D",s1);
			callrecursion(arr,len,x,y-1,f+"L",s1);
			callrecursion(arr,len,x,y+1,f+"R",s1);
			arr[x][y]=1;
			return ;
		}

	}
	static void traverse(int arr[][],int len){
		/*for(int i=0;i<len;i++){
			for(int j=0;j<len;j++){
				System.out.println(arr[i][j]+" ");
			}
		}*/
		String sr="";
		callrecursion(arr,len,0,0,"",sr);
		if(sr.equals("")){
		System.out.println("-1");
		}
		return ;
		//return sr;
	}
	public static void main(String[] args){
	  Scanner in=new Scanner(System.in);
	  int n=in.nextInt();
	  //List<String> l=new ArrayList<String>();
	  for(int k=0;k<n;k++){
	  int f=in.nextInt();
	  int[][] arr=new int[f][f];
	  //System.out.println(arr.length);
	  int ind1=0,ind2=0;
      for(int r=1;r<=f*f;r++){
      	//System.out.println(ind1+" "+ind2);
      	arr[ind1][ind2]=in.nextInt();
      	//System.out.println(arr[ind1][ind2]);
      	if(r%f==0){
      		ind2=0;
      		ind1=ind1+1;
      	}
      	else{
      	ind2=ind2+1;
      };
      }
	  	/*for(int i=0;i<f;i++){
	  		for(int j=0;j<f;j++){
	  			System.out.print(arr[i][j]+" ");
	  		}
	  	}*/
	  	//.out.println(Arrays.toString(arr)+" "+f+" "+n);
	  traverse(arr,f);
	  //System.out.println();

	}
	/*for(String s:l){
		System.out.println(s);
	  

	}*/
	}
}