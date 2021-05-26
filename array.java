import java.util.*;
class array{
   static int n;
static int sum(int arr[]){
       int sr=0; 
	   for(int i=0;i<n;i++){
           sr=sr+arr[i];
	   }
	   return sr;
}
   static boolean recur(int arr[],int target[]){
        int sm=sum(arr);
        if(Arrays.toString(arr).equals(Arrays.toString(target))){
           return true;
        }
        else if(sm>sum(target)){
        	//System.out.println(sm);
            return false;
        }
        else{
            int prev=sm;
            int pr=0;
            for(int i=0;i<n;i++){
                pr=arr[i];
                arr[i]=prev;
                if(recur(arr,target)){
                    return true;
                }
                arr[i]=pr;
            }
        }
        return false;
   }
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    n=in.nextInt();
        String tar[]=in.next().split(",");
        int target[]=Arrays.asList(tar).stream().mapToInt(Integer::parseInt).toArray();
        int arr[]=new int[n];
        Arrays.fill(arr,1);
        String res=recur(arr,target)?"True":"False";
        System.out.println(res);
	}
}