import java.util.*;
import java.lang.*;
import java.io.*;
class rightlargest{
    static Map<Integer,Integer> mp;
    //static int pos=0;
    static void fillposition(int p,int num,int arr[]){
       for(int j=p-1;j>=0;j--){
           if(mp.getOrDefault(arr[j],-1)==-1 && arr[j]<arr[p]){
               mp.put(arr[j],num);
           }
       }
    }
    public static void main(String[] args)throws Exception{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int arr1[]=Arrays.asList(bf.readLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
        int arr2[]=Arrays.asList(bf.readLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
        int len2=arr2.length;
        mp=new HashMap<Integer,Integer>();
        for(int i=0;i<len2;i++){
            fillposition(i,arr2[i],arr2);
        }
        List<Integer> l=new ArrayList<Integer>();
        for(int i:arr1){
            l.add(mp.getOrDefault(i,-1));
        }
        System.out.println(l);
        
    }
}