// Relative Sort Array
/*
 * Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.

Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2.  Elements that don't appear in arr2 should be placed at the end of arr1 in ascending order.

 

Example 1:

Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
Output: [2,2,2,1,4,3,3,9,6,7,19]
Link: https://leetcode.com/problems/relative-sort-array/
 */

class relative_sort
{
	static void relativesort(int[] arr1, int[] arr2)
	{
		int a2 = 0;
		int place=0;
		while(a2<arr2.length)
		{
			int find = arr2[a2];
			for(int a1=place; a1<arr1.length; a1++)
			{
				if(arr1[a1]==find)
				{
					int temp = arr1[place];
					arr1[place] = arr1[a1];
					arr1[a1] = temp;
					place++;	
				}
			}
			a2++;
		}
		
		// Sorting the balance elements
		for(int i=place; i<arr1.length;i++)
        {
            int temp=arr1[i];
            for(int j=i+1; j<arr1.length; j++)
            if(temp>arr1[j])
            {
                arr1[i]=arr1[j];
                arr1[j]=temp;
                temp = arr1[i];
            }
                
        }
		for(int i=0; i<arr1.length; i++)
			System.out.print(arr1[i]+" ");
	}
	public static void main(String[] args)
	{
		int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
		int[] arr2 = {2,1,4,3,9,6};
		relativesort(arr1,arr2);
	}
}
