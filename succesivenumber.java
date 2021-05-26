import java.util.*;
import java.lang.*;
import java.io.*;
class succesivenumber{
    static boolean issuccesive(int n){
        if(n<=9)
            return true;
        int d1 = n%10;
        n /= 10;
        int d2;
        while(n>0)
        {
            d2 = n%10;
            n/=10;
            //System.out.println(d1+" "+d2+" "+n);
            if(d1-d2 != 1)
                return false;
            d1 = d2;
        }
        return true;
    }
	public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	int lw=in.nextInt();
	int hg=in.nextInt();
	List<Integer> l=new ArrayList<Integer>();
	while(lw<=hg){
	    if(issuccesive(lw)){
	        l.add(lw);
	    }
	    lw++;
	}
	System.out.println(l);
	
	}
}