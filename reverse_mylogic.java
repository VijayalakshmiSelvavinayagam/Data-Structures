// Write a program to reverse an array or string
/*
 * Swap 2 element starts from last with first, last-1 with first+1 and so on
 * 1) Initialize start and end indexes as i = 0, j = n-1 
2) In a loop, swap arr[i] with arr[j] and change start and end as follows : 
i = i +1, j = j – 1
 */

class reverse_mylogic
{
	static void reverse(int[] arr, int n)
	{
		int i = 0;
		int j = n-1;
		while(i!=j)
		{
			int temp=arr[j];
			arr[j]=arr[i];
			arr[i] = temp;
			i++;
			j--;
		}
	}
	static void print(int[] arr,int n)
	{
		for(int i=0; i<n; i++)
			System.out.print(arr[i]+" ");
	}
	public static void main(String[] args)
	{
		int[] arr={1,2,3,4,5};
		reverse(arr,arr.length);
		print(arr,arr.length);
	}
}