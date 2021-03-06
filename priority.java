import java.util.*;
class Emp implements Comparable<Emp>{
	int empno;
	String ename;
	float empsal;
	Emp(int empno,String ename,float empsal){
		this.empno=empno;
		this.ename=ename;
		this.empsal=empsal;
	}
	public String toString() {
		return "empno= "+empno+" "+"empsal="+empsal+" "+"ename= "+ename;
	}
	public int compareTo(Emp e)//hashset doesnt implies on compare to but implies on equals
	{
		return e.ename.compareTo(ename);
	}
	@Override
	public boolean equals(Object o) {
		 if(o instanceof Emp) {
			 Emp e=((Emp)o);
			 if(ename.equals(e.ename)){
				 return true;
			 }
			 else {
				 return false;
			 }
			 
		 }
		 return false;
		
	}
	@Override
	public int hashCode() {
		return ename.length();
	}

}
class EmpComparator implements Comparator<Emp>{
		public int compare(Emp e1,Emp e2) {
			return ((int)(e2.empsal-e1.empsal));
			
		}
	}
class priority
{
	public static void main(String[] args){
		EmpComparator ec=new EmpComparator();
		PriorityQueue<Emp> pq=new PriorityQueue<Emp>(ec);
		Emp e1=new Emp(101,"gopal",5200);
		Emp e2=new Emp(102,"ramu",5209);
		Emp e3=new Emp(104,"sam",5202);
		pq.add(e1);
		pq.add(e2);
		pq.add(e3);
		System.out.println(pq.poll());
	}
}