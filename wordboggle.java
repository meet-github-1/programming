import java.util.*;
import java.lang.*;
class wordboggle{
	static boolean valid(int x,int y,int r,int c){
		if(x<0 || x>=r || y<0 || y>=c) return false;
		return true;
	}
    static boolean findword(char arr[][],String s,int x,int y,int r,int c,String emp){
    	   //System.out.println(s+" "+emp);
    	   if(s.equals(emp)){
           	//System.out.println("string"+" "+s);
               return true;
           }
           else if(!valid(x,y,r,c) || arr[x][y]=='*'){
           	   //System.out.println("String"+" "+s);
               return false;
           }
           else{
                char prev=arr[x][y];
                arr[x][y]='*';
                if(findword(arr,s,x-1,y,r,c,emp+prev)){
                   arr[x][y]=prev;
                   return true;
                }
                else if(findword(arr,s,x+1,y,r,c,emp+prev)){
                   arr[x][y]=prev;
                   return true;
                }
                else if(findword(arr,s,x,y-1,r,c,emp+prev)){
                   arr[x][y]=prev;
                   return true;
                }
                else if(findword(arr,s,x,y+1,r,c,emp+prev)){
                    arr[x][y]=prev;
                   return true;
                }
                else if(findword(arr,s,x-1,y-1,r,c,emp+prev)){
                    arr[x][y]=prev;
                   return true;
                }
                else if(findword(arr,s,x-1,y+1,r,c,emp+prev)){
                    arr[x][y]=prev;
                   return true;
                }
                else if(findword(arr,s,x+1,y-1,r,c,emp+prev)){
                   arr[x][y]=prev;
                   return true;
                }
                else if(findword(arr,s,x+1,y+1,r,c,emp+prev)){
                   arr[x][y]=prev;
                   return true;
                }
                arr[x][y]=prev;
                return false;
           }

    } 
    static String[] findhelper(String ar[],char arr[][],Map<String,List<String>> mp,int r,int c){
        String res[]=new String[mp.size()];
        int i=0;
         for(String s:ar){
         	if(mp.get(s)!=null){
               for(String pos:mp.get(s)){
                   int x=Integer.parseInt(String.valueOf(pos.charAt(0)));
                   int y=Integer.parseInt(String.valueOf(pos.charAt(1)));
                   if(findword(arr,s,x,y,r,c,"")){
                   	//System.out.println(s);
                       res[i]=s;
                       i++;
                       break;
                   }
               }
           }
         }
         return res;
    }
	public static void main(String[] args){
	     Scanner in=new Scanner(System.in);
	     int t=in.nextInt();
	     while(t-->0){
	     Map<Character,List<String>> mp1=new HashMap<Character,List<String>>();
	     Map<String,List<String>> mp2=new HashMap<String,List<String>>();
	     int nw=in.nextInt();
	     String dic[]=new String[nw];
	     for(int i=0;i<nw;i++){
	         dic[i]=in.next();
	         if(mp1.getOrDefault(dic[i].charAt(0),null)==null){
	                mp1.put(dic[i].charAt(0),new ArrayList<String>());
	         }
	         mp1.get(dic[i].charAt(0)).add(dic[i]);
	     }
	     int r=in.nextInt();
	     int c=in.nextInt();
	     char arr[][]=new char[r][c];
	     for(int i=0;i<r;i++){
	       for(int j=0;j<c;j++){
	          arr[i][j]=in.next().charAt(0);
	          if(mp1.getOrDefault(arr[i][j],null)!=null){
	               for(String s:mp1.get(arr[i][j])){
	                   if(mp2.getOrDefault(s,null)==null){
	                         mp2.put(s,new ArrayList<String>());
	                   }
	                   mp2.get(s).add(i+""+j);
	               }
	          }
	       }
	     }
	     System.out.println(mp2.keySet());
	     String res[]=findhelper(dic,arr,mp2,r,c);
	     for(String re:res){
	     	if(re!=null){
	         System.out.print(re+" ");
	     	}
	     }

	     }
	}
}