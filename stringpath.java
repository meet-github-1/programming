import java.util.*;
import java.lang.*;
class stringpath{
static String res;
static String res1;
static boolean valid(int i,int j,int r,int c){
	   if(i<0 || i>=r || j<0 || j>=c)
	     return false;
	   return true;
}
static void getshortest(char arr[][],int i,int j,int r,int c,String s,String ss){
    if(i==r-1 && j==c-1){
      if(s.compareTo(res)<0){
        res=s;
        res1=ss;
        }
       if(s.equals(res) && ss.compareTo(res1)<0){
         res1=ss;
        }
        return ;
    }
    else{
          char c1=arr[i][j];
          arr[i][j]='{';
          boolean t1=valid(i+1,j,r,c);
          boolean t2=valid(i,j+1,r,c);
          if(t1==true && t2==false){
              getshortest(arr,i+1,j,r,c,s+c1,ss+"D");
          }
          else if(t2==true && t1==false){
                getshortest(arr,i,j+1,r,c,s+c1,ss+"R");
            }
           else{
                char c11=arr[i+1][j];
                char c22=arr[i][j+1];
                if(c11<c22){
                	getshortest(arr,i+1,j,r,c,s+c1,ss+"D");
                }
                else if(c22<c11){
                       getshortest(arr,i,j+1,r,c,s+c1,ss+"R");
                }
                else{
                	getshortest(arr,i+1,j,r,c,s+c1,ss+"D");
                	getshortest(arr,i,j+1,r,c,s+c1,ss+"R");
                }

           }
          arr[i][j]=c1;
          return;
         
    }
	   
}
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	String fin[]=new String[n];
	for(int k=0;k<n;k++){
	int r=in.nextInt();
	int c=in.nextInt();
	char arr[][]=new char[r][c];
	res="z";
	res1="";
	for(int i=0;i<r;i++){
		String sr=in.next();
	  for(int j=0;j<c;j++){
	     arr[i][j]=sr.charAt(j);
	  }
	}
	 getshortest(arr,0,0,r,c,"","");
	 fin[k]=res1;
	}
	for(String s:fin){
	    System.out.println(s);
	}
}
}