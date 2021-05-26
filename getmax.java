import java.util.*;
class getmax{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while(n-->0){
        int p=in.nextInt();
        int q1=in.nextInt();
        int arr[]=new int[p];
        Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
        Queue<Integer> q=new LinkedList<Integer>(); 
        for(int i=0;i<p;i++) arr[i]=in.nextInt();
         int mx=-99999;
        int prev=0;
        int mx1=-99999;
        int ind=-1;
        int prev1=0;
        for(int i=0;i<p;i++){
        if(arr[i]>mx){
            mx=arr[i];
            //System.out.println(mx+" "+i);
            ind=i;
        }
        if(((i+1)-prev)==q1){
            if(q.peek()!=null){
            if(((i+1)-q.peek())>q1){
               mx1=-9999;
               mx=-9999;
               for(int j=q.peek()+1;j<=i;j++){
                if(arr[j]>mx){
                    mx=arr[j];
                    ind=j;
                }
               }
               //System.out.println("max"+" "+mx);
            }
        }
            //System.out.println((i+1)+" "+mx1+" "+mx);
            if(mx>mx1){
              mx1=mx;
              prev1=ind;
              if(q.peek()!=null){
                 q.poll();
              }
              q.add(prev1);
            }
            System.out.print(arr[q.peek()]+" ");
            prev++;
            mp.put(q.peek(),mp.getOrDefault(q.peek(),0)+1);


        }

        }
        System.out.println();
    }
        
    }
}