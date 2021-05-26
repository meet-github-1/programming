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
	public int compareTo(Emp e) {
		return ename.compareTo(e.ename);
	}
}
class EmpComparator implements Comparator<Emp>{
		public int compare(Emp e1,Emp e2) {
			return ((int)(e2.empsal-e1.empsal));
			
		}
	}