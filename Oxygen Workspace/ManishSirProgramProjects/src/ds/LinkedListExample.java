package ds;

public class LinkedListExample {
	int data;
	LinkedListExample next=null;
	public LinkedListExample addBeg(LinkedListExample head,int data){
		if(head == null) {
			LinkedListExample ob =new LinkedListExample();
			ob.data=data;
			ob.next=null;
			head=ob;
		}
		else {
			LinkedListExample ob =new LinkedListExample();
			ob.data=data;
			ob.next=head;
			head=ob;
		}
		return head;
	}
	public LinkedListExample addEnd(LinkedListExample head,int data){
		if(head == null) {
			LinkedListExample ob =new LinkedListExample();
			ob.data=data;
			ob.next=null;
			head=ob;
		}
		else {
			LinkedListExample current=head;
			while(current.next != null) {
				current=current.next;
			}
			LinkedListExample ob =new LinkedListExample();
			ob.data=data;
			ob.next=null;
			current.next=ob;
			current=ob;
		}
		return head;
	}
	public static void main(String strs[]) {
		LinkedListExample head=null,current=null;
		head=new LinkedListExample().addBeg(head,2);
		head=new LinkedListExample().addBeg(head,3);
		head=new LinkedListExample().addBeg(head,4);
		head=new LinkedListExample().addBeg(head,5);
		head=new LinkedListExample().addBeg(head,6);
		head=new LinkedListExample().addEnd(head,7);
		head=new LinkedListExample().addEnd(head,8);
		head=new LinkedListExample().addEnd(head,9);
		head=new LinkedListExample().addEnd(head,10);
		current=head;
		while(current != null)
		{
			System.out.print(current.data+"->");
			current=current.next;
		}
	}
}
