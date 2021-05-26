import java.util.*;
import java.io.*;
class maxdistinct{
	static int getmaxdistinct(String s){
		Map<Character,Integer> mp=new HashMap<Character,Integer>();
		int prev=1,mx=0,i;
		 for(i=0;i<s.length();i++){
		 	if(mp.getOrDefault(s.charAt(i),-1)!=-1){
		 		if(i+1-prev>mx){
		 			mx=(i+1-prev);
		 		}
		 		System.out.println("mx="+" "+mx+" "+i);
		 		if(mp.get(s.charAt(i))+1>prev){
		 		prev=mp.get(s.charAt(i))+1;
		 	}
		 		mp.put(s.charAt(i),i+1);
		 		continue;

		 	}
		 	mp.put(s.charAt(i),i+1);
		 	System.out.println(mp+" "+mx);

		 }
		 System.out.println(i+" "+prev);
		 if((i+1-prev)>mx) mx=(i+1-prev);
		 return mx;
	}
	public static void main(String[] args)throws IOException{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(bf.readLine());
		while(n-->0){
			String s=bf.readLine();
			System.out.println(getmaxdistinct(s));
		}
	}
}