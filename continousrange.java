import java.util.*;
import java.lang.*;
import java.io.*;
class continousrange{
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    String ar[]=in.nextLine().split(" ");
	    int arr[]=Arrays.asList(ar).stream().mapToInt(Integer::parseInt).toArray();
	    int prev=arr[0];
	    List<String> l=new ArrayList<String>();
	    String res="";
	    for(int i=1;i<arr.length;i++){
	    	if((arr[i]-arr[i-1])>1){
	    		if(prev==arr[i-1]){
	    			l.add(Integer.toString(prev));
	    		}
	    		else{
	    			res=Integer.toString(prev)+"->"+Integer.toString(arr[i-1]);
                    l.add(res);
	    		}
	    		prev=arr[i];

	    	}


	    }
	    if(prev==arr[arr.length-1]){
	    	l.add(Integer.toString(prev));
	    		}
	    else{
	    	res=Integer.toString(prev)+"->"+Integer.toString(arr[arr.length-1]);
            l.add(res);
	      }
	      System.out.println(l);
	}
}