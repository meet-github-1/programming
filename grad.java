/*
A graduate at University of China (UoC) has to follow certain rules. The rules are as follows:

UoC offering K subjects, the subjects are indexed from 0 to K-1.
Some subjets have to follow the conditions, like condition[i]= [Xi, Yi] which specifies you must
take the subject Yi before the subject Xi.

You are given total number of subjects and a list of the condition pairs.
Return the ordering of subjects that a graduate should take to finish all subjects.
	- the result set should follow the given order of conditions.
	- If it is impossible to complete all subjects, return an empty set.

Input Format:
-------------
Line-1: An integer K, number of subjects.
Line-2: An integer C, number of conditions.
Next C lines: Two space separated integers, Xi and Yi.

Output Format:
--------------
Return a list of integers, the ordering of subjects that a graduate should take to finish all subjects


Sample Input-1:
---------------
4
3
1 2
3 0
0 1

Sample Output-1:
----------------
[2, 1, 0, 3]

Explanation-1:
--------------
There are a total of 4 courses to take. 
Subject 1  should be taken after you finished subject 2.
Subject 3  should be taken after you finished subject 0.
Subject 0  should be taken after you finished subject 1.
So the correct subject order is [2, 1, 0, 3].

Sample Input-2:
---------------
5
5
0 1
1 2
2 3
3 4
4 0

Sample Output-2:
----------------
[]

Explanation-2:
-------------
No subject can be completed because they depend on each other.
*/
import java.util.*;
import java.lang.*;
class grad{
    static int arr[][];
    static List<Integer> getcourses(List<HashSet<Integer>> l,int n){
        if(n==1){
            return Collections.singletonList(0);
        }
        else{
            List<Integer> l1=new ArrayList<Integer>();
            List<Integer> l2=new ArrayList<Integer>();
            for(int i=0;i<n;i++){
                if(l.get(i).size()==0){
                    l1.add(i);
                    l2.add(i);
                }
            }
            //pSystem.out.println(l1);
            boolean flag=true;
            List<Integer> l3;
            while(flag){
                flag=false;
                l3=new ArrayList<Integer>();
                for(int i:l2){
                    for(int j=0;j<n;j++){
                        if(arr[j][i]==1){
                            arr[j][i]=0;
                            l.get(j).remove(i);
                            if(l.get(j).size()==0){
                                l3.add(j);
                                l1.add(j);
                                flag=true;
                            }
                        }
                    }
                }
                l2=l3;
                
            }
            return l1;
        }
        
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int p=in.nextInt();
        arr=new int[n][n];
        List<HashSet<Integer>> l=new ArrayList<HashSet<Integer>>();
        for(int i=0;i<n;i++){
            l.add(new HashSet<Integer>());
        }
        int st,ed;
        for(int i=0;i<p;i++){
            st=in.nextInt();
            ed=in.nextInt();
            l.get(st).add(ed);
            arr[st][ed]=1;
        }
        List<Integer> l2=getcourses(l,n);
        System.out.println(l2);
    }
}