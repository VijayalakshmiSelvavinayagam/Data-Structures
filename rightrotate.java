class rightrotate
{
	static void print(int[] arr,int n)
	{
		for(int i=0; i<n; i++)
			System.out.print(arr[i]+" ");
	}
	static void reverse(int[] arr, int start, int end)
	{
		int temp = 0;
		while(start<end)
		{
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;	
		}
	}
	static void rightrotate(int[] arr, int n, int key)
	{
		reverse(arr,0,n-1);
		reverse(arr,0,key-1);
		reverse(arr,key,n-1);
	}
	public static void main(String[] args)
	{
		int[] arr={121, 232, 33, 43 ,5};
		int n=arr.length;
		int key = 6;
		rightrotate(arr,n,key%n);
		print(arr,n);
	}
}