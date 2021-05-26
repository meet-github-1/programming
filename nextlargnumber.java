/*
You are given a list of digits( 0 to 9) digits[].
A number is formed using the given order of the list.
for example: given list is [1,3,2], then number is 132.

Find the next biggest number in the lexographic order using 
the same list of digits, by using the each digit in the list only once,
and print the digit list of such biggest number.

If such biggest number is not possible, 
print the smallest lexographic order of the digits.

Input Format:
-------------
Line-1 : An integer N, number of digits.
Line-2 : N space separated integers, list of digits.

Output Format:
--------------
Print an integer list.


Sample Input-1:
---------------
4
1 2 4 3

Sample Output-1:
----------------
[1, 3, 2, 4]


Sample Input-2:
---------------
4
4 3 2 1

Sample Output-2:
----------------
[1, 2, 3, 4]
*/
import java.util.*;
import java.lang.*;
class nextlargnumber{
    static int ifsorted(int arr[],int n){
        int rs=0;
        for(int i=1;i<n;i++){
            if(arr[i-1]<arr[i] && rs!=1){
                rs=-1;
            }
            else if(arr[i-1]>arr[i] && rs!=-1){
                rs=1;
            }
            else{
                rs=0;
                break;
            }
        }
        return rs;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int rs=ifsorted(arr,n);
        if(rs==-1){
            int temp=arr[n-1];
            arr[n-1]=arr[n-2];
            arr[n-2]=temp;
            System.out.println(Arrays.toString(arr));
        }
        else if(rs==1){
            for(int i=0;i<n/2;i++){
                int temp=arr[i];
                arr[i]=arr[n-i-1];
                arr[n-i-1]=temp;
            }
            System.out.println(Arrays.toString(arr));
        }
        else{
            int pos=0;
            for(int i=n-1;i>0;i--){
                if(arr[i]>arr[i-1]){
                    pos=i;
                    break;
                }
            }
            int nextsmallest=Integer.MAX_VALUE;
            int pos1=0;
            for(int i=pos;i<n;i++){
                if(arr[i]>arr[pos-1] && arr[i]<nextsmallest){
                    nextsmallest=arr[i];
                    pos1=i;//p
                }
            }
            System.out.println(Arrays.toString(arr));
            System.out.println(arr[pos-1]+" "+arr[pos1]);
            int temp=arr[pos-1];
            arr[pos-1]=arr[pos1];
            arr[pos1]=temp;
            System.out.println(Arrays.toString(arr));
            int tmp[]=new int[n-pos];
            int j=0;
            for(int i=pos;i<n;i++){
                tmp[j]=arr[i];
                j++;
            }
            Arrays.sort(tmp);
            System.out.println(Arrays.toString(tmp));
            j=0;//p
            for(int i=pos;i<n;i++){
                arr[i]=tmp[j];
                j++;
            }
        System.out.println(Arrays.toString(arr));
        }
       
    }
}