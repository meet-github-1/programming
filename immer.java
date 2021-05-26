import java.util.*;
import java.lang.*;
class immer{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int s=in.nextInt();
        List<Integer> l=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            l.add(in.nextInt());
        }
        Collections.sort(l);
        int count=0;
        int i=0;
        int j=n-1;
        while(i<=j){
            int a=l.get(i);
            int b=l.get(j);
            if(a+b<=s){
                i++;
                j--;
                count++;
            }
            else{
                count++;
                j--;
            }
        }
        System.out.println(count);
        
    }
}