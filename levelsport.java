import java.util.*;
import java.lang.*;
class levelsport{
    static int day[];
    static boolean vis[];
    static boolean vs[];
    /*static boolean cycle(int i,List<ArrayList<Integer>> l){
    	System.out.println(i+" "+vs[i]);
    	if(vs[i]){
    		return true;
    	}
    	else{
    		vs[i]=true;
    		for(int i1:l.get(i)){
    			//System.out.println("i1"+" "+i1);
    		   if(cycle(i1,l)){
    		   	return true;
    		   }
    		}
    		return false;
    	}
    }*/
    static int dfs(int ind,List<ArrayList<Integer>> l){
       if(day[ind]!=0){
          return day[ind];
       }
       else{
          vis[ind]=true;
          for(int i:l.get(ind)){
             if(!vis[i]){
             	dfs(i,l);
             }
             day[ind]=Math.max(day[ind],1+day[i]);
          }
          return day[ind]==0?1:day[ind];
       }
    }
    static int getminday(List<ArrayList<Integer>> ls,int l){
    	/*for(int i=1;i<=l;i++){
    		vs=new boolean[l+1];
    		boolean varab=cycle(i,ls);
    		System.out.println(varab);
    		if(varab){
    			return -1;
    		}
    	}*/
         int max=Integer.MIN_VALUE;
         for(int i=1;i<=l;i++){
              if(!vis[i]){
                day[i]=dfs(i,ls);;
                //System.out.println("d"+" "+day[i]);
              }
              max=Math.max(day[i],max);
         }
         return max;
    }
	public static void main(String[] args){
	   Scanner in=new Scanner(System.in);
	   int l=in.nextInt();
	   int d=in.nextInt();
	   int dr[][]=new int[d][2];
	   List<ArrayList<Integer>> ls=new ArrayList<ArrayList<Integer>>();
	   for(int i=0;i<=l;i++){
	    ls.add(new ArrayList<Integer>());
	   }
	   for(int i=0;i<d;i++){
	     dr[i][0]=in.nextInt();
	     dr[i][1]=in.nextInt();
	     ls.get(dr[i][1]).add(dr[i][0]);
	   }
	   //System.out.println(ls);
	   day=new int[l+1];
	   vis=new boolean[l+1];
	   System.out.println(getminday(ls,l));
	}
}