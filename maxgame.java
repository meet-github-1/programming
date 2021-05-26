import java.util.*;
import java.lang.*;
class maxgame{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        List<Integer> l=new ArrayList<Integer>();
        int ys=0;
        int dt=0;
        int flag=0;
        int ind=0;
        for(int i=0;i<n;i++){
            l.add(in.nextInt());
        }
        while(!l.isEmpty()){
               if(flag==0 && l.size()==1){
                   ys+=l.get(0);
                   ind=0;
                   l.remove(ind);
                   flag=1;
               }
               else if(flag==1 && l.size()==1){
                   dt+=l.get(0);
                   ind=0;
                   l.remove(ind);
                   flag=0;
               }
               else if(flag==0 && l.size()==2){
                   Integer f1=l.get(0);
                   Integer f2=l.get(1);
                   ys+=Math.max(f1,f2);
                   l.remove((Integer)Math.max(f1,f2));
                   flag=1;
               }
               else if(flag==1 && l.size()==2){
                   Integer f1=l.get(0);
                   Integer f2=l.get(1);
                   dt+=Math.max(f1,f2);
                   l.remove((Integer)Math.max(f1,f2));
                   flag=0;
               }
               else{
                   Integer f1=l.get(1);
                   Integer f2=l.get(l.size()-2);
                   int ele=0;
                   if(f1>f2){
                       ele=l.get(l.size()-1);
                       l.remove((Integer)ele);
                   }
                   else if(f2>f1){
                       ele=l.get(0);
                       l.remove((Integer)ele);
                   }
                   else if(f1==f2){
                       ele=Math.max(l.get(0),l.get(l.size()-1));
                       l.remove((Integer)ele);
                   }
                   if(flag==0){
                       ys+=ele;
                       flag=1;
                   }
                   else if(flag==1){
                       dt+=ele;
                       flag=0;
                   }
               }
        }
        //System.out.println(ys+" "+dt);
        System.out.println(ys>dt?"Yash":"Dutt");
        
    }
}