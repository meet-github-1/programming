import java.util.*;
import java.lang.*;
class creaturekilling{
	static int n;
	static int maxdiamond(List<Integer> l,int diam,int gol,int num){
               //System.out.println(l);
               if(num==n){
               	 return diam;
               }
               else{
               	List<Integer> mxdiam=new ArrayList<Integer>();
               	List<Integer> copy=new ArrayList<Integer>();
               	for(int i:l){
                       copy.addAll(l);
                       //System.out.println(copy);
                       int ind=copy.indexOf(i);
                       copy.remove(ind);
                       //System.out.println(copy);
                       mxdiam.add(maxdiamond(copy,diam,gol+1,num+1));
                       mxdiam.add(maxdiamond(copy,diam+(gol*i),gol,num+1));
                       //System.out.println(i+" "+mxdiam);
                       copy.clear();

               	}
               	return Collections.max(mxdiam);
               }
	}
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
        List<Integer> l=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
        	l.add(in.nextInt());
        }
        System.out.println(maxdiamond(l,0,1,0));
		
	}
}