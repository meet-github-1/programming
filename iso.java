import java.util.*;
class iso{
	static boolean fun(Map<Character,Character> map,Character k,Character r){
		int flag=0;
		Character prev='$';
		//System.out.println(map.isEmpty());
		if(!map.isEmpty()){
		for(Map.Entry<Character,Character> entry:map.entrySet()){
			Character key=entry.getKey();
			Character v=map.get(key);
			if(v.equals(r)){
				prev=key;
				flag=1;
				break;
			}

		}
		if(flag==0){
			return true;
		}
		else{
			if(prev.equals(k)){
			return true;
			}
			else{
				//System.out.println(prev+" "+k);
			return false;
		}
		}
		
	}
	else{
		return true;
	}
	}
 public static void main(String[] args){
     Scanner in=new Scanner(System.in);
	 String s1=in.next();
	 String s2=in.next();
	 int flag1=0;
	 Map<Character,Character> map=new HashMap<Character,Character>();
	 for(int i=0;i<s1.length();i=i+1){
		 Character c1=s1.charAt(i);
		 Character c2=s2.charAt(i);
		 Character e=map.getOrDefault(c1,'#');
		 if((e.equals(c2) || e.equals('#')) && (fun(map,c1,c2))){
			 map.put(c1,c2);}
		else{
			//System.out.println(fun(map,c1,c2));
			//System.out.println(i+" "+c1+" "+c2);
			flag1=1;
			break;
		}

	 }
	 if(flag1==0){
		 System.out.println("yes");
	 }
	 else{
		 System.out.println("no");
	 }
 }
}
