import java.util.*;
import java.lang.*;
class mike{
	static List<Integer> l1;
	static boolean ifthere(int j){
		if(l1.indexOf(j)==-1){
			return true;
		}
		return false;
	}
	public static void main(String[] args){
	  Scanner in=new Scanner(System.in);
	  int p=in.nextInt();
	  int q=in.nextInt();
	  List<Integer> l=new ArrayList<Integer>();
	  for(int i=0;i<p;i++){
	     l.add(in.nextInt());
	  }
	  l.sort(Collections.reverseOrder());
	  //System.out.println(l);
	  int count=0;
	  l1=new ArrayList<Integer>();
	  for(int i:l){
	     for(int j=q;j>=1;j--){
	         if(i%j==0 && (ifthere(j))){
	         	 l1.add(j);
	             count++;
	             break;
	         }
	     }
	  }
	  System.out.println(count);
	}
}