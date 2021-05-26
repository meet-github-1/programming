import java.util.*;
import java.lang.*;
import java.io.*;
class plane{
    public static void main(String[] args)throws IOException{
        //Scanner in=new Scanner(System.in);
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bf.readLine());
        Map<String,String> mp=new HashMap<String,String>();
        String st="";
        for(int i=0;i<n;i++){
            String arr[]=bf.readLine().split(",");
            mp.put(arr[0],arr[1]);
            if(i==0){
                st=arr[0];
            }
        }
        String prev="";
        while(mp.get(st)!=null){
            //System.out.println(st);
            prev=mp.get(st);
            st=prev;
        }
        System.out.println(prev);
    }
}