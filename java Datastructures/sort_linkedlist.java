
// sorting linked list
class sorting
{
	node first;
	node last;
	node first_preserve = first;
	class node 
	{
		node next;
		int data;
	}
 public void insert(int data)
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
 
 public void sorting_method()
 {
	 	
	node temp = null;
	node head = first;
	node next = first.next;
	while(head.next!=null){
	
	if(head.data > next.data)
	{
		temp = next;
		head.next = temp.next;
		temp.next = head;
	}
next = head;
head = temp;
	
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
 
}
public class sort_linkedlist {
public static void main(String[] args)
{
	sorting sr = new sorting();
	sr.insert(4);
	sr.insert(1);
	sr.insert(2);
	sr.insert(5);
	sr.sorting_method();
	sr.print();
}
	
}
