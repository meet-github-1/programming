import java.util.*;
class permute{
  static Set<String> l1=new HashSet<String>();
       static String swap(String s,int i,int j){
             char arr[]=s.toCharArray();
              char temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
              return String.valueOf(arr);
                     }
       static void per(String s,int l,int h){
        if(l==h){
            l1.add(s);
        }
        else{
           for(int i=l;i<=h;i++){
                s=swap(s,l,i);
                per(s,l+1,h);
                s=swap(s,l,i);

           }
           }


       }
	   public static void main(String[] args){
	     Scanner in=new Scanner(System.in);
	       String s=in.next();
	       per(s,0,s.length()-1);
         System.out.println(l1);

	   }
}