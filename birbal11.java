import java.util.*;
import java.lang.*;
class birbal11{
	static boolean ifpossible(int arr[][],List<Integer> l,int n,int st,int gol){
		if(gol<0){
			return false;
		}
		if(st==n){
			return true;
		}
		else{
            for(int j=0;j<l.size();j++){
            	int i=l.get(j);
            	int x=i;
            	l.remove(new Integer(i));
            	if(ifpossible(arr,l,n,st+1,(gol+arr[i][0]-arr[i][1]))){
            		return true;
            	}
            	l.add(x);

            }
            return false;
		}
	}
	static int round(int arr[][],List<Integer> l,int n){
		for(int i=0;i<n;i++){
			int x=i;
			l.remove(new Integer(i));
			if(ifpossible(arr,l,n,1,(0+arr[i][0]-arr[i][1]))){
				return i;
			}
			l.add(x);
		}
		return -1;
	}
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    int arr[][]=new int[n][2];
	    List<Integer> l=new ArrayList<Integer>();
	    for(int i=0;i<n;i++){
	       arr[i][0]=in.nextInt();
	       arr[i][1]=in.nextInt();
	       l.add(i);
	    }
	    System.out.println(round(arr,l,n));

	}
}