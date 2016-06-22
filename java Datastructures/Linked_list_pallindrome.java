
class linkedlist12
{
	node first;
	node last;
	class node 
	{
		node next;
		char data;
	}
 public void insert(char data)
	{
		node temp = null;
	    temp = last;
	    last = new node();
	    last.data = data;
	    last.next = null;
	    if(first == null)
	    {
	    	first = last;
	    }
	    else
	    {
	    	temp.next = last;
	    }
	}
 
 public void print()
 {
	 node temp = first;
	 while(temp!= null)
	 {
		 System.out.println(temp.data);
		 temp = temp.next;
	 }
 }
 
 public void reverseoflist()
 {
	 node temp = first;
	 node previous = null;
	node  next = null;
	 while(temp!= null)
	 {
		 next = temp.next;
		temp.next = previous;
		previous = temp;
		temp = next;
	 }
	 this.first = previous;
 }
}
public class Linked_list_pallindrome {
	public static void main(String[] args)
	{
		linkedlist12 ls = new linkedlist12();
			ls.insert('c');
		ls.insert('b');
		ls.insert('b');
		ls.insert('b');
		ls.insert('b');
		ls.insert('b');
		ls.insert('b');
		//ls.print();
		ls.reverseoflist();
		ls.print();
		ls.reverseoflist();
		ls.print();
	}
}
