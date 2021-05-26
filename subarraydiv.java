import java.util.*;
class subarraydiv{
static int subcount(int arr[] ,int n,int k){
	int mod[] =new int[k];
	Arrays.fill(mod,0);
	int cumsum=0;
	for(int i=0;i<n;i++){
	cumsum+=arr[i];
	mod[((cumsum%k)+k)%k]++;
	}
	System.out.println(Arrays.toString(mod));
	int result=0;
	for(int i=0;i<k;i++){
	if(mod[i]>1){
	   result+=(mod[i]*(mod[i]-1))/2;

	}
	}
	result+=mod[0];
	return result;
}
 public static void main(String[] args){
   Scanner in=new Scanner(System.in);
   int l=in.nextInt();
   String strings[]=in.next().split(",");
   int arr[]=Arrays.asList(strings).stream().mapToInt(Integer::parseInt).toArray();
   int k=in.nextInt();
   System.out.println(subcount(arr,l,k));
   //System.out.println(-2%5);


 }
}
