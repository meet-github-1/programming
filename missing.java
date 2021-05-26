import java.util.*;
class missing{
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        int n=in.nextInt();
        String arr[]=in.next().split(",");
        int v=1;
        for(String p:arr){
            int x=Integer.parseInt(p);
            if(x==v){
                v++;
                
            }
            map.put(x,1);

        }
        while(map.getOrDefault(v,0)!=0){
            v++;
        }
        System.out.println(v);
    }
}