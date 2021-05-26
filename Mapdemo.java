import java.util.Scanner;
import java.util.*;
class Mapdemo{
	public static void main(String[] args){
		Map<String,Integer> map=new TreeMap<String,Integer>();
		for(String e:args){
			int v=map.getOrDefault(e,0);
			map.put(e,v+1);
		}
		System.out.println(map);
	}
}



