//Given an array, find if there is a pair with a given sum
/* Let an array be {1, 4, 45, 6, 10, -8} and sum to find be 16
After sorting the array 
A = {-8, 1, 4, 6, 10, 45}
Now, increment ‘l’ when the sum of the pair is less than the required sum and decrement ‘r’ when the sum of the pair is more than the required sum. 
This is because when the sum is less than the required sum then to get the number which could increase the sum of pair, start moving from left to right(also sort the array) thus “l++” and vice versa.
Initialize l = 0, r = 5 
A[l] + A[r] ( -8 + 45) > 16 => decrement r. Now r = 4 
A[l] + A[r] ( -8 + 10) increment l. Now l = 1 
A[l] + A[r] ( 1 + 10) increment l. Now l = 2 
A[l] + A[r] ( 4 + 10) increment l. Now l = 3 
A[l] + A[r] ( 6 + 10) == 16 => Found candidates (return 1) */

import java.util.*;
class searchsumrandom
{
	static void search(int[] arr, int n, int sum)
	{
		int l=n-1;
		int s=0;
		int found = 0;
		while(1!=s)
		{
			if(arr[l]+arr[s]==sum)
			{
				System.out.println("Sum of 2 elements are: "+arr[l]+" "+arr[s]);
				found = 1;
			}
			if(arr[l]+arr[s]<sum)
			{
				if(s<n-1)
					s++;
				else
					s=0;
			}
			else
			{
				if(l>0)
					l--;
				else
					l=n-1;
			}
		}
		if(found == 0)
			System.out.println("No elements are found");
			
	}

	public static void main(String[] args)
	{
 		int[] arr={8,2,6,1,7};
 		int sum = 8;
		Arrays.sort(arr);
		search(arr,arr.length,sum);
	}
}