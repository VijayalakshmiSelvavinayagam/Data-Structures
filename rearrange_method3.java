// Rearrange an array such that arr[i] = i
/*
 * Another Approach (Swap elements in Array) : 
1) Iterate through elements in an array 
2) If arr[i] >= 0 && arr[i] != i, put arr[i] at i ( swap arr[i] with arr[arr[i]])
Time Complexity is O(n)
 */
class rearrange_method3
{
	static void arrange(int[] arr, int n)
	{
		int temp;
		for(int i=0; i<n;)
		{
			if(arr[i]!=-1 && arr[i] !=i)
			{
				temp = arr[arr[i]];
				arr[arr[i]] = arr[i];
				arr[i] = temp;
			}
			else
			{
				i++;
			}
		}
	}
	static void print(int[] arr, int n)
	{
		for(int i=0; i<n; i++)
			System.out.print(arr[i]+" ");
	}
	public static void main(String[] args)
	{
		int[] arr = {4,-1,3,-1,2};
		arrange(arr, arr.length);
		print(arr, arr.length);
	}
}
