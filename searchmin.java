// Find the minimum element in a sorted and rotated array
/* A simple solution is to traverse the complete array and find a minimum. This solution requires O(n) time. 
We can do it in O(Logn) using Binary Search. If we take a closer look at the above examples, we can easily figure out the following pattern:

The minimum element is the only element whose previous is greater than it. If there is no previous element, then there is no rotation (the first element is minimum). We check this condition for the middle element by comparing it with (mid-1)’th and (mid+1)’th elements.
If the minimum element is not at the middle (neither mid nor mid + 1), then the minimum element lies in either the left half or right half. 
If the middle element is smaller than the last element, then the minimum element lies in the left half
Else minimum element lies in the right half.
 */

class searchmin
{
	static int findminimum(int[] arr, int s, int e)
	{	
		int mid = (s+e)/2;
		if(s==e)
			return s;
		if(mid == 0 && arr[mid]<arr[mid+1])
			return mid;
		if(mid == arr.length-1)
			return mid;
		if(arr[mid] < arr[mid+1] && arr[mid-1] > arr[mid])
			return mid;
		if(arr[mid]<arr[e])
			return findminimum(arr,0,mid-1);
		else
			return findminimum(arr,mid+1,e);
	}
	public static void main(String[] args)
	{
		int arr[] = {2, 3, 4, 5, 5, 6, 7, 8, 1};
		int n = arr.length;
		int index;
		index=findminimum(arr,0,n-1);
		System.out.println("Smallest element is "+arr[index]);
	}
}