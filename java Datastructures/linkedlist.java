
public class linkedlist {

	public static class Node
	{
		Node Next;
		Integer data;
		
		private Node()
		{
		this.Next = null;
		}
	}
	
	public static class LinkedList
	{
		Node head;
		int linkcount = 0;
		public LinkedList()
		{
			head = new Node();
		}
		
		public void setNode(int value)
		{
			head.data = value;
			while(head.Next != null)
			{
				head = head.Next;
			}
			linkcount++;
		}
		
		public int getNode()
		{
			
			return head.data;
		}
	}
	public static void main(String[] args)
	{
		
		LinkedList l1 = new LinkedList();
		l1.setNode(20);
		l1.setNode(30);
		System.out.println(l1.getNode());
	}
}
