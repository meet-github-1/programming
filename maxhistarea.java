import java.util.*;
import java.lang.*;
class maxhistarea{
     static long getmaxheight(int arr[]){
           Stack<Integer> s=new Stack<Integer>();
           int len=arr.length;
           s.push(-1);
           long maxarea=0;
           int i,lastele;
           for(i=0;i<len;i++){
                 while(s.peek()!=-1 && arr[s.peek()]>arr[i]){
                             lastele=s.pop();
                            maxarea=(long)Math.max(maxarea,arr[lastele]*(i-1-s.peek()));
                 }
                 s.push(i);
           }
           while(s.peek()!=-1 ){
                 lastele=s.pop();
                 maxarea=(long)Math.max(maxarea,(arr[lastele]*(len-1-s.peek())));
           }
           return maxarea;
     }
     public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
          arr[i]=in.nextInt();
        }
        System.out.println(getmaxheight(arr));
     }
	
}