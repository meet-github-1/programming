/*
Balbir singh is working with Binary Trees.
The elements of the tree is given in the level order format.
Balbir has a task to split the tree into two parts by removing only one edge
in the tree in such way that the sum of elements in both the trees should be equal.

You will be given the root of the binary tree.
Your task is to help the Balbir singh to split the binary tree as specified.
print true, if it is possible, otheriwse print false.

Your task is to implement the class Solution:
	- public boolean checkEqualTree(BinaryTreeNode root):
	return the boolean value.
	
NOTE: 
Please do consider the node with data as '-1' as null in the given trees.

Input Format:
-------------
Space separated integers, elements of the tree.

Output Format:
--------------
Print a boolean value.


Sample Input-1:
---------------
1 2 3 5 -1 -1 5

Sample Output-1:
----------------
true


Sample Input-2:
---------------
3 2 4 3 2 -1 7

Sample Output-2:
----------------
false

NOTE: Look at hint for explanation.
*/
import java.util.*;

/*
    //Structure of BinaryTreeNode for your reference.

    class BinaryTreeNode{
    	public int data; 
    	public BinaryTreeNode left, right; 
    	public BinaryTreeNode(int data){
    		this.data = data; 
    		left = null; 
    		right = null; 
    	}
    }
*/

class tree2equal{
    static int getsum(BinaryTreeNode root,Map<Integer,Integer> mp){
        if(root==null || root.data==-1){
            return 0;
        }
        else{
            int sum=getsum(root.left,mp)+getsum(root.right,mp)+root.data;
            //System.out.println(root.data+" "+sum);
            mp.put(sum,mp.getOrDefault(sum,0)+1);
            return sum;
        }
    }
    public boolean checkEqualTree(BinaryTreeNode root) {
        Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
        int tsum=getsum(root,mp);
        //System.out.println(tsum);
        if(tsum==0){
            return mp.getOrDefault(tsum,0)>1;
        }
        else{
            if(tsum%2==0){
                return mp.getOrDefault(tsum/2,0)>0;
            }
            else{
                return false;
            }
        }
    }
}

