import java.util.*;
import java.lang.*;
class rank {
    static int getindex(Set<Integer> s,int val){
        int ind=1;
        for(int i:s){
         if(i==val) return ind;
         ind++;
        }
        return -1;
    }
	public static void main(String[] args){
	 Scanner in=new Scanner(System.in);
	 int n=in.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++){
       arr[i]=in.nextInt();
     }
     int p=in.nextInt();
     int arr1[]=new int[p];
     for(int i=0;i<p;i++){
     arr1[i]=in.nextInt();
     }
    Set<Integer> st=new TreeSet<Integer>(Collections.reverseOrder());
    for(int i:arr){
      st.add(i);
    }
    for(int i:arr1){
       st.add(i);
       System.out.println(getindex(st,i));
    }
	}
}