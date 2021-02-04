// Move all zeroes to end of array
/*
 * Given an array of random numbers, Push all the zero’s of a given array to the end of the array. For example, if the given arrays is {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0}, it should be changed to {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}. The order of all other elements should be same. Expected time complexity is O(n) and extra space is O(1).

Example:

Input :  arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
Output : arr[] = {1, 2, 4, 3, 5, 0, 0};

Input : arr[]  = {1, 2, 0, 0, 0, 3, 6};
Output : arr[] = {1, 2, 3, 6, 0, 0, 0};
Link: https://www.geeksforgeeks.org/move-zeroes-end-array/
 */

class movezeros
{
	static void movezerosfn(int[] arr, int n)
	{	
		/*int i=0;
		int j;
		for(i=0;i<arr.length-1;i++)
		{
			if(arr[i]==0)
			{
			for(j=i+1; j<arr.length; j++)
			{
				if(arr[j]!=0) 
				{
					arr[i]=arr[j];
					arr[j]=0;
					break;
				}
			}
			}
		}*/
		
		int i = 0;
		int count = 0;
		for(i=0; i<arr.length; i++)
		{
			if(arr[i]!=0)
			{
				arr[count]=arr[i];
				count++;
			}
		}
		while(count<arr.length)
		{
			arr[count]=0;
			count++;
		}
	}
	public static void main(String[] args)
	{
		int[] arr={1, 2, 0, 0, 0, 3, 6};
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		movezerosfn(arr, arr.length);
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
	}
}