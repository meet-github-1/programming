import java.util.*;
import java.lang.*;
class trie{
    String word;
    int count;
    Map<Character,trie> mp;
    trie(){
        count=0;
        mp=new HashMap<Character,trie>();
    }
}
class node{
    String word;
    int occr;
    node(String word,int occr){
        this.word=word;
        this.occr=occr;
    }
}
class mostoccuring implements Comparator<node>{
    static PriorityQueue<node> pq;
    public int compare(node a,node b){
        if(a.occr==b.occr){
            return a.word.compareTo(b.word);
        }
        else{
            return b.occr-a.occr;
        }
    }
    static void insert(trie tr,String s){
        trie temp=tr;
        int len=s.length();
        for(int i=0;i<len;i++){
            char alp=s.charAt(i);
            if(temp.mp.get(alp)==null){
                temp.mp.put(alp,new trie());
            }
            temp=temp.mp.get(alp);
        }
        temp.word=s;
        temp.count++;
    }
    static void traverse(trie tr){
        if(tr==null){
            return;
        }
        else{
            for(Map.Entry<Character,trie> mp1:tr.mp.entrySet()){
                if(mp1.getValue().count>0){
                    //System.out.println(mp1.getValue().count);
                    pq.add(new node(mp1.getValue().word,mp1.getValue().count));
                }
                traverse(mp1.getValue());
            }
            return ;
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String arr[]=in.nextLine().split(",");
        int r=in.nextInt();
        trie root=new trie();
        for(String s:arr){
            insert(root,s);
        }
        pq=new PriorityQueue<node>(new mostoccuring());
        traverse(root);
        //System.out.println(pq);
        while(r>0){
            System.out.print(pq.poll().word+" ");
            r--;
        }
    }
}