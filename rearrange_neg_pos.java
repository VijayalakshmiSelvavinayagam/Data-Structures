// Rearrange array in alternating positive & negative items with O(1) extra space | Set 1
/*
 * Given an array of positive and negative numbers, arrange them in an alternate fashion such that every positive number is followed by negative and vice-versa maintaining the order of appearance. 
Number of positive and negative numbers need not be equal. If there are more positive numbers they appear at the end of the array. If there are more negative numbers, they too appear in the end of the array.

Examples : 

Input:  arr[] = {1, 2, 3, -4, -1, 4}
Output: arr[] = {-4, 1, -1, 2, 3, 4}

Input:  arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}
output: arr[] = {-5, 5, -2, 2, -8, 4, 7, 1, 8, 0} 

This question has been asked at many places (See this and this)
The above problem can be easily solved if O(n) extra space is allowed. It becomes interesting due to the limitations that O(1) extra space and order of appearances. 
The idea is to process array from left to right. While processing, find the first out of place element in the remaining unprocessed array. An element is out of place 
if it is negative and at odd index, or it is positive and at even index. Once we find an out of place element, we find the first element after it with opposite sign. We right rotate the subarray between these two elements (including these two).
Time Complexity is O(n2)

My Approach:
Step 1: Arrange with negative number and positive number
Step 2: If we found element is in last index then instead of swap, 
rotate from start index to last index in right direction

Link: https://www.geeksforgeeks.org/rearrange-array-alternating-positive-negative-items-o1-extra-space/
 */
public class rearrange_neg_pos {
	static void rightrotate(int[] arr, int start, int end)
	{
		int j;
		int temp = arr[end];
		for(j = end; j>start; j--)
			arr[j]=arr[j-1];
		arr[j]=temp;
	}
	static void rearrange(int[] arr)
	{
		int temp = 0;

		for(int i=0; i<arr.length-1;i++)
		{
			if((i+1)%2!=0)
			{
				if(arr[i]<0)
					continue;
				else
				{
					int j = i;
					while(arr[j]>=0 && j<arr.length-1)
					{
						if(arr[j+1]<0)
						{
							if(j+1==arr.length-1)
								rightrotate(arr,i,j+1);
							else
							{
							temp = arr[i];
							arr[i] = arr[j+1];
							arr[j+1]=temp;
							break;
							}
						}
						j++;
					}
				}
			}
			else if((i+1)%2==0)
			{
				if(arr[i]>=0)
					continue;
				else
				{
					int j=i;
					while(arr[j]<0 && j<arr.length-1)
					{
						if(arr[j+1]>=0)
						{
							if(j+1==arr.length-1)
								rightrotate(arr,i,j+1);
							else
							{
							temp = arr[i];
							arr[i] = arr[j+1];
							arr[j+1]=temp;
							break;
							}
						}
						j++;
					}
				}
			}			
		}
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
	}
	public static void main(String[] args)
	{
		int[] arr= {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
		rearrange(arr);
		
	}
}
