package myproject;
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
			
		}
		void display() {
			for(student s=head;s!=null;s=s.next) {
				System.out.println(s.sno+" "+s.sname);
			}
		}
}
public class double{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the no of elements");
		int n=in.nextInt();
		int sno;
		String sname;
		for(int i=0;i<n;i++) {
			 sno=in.nextInt();
			 sname=in.next();
			 new student(sno,sname);
		}
		student sp=new student();
		System.out.println("1:delete"+" "+"2:display");
		int choice=in.nextInt();
		if(choice==1){
		System.out.println("enter student roll no to delete");
		int sno1=in.nextInt();
		sp.delete(sno1);
		sp.display();
	}
	else{
		sp.display();
	}
		

		
	}

}
