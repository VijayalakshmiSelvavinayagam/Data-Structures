// Write a program to reverse an array or string
/*
 * 1) Initialize start and end indexes as start = 0, end = n-1 
2) Swap arr[start] with arr[end] 
3) Recursively call reverse for rest of the array.
Time Complexity is O(n)
 */
class reverse
{
	static void reverse(int[] arr, int start, int end)
	{
		int i = start;
		int j = end;
		if(i>=j)
			return;
		int temp=arr[j];
		arr[j]=arr[i];
		arr[i] = temp;
		reverse(arr,i+1,j-1);
	}
	static void print(int[] arr,int n)
	{
		for(int i=0; i<n; i++)
			System.out.print(arr[i]+" ");
	}
	public static void main(String[] args)
	{
		int[] arr={2,3,4,5};
		reverse(arr,0,arr.length-1);
		print(arr,arr.length);
	}
}