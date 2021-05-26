/*
UBER driver has a vehicle, daily he used go in only one direction.
Capacity of the vehicle is S (no of seats except driver seat), 

Given a list of N bookings, booking[i]= [ num_customers, pickup, drop ].
booking indicates, number of customers to pick up, and pick up, droping points.

Initially the vehicle is empty.

Return true if and only if it is possible to pick up and drop off all customers 
of all bookings.

Input Format:
-------------
Line-1 -> Two integers N and S, number of bookings and number of seats in the vehicle.
Next N Lines -> three space separated integers, num_customers, pickup point, 
                dropping point

Output Format:
--------------
Print a boolean value.


Sample Input-1:
---------------
2 5
2 1 5
3 3 7

Sample Output-1:
----------------
true


Sample Input-2:
---------------
2 4
2 1 5
3 3 7

Sample Output-2:
----------------
false


Sample Input-3:
---------------
3 11
3 2 7
3 7 9
8 3 9

Sample Output-3:
----------------
true
*/
import java.util.*;
import java.lang.*;
class bookings{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int s=in.nextInt();
        int bk[][]=new int[n][3];
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            bk[i][0]=in.nextInt();
            bk[i][1]=in.nextInt();
            bk[i][2]=in.nextInt();
            if(bk[i][2]>mx){
                mx=bk[i][2];
            }
        }
        int arr[]=new int[mx+1];
        for(int ar[]:bk){
            arr[ar[1]]=arr[ar[1]]+ar[0];
            arr[ar[2]]=arr[ar[2]]-ar[0];
        }
        boolean flag=true;
        //System.out.println(Arrays.toString(arr));//r
        for(int i:arr){
            if(s<0){
                flag=false;
                break;
            }
            else{
                if(i>0){
                    s=s-i;
                }
                else{
                    s=s-i;
                }
            }
        }
        System.out.println(flag);
    }
}