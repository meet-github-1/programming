import java.util.*;
 class Test{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        Map<String,Integer> m= new HashMap<String,Integer>();
        List<String> l1=new ArrayList<String>();
        List<String> l2=new ArrayList<String>();
        for(int i=0;i<n;i++){
           String s=in.next();
           if(!m.containsKey(s)){
              m.put(s,0);
              l2.add(s);
            }
            else{
              int num=m.get(s)+1;
              String s1=s+Integer.toString(num);
              m.put(s1,0);
              l2.add(s1);
              m.put(s,num);
          }
         l1.add(s);
   }
    for(int i=0;i<l1.size();i++){
        if(l1.get(i).equals(l2.get(i))){
          System.out.println("OK");
}
       else{
          System.out.println(l2.get(i));
}
}
    }}