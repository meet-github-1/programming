import java.util.*;
import java.lang.*;
class frequencysort{
	static void sort(int arr[],int x){
		Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
		//String array[]=new String[100000];
		Map<Integer,PriorityQueue<Integer>> mp1=new HashMap<Integer,PriorityQueue<Integer>>();
		int mx=0;
		for(int i:arr){
			mp.put(i,mp.getOrDefault(i,0)+1);
		}
		for(Map.Entry<Integer,Integer> en:mp.entrySet()){
			 int ind=en.getValue();
			 if(ind>mx){
			 	mx=ind;
			 }
			 if(mp1.get(ind)==null){
			 	//array[ind]=array[ind]+Integer.toString(en.getKey());
			 	mp1.put(ind,new PriorityQueue<Integer>());
			 }
			 mp1.get(ind).add(en.getKey());
		}
		for(int i=mx;i>=1;i--){
			if(mp1.get(i)!=null){
				PriorityQueue<Integer> pq=mp1.get(i);
				while(!pq.isEmpty()){
					int x1=pq.poll();
					for(int j=0;j<i;j++){
						System.out.print(x1+" ");
					}

				}
			}
			
		}
		System.out.println();
	}
	public static void main(String[] args){
	   Scanner in=new Scanner(System.in);
	   int n=in.nextInt();
	   while(n-->0){
	   	  int x=in.nextInt();
	   	  //String sr[]=in.nextLine().split(" ");
          //int arr[]=Arrays.asList(sr).stream().mapToInt(Integer::parseInt).toArray();
          int arr[]=new int[x];
          for(int i=0;i<x;i++){
          	arr[i]=in.nextInt();
          }
          sort(arr,x);
	   }

	}
}