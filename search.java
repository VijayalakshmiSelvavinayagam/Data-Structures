//Search an element in a sorted and rotated array
/*Example:

Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
         key = 3
Output : Found at index 8

Input  : arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
         key = 30
Output : Not found

Input : arr[] = {30, 40, 50, 10, 20}
        key = 10   
Output : Found at index 3

Input arr[] = {3, 4, 5, 1, 2}
Element to Search = 1
  1) Find out pivot point and divide the array in two
      sub-arrays. (pivot = 2) /*Index of 5*/
 /* 2) Now call binary search for one of the two sub-arrays.
      (a) If element is greater than 0th element then
             search in left array
      (b) Else Search in right array
          (1 will go in else as 1 < 0th element(3))
  3) If element is found in selected sub-array then return index
     Else return -1.
*/
class search
{
	// Can find this pivot only on rotated array by some number
	// If an given array is not rotated, it will return -1
	static int findpivot (int[] arr, int start, int end)
	{
		int mid;
		if(start==end)
			return end;
		if(start>end)
			return -1;
		mid = (start+end)/2;
		if(arr[mid]>arr[mid+1] && arr[mid-1]<arr[mid])
			return mid;
		if(arr[start]>=arr[mid])
			return findpivot (arr,start,mid-1);
		else
			return findpivot (arr,mid+1,end);
	}
	
	// Search in sorted array
	static int sortedbinarysearch(int[] arr, int start, int end, int key)
	{
		int mid;
		mid = (start+end)/2;
		if(key==arr[mid])
			return mid;
		if(key>arr[mid])
			return sortedbinarysearch(arr,mid+1,end,key);
		else
			return sortedbinarysearch(arr,start,mid-1,key);
	}
	
	// Search in rotated array 
	static int rotatedbinarysearch(int[] arr, int pivot, int key)
	{
		int start, end;
		if(arr[pivot]==key)
		{
			return pivot;
		}
		if(key<arr[pivot])
		{
			start = 0;
			end = pivot-1;
			return sortedbinarysearch(arr,start,end,key);
		}
		else
		{
			start = pivot+1;
			end = arr.length-1;
			return sortedbinarysearch(arr,start,end,key);
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr = {3,4,5,6,1,2};
		int pivot;
		int index;
		int key = 5;
		pivot = findpivot(arr, 0, arr.length - 1);
		System.out.println("Pivot is "+pivot);
		if(pivot == -1)
		{
			index = sortedbinarysearch(arr,0,arr.length-1,key);
			System.out.println("Index is "+index);
		}
		else
		{
			index = rotatedbinarysearch(arr,pivot,key);
			System.out.println("Index is "+index);
		}
	}
}
