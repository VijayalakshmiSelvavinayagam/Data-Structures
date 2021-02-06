/*
 * Given an initial array arr, every day you produce a new array using the array of the previous day.
On the i-th day, you do the following operations on the array of day i-1 to produce the array of day i:
If an element is smaller than both its left neighbor and its right neighbor, then this element is incremented.
If an element is bigger than both its left neighbor and its right neighbor, then this element is decremented.
The first and last elements never change.
After some days, the array does not change. Return that final array.
 */
class array_transformation
{
	static void transform(int[] arr)
	{
		for(int i=1; i<arr.length-1; i++)
		{
			for(int k=1; k<arr.length-1; k++)
			{
				if(arr[k] < arr[k-1] && arr[k]<arr[k+1])
				arr[k]=arr[k]+1;
				else if(arr[k]>arr[k-1] && arr[k]>arr[k+1])
				arr[k]=arr[k]-1;
			}
			System.out.print("Day "+i+":");
			for(int j=0; j<arr.length; j++)
				System.out.print(arr[j]+" ");
			System.out.println();
		}		
	}
	public static void main(String[] args)
	{
		int[] arr = {1,6,3,4,3,5};
		transform(arr);
	}
}
