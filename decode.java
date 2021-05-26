import java.util.*;
import java.io.*;
class decode{
	static String repeat(String rep,int x1){
		String x="";
		while(x1-->0){
			x=x+rep;

		}
		return x;
	}
	static String stringdecode(String s){
		Stack<Integer> st=new Stack<Integer>();
		Stack<String> st1=new Stack<String>();
		//StringBuilder sb=new StringBuilder();
		int num=0;
		String res="",prev=""; 
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(Character.isDigit(c)){
				num=num*10+(c-'0');
			}
			else if(c=='['){
				st.push(num);
				num=0;
				st1.push(res);
				res="";

			}
			else if(c==']'){
				  int rep=st.pop();
				  st1.push(res);
				  res=repeat(st1.pop(),rep);
				  res=st1.pop()+res;


			}
			else{
				res=res+c;
			}

		}
		return res;
	}
	public static void main(String[] args) throws IOException{
	     BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	     String s=bf.readLine();
	     System.out.println(stringdecode(s));
         

	     
	}
}