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

1) Find middle point mid = (l + h)/2
2) If key is present at middle point, return mid.
3) Else If arr[l..mid] is sorted
    a) If key to be searched lies in range from arr[l]
       to arr[mid], recur for arr[l..mid].
    b) Else recur for arr[mid+1..h]
4) Else (arr[mid+1..h] must be sorted)
    a) If key to be searched lies in range from arr[mid+1]
       to arr[h], recur for arr[mid+1..h].
    b) Else recur for arr[l..mid] 
 */
class rotatedsearch
{
	static int search(int[] arr, int start, int end, int key)
	{
		int mid;
		mid = (start+end)/2;
		if(key==arr[mid])
			return mid;
		if(key<=arr[mid] && key>=arr[start])
			return search(arr,start,mid-1,key);
		else
			return search(arr,mid+1,end,key);
	}
	public static void main(String[] args)
	{
		int[] arr = {3,4,5,1,2};
		int key = 2;
		int index;
		index = search(arr,0,arr.length-1,key);
		System.out.println("Index : "+index);
	}
}