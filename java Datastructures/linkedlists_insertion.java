class insertion
{
	class node
	{
		node next;
		int data;
	}
	
	node first;
	node last;
	int length =0;
	public void add(int data)
	{
		node temp = new node();
		temp.data = data;
		if(first == null)
		{
			first = temp;
			last = first;
		}
		else
		{
			last.next = temp;
			last = temp;
		}
		
		length++;
	}
	
	public void insert(int index,int data)
	{
		int i= 0;
		node temp = new node();
		temp = first;
		node holder = new node();
		holder.data = data;
		while(index-1 != i)
		{
			i++;
			temp = temp.next;
		}
		holder.next = temp.next;
		temp.next = holder;
		length++;
		}
	
	public void print()
	{
		node temp = first;
		
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}

public class linkedlists_insertion {

	public static void main(String[] args)
	{
		insertion ls = new insertion();
		ls.add(1);
		ls.add(2);
		ls.add(4);
		ls.add(6);
		ls.add(8);
		ls.add(10);
		
		ls.insert(3, 12);
		ls.print();
	}
}
