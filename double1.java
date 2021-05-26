package myproject;
import java.util.*;
import java.lang.*;
import java.io.*;
class studlist{
	int sno;
	String sname;
	studlist next;
	studlist prev;
	static studlist head=null;
	static studlist tail=null;
	studlist(){
		
	}
	studlist(int sno,String sname){
		this.sno=sno;
		this.sname=sname;
		this.next=null;
		this.prev=null;
		if(head==null) {
			head=this;
			tail=this;
		}
		else {
			tail.next=this;
			this.prev=tail;
			tail=this;
		}
	}
		void delete(int sno) {
			if(head.sno==sno) {
				studlist del=head;
				head=head.next;
				del=null;
			}
			studlist temp=head;
			temp=temp.next;
			while(temp.next!=null) {
				if(temp.sno==sno) {
					studlist del=temp;
					del.prev.next=temp.next;
					temp.next.prev=del.prev;
					temp=null;
					break;
				}
				temp=temp.next;
			}
			if(tail.sno==sno) {
				studlist del1=tail;
				tail=tail.prev;
				tail.next=null;
				del1=null;
			}
			display();
			
		}
		void display() {
			for(studlist s=head;s!=null;s=s.next) {
				System.out.println(s.sno+" "+s.sname);
			}
		}
		
	
}
public class double1{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the no of elements");
		int n=in.nextInt();
		int sno;
		String sname;
		for(int i=0;i<n;i++) {
			 sno=in.nextInt();
			 sname=in.next();
			 new studlist(sno,sname);
		}
		studlist sp=new studlist();
		System.out.println("enter student roll no to delete");
		int sno1=in.nextInt();
		sp.delete(sno1);
		sp.display();
		

		
	}

}
