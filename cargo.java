import java.util.*;
import java.lang.*;
class cargo{
	static Set<String> l1;
	static boolean visited[];
	static void getallpath(List<ArrayList<Integer>> l,int sr,int tr,String s){
		if(sr==tr){
			char arr[]=s.toCharArray();
			Arrays.sort(arr);
			l1.add(new String(arr));
			return;
		}
		if(visited[sr]){
			return;
		}
		else{
			for(int i:l.get(sr)){
				visited[sr]=true;
				getallpath(l,i,tr,s+""+i);
				visited[sr]=false;
			}
			return;
		}

	}
	public static void main(String[] args){
	   Scanner in=new Scanner(System.in);
	   int nd=in.nextInt();
	   int n=in.nextInt();
	   int s=in.nextInt();
	   int t=in.nextInt();
	   List<ArrayList<Integer>> l=new ArrayList<ArrayList<Integer>>();
	   for(int i=0;i<=n;i++){
	     l.add(new ArrayList<Integer>());
	   }
	   for(int i=0;i<n;i++){
	      int x=in.nextInt();
	      int y=in.nextInt();
	      l.get(x).add(y);
	      l.get(y).add(x);
	   }
	   visited=new boolean[n];
	   l1=new TreeSet<String>();
	   int sr=in.nextInt();
	   int tr=in.nextInt();
	   getallpath(l,sr,tr,sr+"");
	   int min=Integer.MAX_VALUE;
	   Iterator<String> it=l1.iterator();
	   while(it.hasNext()){
	   	  int len=it.next().length();
	   	  if(len<min){
	   	  	min=len;
	   	  }
	   }
	   System.out.println(min);
	   it=l1.iterator();
	   while(it.hasNext()){
	   	  String s1=it.next();
	   	  //System.out.println(s1);
	   	   if(s1.length()==min){
	   	   	  for(char c:s1.toCharArray()){
	   	   	  	   System.out.print(c+" ");  	   	  	  
	   	   	  }
	   	   	  break;
	   	   }
	   }
	}
}