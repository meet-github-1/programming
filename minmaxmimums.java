class minmaximums{
    static int MAX=9999;
    static int MIN=-9999;
    static int dp[][];
    static int minmaxim(int arr[],int n,int ind,int k){
    if(k==0){
        if(ind==n){
           return MIN;
        }
        else{
        	return MIN;
        }
    }
     else if(ind==n){
      	 return MAX;
      }
      else if(dp[ind][k]!=-1){
      	 return dp[ind][k];
      }
        else{
           int sum=0;
           int min=MAX;
           int max=MIN;
           for(int i=ind;i<n;i++){
              sum+=arr[i];
              max=Math.max(sum,maxminim(arr,n,i+1,k-1));
              min=Math.min(max,min);
            }
            dp[ind][k]=min;
            return dp[ind][k];
        }
    }
	public static void main(String[] args){
	   Scanner in=new Scanner(System.in);
	   int n=in.nextInt();
	   int arr[]=new int[n];
	   for(int i=0;i<n;i++){
	     arr[i]=in.nextInt();
	   }
	   int k=in.nextInt();
	   dp=new int[n][k+1];
	   for(int i=0;i<n;i++){
	   	 for(int j=0;j<k+2;j++){
	   	 	dp[i][j]=-1;
	   	 }
	   }
     for(int i=0;i<n;i++){
        for(int j=0;j<k+1;j++){
          System.out.print(dp[i][j]+" ");
        }
        System.out.println();
     }
	   System.out.println(minmaxim(arr,n,0,k));
	}
}