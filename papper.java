/*
You are given a phrase and a paper of size m*n.
So you can type exactly m * n characters on that paper.
i.e,. there are 'm' rows and in each row you can type 'n' characters
You need to type the phrase on the paper with some rules.

The rules are as follows:
    - A word in the phrase cannot be split into two lines.
    - The order of words in the phrase shuld not change.
    - Two consecutive words in a line must be separated by a single space.

Your task is to find out how many times the phrase can be typed on the paper.

constraint:
    Length of each word is <=10.

Input Format:
-------------
Line-1: Three space separated integers m, n, and s, grid size m*n, number of words.
Line-2: 's' space separated strings, set of words

Output Format:
--------------
Print an integer, no.of times set of words fit into the grid.


Sample Input-1:
---------------
2 8 2
socail distance

Sample Output-1:
----------------
1

Explanation:
------------
social__
distance


Sample Input-2:
---------------
3 6 3
a bc def

Sample Output-2:
----------------
2

Explanation:
------------
a_bc__
def_a_
bc_def
*/
import java.util.*;
import java.lang.*;
class paper{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        int s=in.nextInt();
        String arr[]=new String[s];
        for(int i=0;i<s;i++){
            arr[i]=in.next();
        }
        int count=0;
        int ind=0;
        while(m>0){
            int sp=n;
            while(sp>0){
              int len=arr[ind].length();
              //System.out.println(sp);
              if(sp>=len){
                sp=sp-len;
                if(sp>=1){
                    sp=sp-1;
                }
                if(ind==s-1){
                    count++;
                }
                ind=(ind+1)%s;
                }
            else{
                break;
            }
            }
            m--;
        }
        System.out.println(count);
    }
}