class bubblesort
{
	public void sort(int[] arr)
	{
		
		int temp;
		int i=0;
		boolean flag = true;
		
		while(flag&&i<(arr.length-1))
		{
			for(int j=0;j<(arr.length-1);j++)
			{
			if(arr[i]>arr[i+1])
			{
			temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		
			}
			}
		
		}
		for(int j=0;j<arr.length;j++)
		{
			System.out.println(arr[j]);
		}
	}
}
public class bubble_sort {
public static void main(String[] args)
{
	bubblesort bs = new bubblesort();
	int[] arra = new int[4];
	arra[0] = 6;
	arra[1] = 4;
	arra[2] = 1;
	arra[3] = 2;
	bs.sort(arra);
	
}
}
