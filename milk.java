/*
Ramu is a milk supplier to Somu. He has only two aluminium cups of 
capacity m and n litres. Using these two cups only, he can measure the milk. 
He has to supply exactly P litres of milk to Somu.

To measure the milk, operations allowed are:
    - Fill one of the cups completely with milk.
    - Empty the other cup.
    - Pour milk from one cup into another cup till it fills completely,
     or the first cup itself is empty.
     
Such that, at the end one or both cups contains P litres of the milk.
    
Please help Ramu, to check whether P litres of milk can be measured
using the two cups or not.

Input Format:
-------------
3 space separated integers, m, n and P.

Output Format:
--------------
Print a boolean value.


Sample Input-1:
---------------
3 5 4

Sample Output-1:
----------------
true


Sample Input-2:
---------------
2 4 5

Sample Output-2:
----------------
false
*/
import java.util.*;
import java.lang.*;
class milk{
    static int gcd(int x,int y){
        if(x>y){
            return gcd(x-y,y);
        }
        else if(x<y){
            return gcd(x,y-x);
        }
        else{
            return x;
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int p=in.nextInt();
        if(n+m<p){
            System.out.println("false");
            System.exit(1);
        }
        int gd=gcd(n,m);
        if(p%gd==0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}