import java.util.*;
import java.lang.*;
import java.io.*;
class student{
	int sno;
	String sname;
	student next;
	student prev;
	static student head=null;
	static student tail=null;
	student(){
		
	}
	student(int sno,String sname){
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
				student del=head;
				head=head.next;
				del=null;
			}
			student temp=head;
			temp=temp.next;
			while(temp.next!=null) {
				if(temp.sno==sno) {
					student del=temp;
					del.prev.next=temp.next;
					temp.next.prev=del.prev;
					temp=null;
					break;
				}
				temp=temp.next;
			}
			if(tail.sno==sno) {
				student del1=tail;
				tail=tail.prev;
				tail.next=null;
				del1=null;
			}
			display();
			
		}
		void display() {
			for(student temp=head;temp!=null;temp=temp.next) {
				System.out.println(temp.sno+" "+temp.sname);
			}
		}
		
	
}
public class doublylinkedlist {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the no of elements");
		int n=in.nextInt();
		int sno;
		String sname;
		System.out.println("enter student details");
		for(int i=0;i<n;i++) {
			 sno=in.nextInt();
			 sname=in.next();
			 new student(sno,sname);
		}
		student s1=new student();
		System.out.println("1:delete"+" "+"2:display");
		int choice=in.nextInt();
		if(choice==1) {
		System.out.println("enter student roll no to delete");
		int sno1=in.nextInt();
		s1.delete(sno1);
		s1.display();
		}
		else {
			s1.display();
		}
		

		
	}

}
