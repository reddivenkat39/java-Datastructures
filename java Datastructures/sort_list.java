

public class sort_list {

	class node
	{
		node next;
		int data;
	}
	node first;
	node last;
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
 
	public void sort()
	{
	   node temp = first;
	   node next = first.next;
	   node holder = null;
		while(temp.next!= null)
		{
			if(temp.data > next.data)
			{
			temp.next = next.next;
			next.next = temp;
			holder = next;
			next = temp;
			temp = holder;
			}
			temp = next;
			next = next.next;
			if(temp.data < first.data)
			{
				temp = first;
				next = temp.next;
				
			}
			
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
	 
	 public static void main(String[] args)
	 {
		 sort_list sr = new sort_list();
			sr.insert(3);
			sr.insert(4);
			sr.insert(2);
			sr.insert(6);
			sr.insert(1);
			sr.insert(5);
			sr.print();
			System.out.println("////////////");
			sr.sort();
			sr.print();
	 }
}


