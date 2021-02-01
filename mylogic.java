// Find the Rotation Count in Rotated Sorted array
/*
 * Step 1: Find pivot value
 * Step 2: Find the difference by Last index - Pivot Value
 * Step 3: Find a count by Array Length - Difference
 */
import java.util.*;

class mylogic
{
	static void findrotationcounts(int[] arr, int n)
	{
		int pivot=0;
		int rotatedarray = 0;
		int count = 0;
		for(int i=0; i<n-1; i++)
		{
			if(arr[i]>arr[i+1])
			{
				pivot = i;
				rotatedarray = 1;
			}
		}
		if (rotatedarray == 1)
		{
			int diff = (n-1)-pivot;
			count = n-diff;
			System.out.println("Rotation Count is "+count);
		}
		else
			System.out.println("Rotation count is "+count);
		
	}
	public static void main(String[] args)
	{
		int[] arr={7, 9, 11, 12, 5};
		findrotationcounts(arr,arr.length);
	}
}