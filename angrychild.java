import java.util.*;
import java.lang.*;
class angrychild{
    static int MAX=999999;
    static int unfairnesssum(List<Integer> l){
       int len=l.size();
       int sum=0;
       for(int i=0;i<len-1;i++){
          for(int j=i+1;j<len;j++){
            sum+=Math.abs(l.get(i)-l.get(j));
          }
       }
       //System.out.println(sum);
       return sum;
    }
    static int getmin(int arr[],int n,int k,List<Integer> l){
       if(k==0){
       	  //System.out.println(l);
          return(unfairnesssum(l));
       }
       else if(n<0){
          return MAX;
       }
       else{
       	   l.add(arr[n]);
           int s1=getmin(arr,n-1,k-1,l);
           l.remove(l.size()-1);
           int s2=getmin(arr,n-1,k,l);
           //System.out.println(s1+" "+s2);
           return(Math.min(s1,s2));
       }
    }
	public static void main(String[] args){
	   Scanner in=new Scanner(System.in);
	   int n=in.nextInt();
	   int arr[]=new int[n];
	   int k=in.nextInt();
	   for(int i=0;i<n;i++){
	    arr[i]=in.nextInt();
	   }
	   List<Integer> l=new ArrayList<Integer>();
	   System.out.println(getmin(arr,n-1,k,l));
	}
}