import java.util.*;
public class queue {
	public static void main(String[] args){
		Queue<String> s=new LinkedList<String>();
		s.offer("Abcd");
		s.offer("pqrs");
		while(!s.isEmpty()){
			System.out.println(s.poll());
		}

	}

}
