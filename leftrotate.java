// Quickly find multiple left rotations of an array | Set 1
/* Efficient Approach:
The above approaches work well when there is single rotation required. The approaches also modify the original array. To handle multiple queries of array rotation, we use a temp array of size 2n and quickly handle rotations.

Step 1 : Copy the entire array two times in temp[0..2n-1] array.
Step 2 : Starting position of array after k rotations in temp[] will be k % n. We do k
Step 3 : Print temp[] array from k % n to k % n + n.
Note that the task to find starting address of rotation takes O(1) time. It is printing the elements that takes O(n) time.
*/

import java.util.*;

class leftrotate
{
	static void beforerotate(int[] arr, int n, int[] temp)
	{
		for(int i = 0; i<n; i++)
		{
			temp[i] = arr[i];
			temp[i+n] = arr[i];
		}
	}
	static void leftrotate(int[] temp, int n, int key)
	{
		int start = key%n;
		for(int i=start; i<start+n; i++)
			System.out.print(temp[i]+" ");
	}

	public static void main(String[] args)
	{
		int arr[] = {1, 3, 5, 7, 9};
		int key = 4;
		int n = arr.length;
		int[] temp = new int[2*n];
		beforerotate(arr,n,temp);
		leftrotate(temp,n,key);
	}
}