import java.util.*;
import java.lang.*;
import java.io.*;
class notinrange{
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    String ar[]=in.nextLine().split(" ");
	    int arr[]=Arrays.asList(ar).stream().mapToInt(Integer::parseInt).toArray();
	    int st=in.nextInt();
	    int end=in.nextInt();
	    int ed=0;
	    List<String> l=new ArrayList<String>();
	    //String res="";
	    if((arr[0]-st)>=1){
	    	if(arr[0]-1==st){
	    		l.add(st+"");
	    	}
	    	else{
	    		l.add(st+"->"+(arr[0]-1));
	    	}
	    	}
	    for(int i=1;i<arr.length;i++){
	    	if((arr[i]-arr[i-1])>1){
	    		st=arr[i-1]+1;
	    		ed=arr[i]-1;
	    		if(st==ed) l.add(st+"");
	    		else l.add(st+"->"+ed);

	    	}


	    }
	    System.out.println(arr[arr.length-1]+" "+end);
	    if((end-arr[arr.length-1])>=1){
	    	if(arr[arr.length-1]+1==end){
	    	l.add(end+"");
	    		}
	    else{
            l.add((arr[arr.length-1]+1)+"->"+end);
	      }
	  }
	      System.out.println(l);
	}
}