import java.util.*;
import java.lang.*;
class arrange{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        Queue<Integer> q=new LinkedList<Integer>();
        Queue<Integer> q1=new LinkedList<Integer>();
        for(int i:arr){
            if(i%2==0){
                q.add(i);
            }
            else{
            q1.add(i);
            }
        }
        q.addAll(q1);
        System.out.println(q);
    }
}