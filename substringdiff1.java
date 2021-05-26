import java.util.*;
import java.lang.*;
class substringdiff1{
   public int countSubstrings(String s,String t){
     int count=0;
     s=s==null?"":s;
     t=t==null?"":t;
     if(s.length()>t.length()){
       return(countSubstrings(t,s));
     }
     Node root=buildTrie(s);
     char arr[]=t.toCharArray();
     for(int i=0;i<t.length();i++){
          count+=findMatch(root,arr,i,false);
     }
     return count;
   }
   public int findMatch(Node root,char arr[],int pos,boolean used){
        if(root==null || pos==arr.length){
            return 0;
        }
        char c=arr[pos];
        int total=0;
        if(used){
            if(root.nodes[c-'a']==null){
              return 0;
            }
            return root.nodes[c-'a'].count+findMatch(root.nodes[c-'a'],arr,pos+1,true);
        }
        for(char a='a';a<='z';a++){
           if(root.nodes[a-'a']==null){
              continue;
           }
           if(a==c){
             total+=findMatch(root.nodes[a-'a'],arr,pos+1,false);
           }
           else{
             total+=(findMatch(root.nodes[a-'a'],arr,pos+1,true)+root.nodes[a-'a'].count);
           }
        }
        return total;
   }
   private static final class Node{
       final Node[]nodes=new Node[26];
       int count=0;
   }
   private Node buildTrie(String s){
      Node root=new Node();
      char[] arr=s.toCharArray();
      for(int i=0;i<s.length();i++){
         insert(root,arr,i);
      }
      return root;
   }
   private void insert(Node root,char arr[],int start){
        int len=arr.length,size=0;
        Node curr=root;
        while(start<len){
           char c=arr[start++];
           if(curr.nodes[c-'a']==null){
               curr.nodes[c-'a']=new Node();
           }
           curr=curr.nodes[c-'a'];
           curr.count++;
        }
   }
	public static void main(String[] args){
	  Scanner in=new Scanner(System.in);
	  String s=in.next();
	  String t=in.next();
	  substringdiff1 sb=new substringdiff1();
	  System.out.println(sb.countSubstrings(s,t));
	}
}