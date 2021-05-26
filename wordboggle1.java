import java.util.*;
import java.lang.*;
class wordboggle1{
  static boolean isneighbour(int x,int y,int r,int c){
    return(x>=r-1 && x<=r+1 && y>=c-1 && y<=c+1 && !(x==r && y==c));
  }
    static boolean findword(String res,Map<Character,List<String>> mp,int x1,int y1,int cn,boolean vis[][]){
      if(cn==res.length()) return true;
      if(mp.get(res.charAt(cn))!=null){
      for(String r:mp.get(res.charAt(cn))){
         int x=Integer.parseInt(String.valueOf(r.charAt(0)));
         int y=Integer.parseInt(String.valueOf(r.charAt(1)));
         if((cn==0 || isneighbour(x,y,x1,y1)) && !vis[x][y]){
            vis[x][y]=true;
            boolean f=findword(res,mp,x,y,cn+1,vis);
            vis[x][y]=false;
            if(f){
                return true;
            }
         }
      }
    }
      return false;
         
    } 
 
  public static void main(String[] args){
       Scanner in=new Scanner(System.in);
       int t=in.nextInt();
       while(t-->0){
       Map<Character,List<String>> mp1=new HashMap<Character,List<String>>();
       int nw=in.nextInt();
       Set<String> pq=new TreeSet<String>();
       for(int i=0;i<nw;i++){
           pq.add(in.next());
       }
       int r=in.nextInt();
       int c=in.nextInt();
       for(int i=0;i<r;i++){
         for(int j=0;j<c;j++){
            char c1=in.next().charAt(0);
            if(mp1.get(c1)==null){
              mp1.put(c1,new ArrayList<String>());
            }
           mp1.get(c1).add(i+""+j);
         }
       }
       boolean vis[][]=new boolean[r][c];
       boolean flag=false;
      for(String s:pq){
        if(findword(s,mp1,-1,-1,0,vis)){
           System.out.print(s+" ");
           flag=true;
        }
      }
      if(!flag){
          System.out.println("-1");
      }
      System.out.println();
    }
  }
}