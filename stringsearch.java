import java.util.*;
import java.lang.*;
class Node{
	int x;
	int y;
	Node(int i,int j){
		x=i;
		y=j;
	}
}
class stringsearch{
    static int row[]={-1,-1,-1,0,0,1,1,1,};
    static int col[]={-1,0,1,-1,1,-1,0,1};
    static boolean isvalid(int i,int j,int r,int c){
        return(i>=0 && i<r && j>=0 && j<c);
    }
    static void search(char arr[][],String word,int r,int c,int i,int j,int ind,int len,List<Node> l){
        if(!isvalid(i,j,r,c)){
            return;
        }
        else if(arr[i][j]!=word.charAt(ind)){
            return ;
        }
        else if(ind==len-1){
        	for(Node nod:l){
        		System.out.print("("+nod.x+","+nod.y+")"+" ");
        	}
        	System.out.print("("+i+","+j+")"+" ");
        	System.out.println();
        	return;
        }
        else{
        	l.add(new Node(i,j));
            for(int i1=0;i1<8;i1++){
               search(arr,word,r,c,i+row[i1],j+col[i1],ind+1,len,l);
            }
            l.remove(l.size()-1);
        }
    }
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    int r=in.nextInt();
	    int c=in.nextInt();
	    char arr[][]=new char[r][c];
	    for(int i=0;i<r;i++){
	       for(int j=0;j<c;j++){
	          arr[i][j]=in.next().charAt(0);
	       }
	    }
	   String word=in.next();
	   int len=word.length();
	   List<Node> l=new ArrayList<Node>();
	   for(int i=0;i<r;i++){
	       for(int j=0;j<c;j++){
	            search(arr,word,r,c,i,j,0,len,l);
	       }
	   }
	}
}