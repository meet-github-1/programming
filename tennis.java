/*KMIT hosting a Keshav Memorial Badminton League. 
They planned to conduct N number of games. Each game begin and ends in perticular time slot.

You are given an array of time slots of the N games, consisting of
begin and end times (b1,e1),(b2,e2),... (b < e ).
Your task is to determine minimum number of badminton courts required 
to conduct all the games smoothly.

NOTE: If a game begins at time 'a' ends at time 'b', 
another game can start at 'b'.

Input Format:
-------------
Line-1: An integer N, number of games.
Next N lines: Two space separated integers, begin and end time of each game.

Output Format:
--------------
Print an integer, minimum number of badminton courts required.


Sample Input-1:
---------------
3
0 30
5 10
15 20

Sample Output-1:
----------------
2

Sample Input-2:
---------------
3
0 10
15 25
25 35

Sample Output-2:
----------------
1

*/
import java.util.*;
import java.lang.*;
/*class index{
    int x;
    int y;
    index(int x,int y){
        this.x=x;
        this.y=y;
    }
}*/
class tennis{
    /*public int compare(index i1,index i2){
        if(i1.x==i2.x){
            return (i1.y-i2.y);
        }
        return (i1.x-i2.x);
    }*/
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        //List<index> l=new ArrayList<index>();
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=in.nextInt();
            arr2[i]=in.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int l=0;
        int r=0;
        int mxcrt=0;
        while(l<n && r<n){
            if(arr1[l]<arr2[r]){
                mxcrt++;
                l++;
            }
            else{
                r++;
                l++;
            }
        }
        System.out.println(mxcrt);
    }
}