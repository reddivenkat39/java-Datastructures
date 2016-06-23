
// using an array find the resulting leaves

class leave_calculator
{
	int[] arr = new int[10];
	int[] leaves = new int[5];
	int i=0;
	int length;
	public void set_arr(int[] arra)
	{
		arr = arra;
		length = arr.length;
		leaves(0);
		
	}
	public void leaves(int initial)
	{
		if(initial<=length-1)
		{
		int root = initial+1;
		int left = root*2;
		int right = (root*2)+1;
		if(left>length && right>length)
		{
			leaves[i] = root-1;
			i++;
		}
		leaves(left-1);
		leaves(right-1);
		}
	}
}
public class binary_tree {

	public static void main(String[] args)
	{
		int[] arra = {1,2,3,4,5,6,7};
		
		leave_calculator lc = new leave_calculator();
		lc.set_arr(arra);
		int length = lc.i;
		int[] new_arr = new int[length];
		System.out.println(length+"??????????");
        new_arr = lc.leaves;
		for(int e: new_arr)
		{
			System.out.println(e);
		}
	}
}
