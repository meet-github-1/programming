import java.util.*;
import java.lang.*;
class duplicate{
    static String getmissing(int arr[],int len){
         Map<Integer,Integer> map=new HashMap<Integer,Integer>();
         String s="";
         for(int i:arr){
         	if(map.containsKey(i)){
         		s=s+Integer.toString(i);

         	}
         	//System.out.println(i);
         	map.put(i,1);
         }
         //System.out.println(s);
         for(int i=1;i<=len;i++){
         	if(map.getOrDefault(i,0)==0){
         		s=s+" "+Integer.toString(i);
         	}
         }
         //System.out.println(s);
         return s;

    }
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
	       int n=in.nextInt();
	       String fin[]=new String[n];
	       for(int i=0;i<n;i++){
	            int len=in.nextInt();
	            int arr[]=new int[len];
	            for(int j=0;j<len;j++){
	            arr[j]=in.nextInt();

	            }
	            fin[i]=getmissing(arr,len);

	       }
	       for(String s:fin){
	       System.out.println(s);
	       }
	}
}