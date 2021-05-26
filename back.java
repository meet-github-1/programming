import java.util.*;
import java.lang.*;
import java.io.*;
class findsum{
    static HashMap<String,Integer> l1;
    static int rsum;
    static boolean flag=false;
    static void findsumpair(List<Integer> l,int sum,int ind,String s){
        if(sum>rsum){
            return;
        }
        if(sum==rsum){
            flag=true;
            String ar[]=s.split(" ");
            for(int i=1;i<ar.length;i++){
                System.out.print(ar[i]+" ");
            }
            System.out.println();
        }
        if(l.size()==0){
            return ;
        }
        else{
            for(int i=ind;i<l.size();i++){
                int el=l.get(i);
                if(sum+el<=rsum){
                findsumpair(l,sum+el,i+1,s+" "+el);
                }
            }
            return ;
        }
    }
    public static void main(String[] args){
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      List<Integer> l=new ArrayList<Integer>();
      for(int i=0;i<n;i++){
          l.add(in.nextInt());
      }
      rsum=in.nextInt();
      l1=new HashMap<String,Integer>();
      findsumpair(l,0,0,"");
      if(!flag){
          System.out.println("-1");
          System.exit(1);
      }
      
      
    }
}