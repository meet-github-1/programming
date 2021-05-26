
/*As a part of this she has given set of numbers, and asked the students 
to find the minimum number between indices S1 and S2 (S1<=S2), inclusive.

Now it’s your task to implement the Solution class:

	segmentTree(int[] nums, int n):
	-------------------------------
	    - build the Segment tree with the integer array nums[].
	    - n is size of the array.
	    
	int findMinimum(int n, int S1, int S2):
	---------------------------------------
	    - n is size of the array.
	    - S1, S2 are indices
	    
	Returns the minimum value in the subarray nums[S1, S2] 
	(i.e., nums[S1] + nums[S1 + 1], ..., nums[S2] ).


Input Format:
-------------
Line-1: An integer n, size of the array nums[] (set of numbers).
		where 1<= n <= 50000
Line-2: Two integers S1 and S2, index positions 
		where 0 <= S1 <= S2 < n
		and 1<= nums[i] <= 99999.

Output Format:
--------------
An integer, sum of integers between indices(s1, s2).


Sample Input-1:
---------------
10
2 9

Sample Output-1:
----------------
10208

NOTE: First 10 values of the input are: 
66905 11444 18252 54299 10208 59466 17861 24128 31974 69081
*/
import java.util.*;

class Segmenttree 
{
    int sgtree[];
    void build(int nums[],int ind,int st,int ed){
        if(st==ed){
            sgtree[ind]=nums[st];
        }
        else{
            int mid=(st+ed)/2;
            build(nums,ind*2,st,mid);
            build(nums,ind*2+1,mid+1,ed);
            sgtree[ind]=Math.min(sgtree[ind*2],sgtree[ind*2+1]);
        }
        
    }
	void segmentTree(int nums[], int n) 
	{ 
	    sgtree=new int[(4*n)+1];
	    build(nums,1,0,n-1);
	    
	} 
	int getmin(int ind,int st,int ed,int s1,int s2){
	    if(s1>s2){
	        return Integer.MAX_VALUE;
	    }
	    else if(st==s1 && ed==s2){
	        return(sgtree[ind]);
	    }
	    else{
	        int mid=(st+ed)/2;
	        return(Math.min(getmin(ind*2,st,mid,s1,Math.min(s2,mid)),getmin(ind*2+1,mid+1,ed,Math.max(s1,mid+1),s2)));
	    }
	}
	int findMinimum(int n, int s1, int s2) 
	{ 
	    return(getmin(1,0,n-1,s1,s2));
	} 

}
