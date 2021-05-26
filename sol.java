import java.util.*;
class sol{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<n;i++){
			String s=in.next();
			Map<Character,Integer> mp=new HashMap<Character,Integer>();
		    int count=0;
        for(int j=0;j<s.length();j++){
             if(mp.getOrDefault(s.charAt(j),0)==0){
             	count=count+1;
             	mp.put(s.charAt(j),1);

             }
             else{
             	count=count+5;
             }
        }
        System.out.println(count);
    }
	}
}