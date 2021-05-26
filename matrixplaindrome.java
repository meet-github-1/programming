import java.util.*;
import java.lang.*;
class matrixplaindrome{
    static int minimumrep(int arr[][],int r,int c){
         int ans=0;
         Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
         int a=0,b=a,c1=a,d=a;
         int x=0;
         for(int i=0;i<r/2;i++){
           for(int j=0;j<c/2;j++){
                  a=arr[i][c-1-j];
                  b=arr[i][j];
                  c1=arr[r-1-i][j];
                  d=arr[r-1-i][c-1-j];
                  mp.put(a,mp.getOrDefault(a,0)+1);
                  mp.put(b,mp.getOrDefault(b,0)+1);
                  mp.put(c1,mp.getOrDefault(c1,0)+1);
                  mp.put(d,mp.getOrDefault(d,0)+1);
                  x=0;
                  for(Map.Entry<Integer,Integer> e:mp.entrySet()){
                        x=Math.max(e.getValue(),x);
                  }
                  ans+=4-x;
                  mp.clear();
           }
         }
         if(r%2==1){
               for(int j=0;j<c/2;j++){
                  if(arr[r/2][j]!=arr[r/2][c-1-j]){
                    ans++;
                  }
               }
         }
         if(c%2==1){
             for(int i=0;i<r/2;i++){
                  if(arr[i][c/2]!=arr[r-1-i][c/2]){
                    ans++;
                  }
             }
         }
         return ans;
    }
	public static void main(String[] args){
	   Scanner in=new Scanner(System.in);
	   int r=in.nextInt();
	   int c=in.nextInt();
	   int arr[][]=new int[r][c];
	   for(int i=0;i<r;i++){
	     for(int j=0;j<c;j++){
	         arr[i][j]=in.nextInt();
	     }
	   }
	   System.out.println(minimumrep(arr,r,c));
	}
}