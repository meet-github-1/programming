import java.util.*;
import java.lang.*;
import java.io.*;
class findpowersum{
    static int s;
    static int count=0;
    static void powersum(int range,int ind,int pow,int rsum){
        //System.out.println(rsum);
        if(rsum==s){
            count++;
            return ;
            }
        else{
            for(int i=ind;i<=range;i++){
                if((int)Math.pow(i,pow)<=s){
                    powersum(range,i+1,pow,rsum+(int)Math.pow(i,pow));
                }
            }
            return;
        }
    }
	public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	s=in.nextInt();
	int x=in.nextInt();
	int s1=(int)Math.sqrt(s);
	powersum(s1,1,x,0);
	System.out.println(count);
	
	}
}