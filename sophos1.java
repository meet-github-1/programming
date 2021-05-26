import java.util.*;
import java.lang.*;
class sophos1{
	static long pos(List<Long> l1,List<Long> l2,int s1,int s2){
                       long sum=0,min;
                       while(s1!=s2){
                       	min=Collections.min(l1);
                       	sum=sum+min;
                       	l1.remove(min);
                       	s1=s1-1;
                       	s2=s2+1;


                       }
                       return sum;
	}
	static long neg(List<Long> l1,List<Long> l2,int s1,int s2){
		long sum=0,min;
                      while(s1!=s2){
                       	min=Collections.min(l2);
                       	sum=sum+min;
                       	l2.remove(min);
                       	s1=s1+1;
                       	s2=s2-1;


                       }
                       return sum;
	}
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		List<Long> l1=new ArrayList<Long>();
		List<Long> l2=new ArrayList<Long>();
		for(int i=0;i<n;i++){
			long var=in.nextLong();
			if(var>0){
				l1.add(var);
			}
			else{
				l2.add(Math.abs(var));
			}


		}
		long sum=0;
		int siz1=l1.size();
		int siz2=l2.size();
        if(siz1>siz2){
        	sum=pos(l1,l2,siz1,siz2);
        	System.out.println(sum);
        }
        else if(siz2>siz1){
        	sum=neg(l1,l2,siz1,siz2);
        	System.out.println(sum);

        }
        else{
        	System.out.println("0");
        }
		
	}
}