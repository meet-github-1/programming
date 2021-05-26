import java.util.*;
import java.lang.*;
import java.io.*;
class decodeuk{
    public static void main(String[] args)throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String arr[]=bf.readLine().split(" ");
        String s=bf.readLine();
        String arr1[]=new String[arr.length];
        System.out.println(arr.length);
        int i=0;
        for(String s1:arr){
            String f="";
            for(char c:s1.toCharArray()){
                f=f+""+(c-97+1);
            }
            arr1[i]=f;
            i++;
        }
        int x=0;
        for(String s1:arr1){
            if(s1.equals(s)){
                System.out.println(arr[x]);
                System.exit(1);
            }
            x++;
        }
        System.out.println("No Match");
    }
}