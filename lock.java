/*
Major Ajay Krishna and Prasad garu are working on a military operation at 
Himachal Pradesh. They are given an operation to defuse the bomb, and they have 
time falling short.

Their informer will provide them with a round-shape lock of length ‘L’, 
where L number of integers on the lock and a clue ‘C’.

To defuse the bomb they have to restore the original state of the lock, 
by restoring every integer on lock. All the integers must be restored in the 
same way based on the clue.

Its your task to help Major Ajay Krishna, to restore the original code on the lock, 
to defuse the bomb.

To restore the lock to its original state, you have to follow these instructions:
    - If C > 0, restore every i-th number with the sum of the next C integers.
    - If C < 0, restore every i-th number with the sum of the previous C integers.
    - If C == 0, restore every i-th number with 0.
    
As the lock is in round shpae, the next element of lock[n-1] is lock[0], 
and the previous element of lock[0] is lock[n-1].


Input Format:
-------------
Line-1: Two space separated integers L, C.
Line-2: L space separated integers, integers on the Lock.

Output Format:
--------------
Print the original state of the lock.


Sample Input-1:
---------------
5 2
2 5 9 4 7

Sample Output-1:
----------------
[14, 13, 11, 9, 7]


Sample Input-2:
---------------
5 0
1 5 6 3 2

Sample Output-2:
----------------
[0, 0, 0, 0, 0]
*/
import java.util.*;
import java.lang.*;
class lock{
    static int[] getcsum(int arr[],int c,int n){
        int arr1[]=new int[n];
        int csum[]=new int[n*2];
        int sum=0;
        for(int i=0;i<n*2;i++){
            sum=sum+arr[i%n];
            csum[i]=sum;
        }
        for(int i=0;i<n;i++){
            arr1[i]=csum[i+c]-csum[i];
        }
        return arr1;
    }
    static int[] getmcsum(int arr[],int c,int n){
        int arr1[]=new int[n];
        int csum[]=new int[n*2];
        int sum=0;
        for(int i=n*2-1;i>=0;i--){
            int ip=i-n;
            if(i-n<0){
                ip=n-Math.abs(ip);
            }
            sum=sum+arr[ip];
            csum[i]=sum;
        }
        //System.out.println(Arrays.toString(csum));
        for(int i=0;i<n;i++){
            arr1[i]=csum[n+i-Math.abs(c)]-csum[n+i];
        }
        return arr1;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int c=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        if(c>0){
            System.out.println(Arrays.toString(getcsum(arr,c,n)));
        }
        else if(c<0){
            System.out.println(Arrays.toString(getmcsum(arr,c,n)));
        }
        else{
            int arr1[]=new int[n];
            System.out.println(Arrays.toString(arr1));
        }
    }
}