/*
Singly Linked List
class ListNode{
    // Members of the class are:
    int val;    // station number
    ListNode next;  // next station
}

*/
import java.util.*;
class mergelist implements Comparator<ListNode>{
    public int compare(ListNode a,ListNode b){
        return a.val-b.val;
    }
	public ListNode mergeKTracks(ListNode[] tracks) {
	    int len=tracks.length;
	    ListNode head=null;
	    ListNode temp=null;
	    PriorityQueue<ListNode> pq=new PriorityQueue<ListNode>(new Solution());
	    for(int i=0;i<len;i++){
	        pq.add(tracks[i]);
	    }
	    while(!pq.isEmpty()){
	         if(pq.peek().next!=null){
	           pq.add(pq.peek().next);
	         }
	        if(head==null){
	            head=pq.poll();
	            temp=head;
	        }
	        else{
	            temp.next=pq.peek();
	            temp=pq.poll();
	            
	        }
	    }
	    return head;
	}
}	
