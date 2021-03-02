// Sort Array By Parity II
/*
 * Given an array A of non-negative integers, half of the integers in A are odd, and half of the integers are even.
Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.
You may return any answer array that satisfies this condition.
 
Example 1:
Input: [4,2,5,7]
Output: [4,5,2,7]
Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
 Link: https://leetcode.com/problems/sort-array-by-parity-ii/
 */
public class sortbyparity {
	static int[] sort(int[] arr)
	{
		int j=0;
		for(int i=0; i<arr.length;i++)
		{
			if(i%2 == 0 && arr[i]%2 == 0)
				continue;
			else if(i%2 != 0 && arr[i]%2 != 0)
				continue;
			else if(i%2 ==0 && arr[i]%2 !=0)
			{
				j=i+1;
				while(arr[j]%2 != 0)
				{
					j++;
				}				
				int temp = arr[j];
				arr[j]=arr[i];
				arr[i]=temp;				
			}
			else if(i%2 !=0 && arr[i]%2 == 0)
			{
				j=i+1;
				while(arr[j]%2 == 0)
				{
					j++;
				}
				int temp = arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		return arr;
	}
	public static void main(String[] args)
	{
		int[] arr = {4,2,5,7};
		int[] res = sort(arr);
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
	}
}
