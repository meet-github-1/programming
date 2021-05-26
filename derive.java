import java.util.*;
class derive{
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        String str1=s.next();
        String str2=s.next();
        Map<Character,Integer>map1=new HashMap<Character,Integer>();
        Map<Character,Integer>map2=new HashMap<Character,Integer>();
        int arr1[]=new int[str1.length()];
        int arr2[]=new int[str2.length()];
        for(int i=0;i<str1.length();i++){
            int v=map1.getOrDefault(str1.charAt(i),0);
            map1.put(str1.charAt(i),v+1);
        }
        for(int i=0;i<str2.length();i++){
            int v=map2.getOrDefault(str2.charAt(i),0);
            map2.put(str2.charAt(i),v+1);
        }
        for(int i=0;i<str1.length();i++){
            arr1[i]=map1.get(str1.charAt(i));
        }
        for(int i=0;i<str2.length();i++){
            arr2[i]=map2.get(str2.charAt(i));
        }
        //Arrays.sort(arr1);
        //Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}