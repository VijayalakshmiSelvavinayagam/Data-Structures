// Split the array and add the first part to the end
/*There is a given an array and split it from a specified position, 
 * and move the first part of array add to the end.
 * Examples:

Input : arr[] = {12, 10, 5, 6, 52, 36}
            k = 2
Output : arr[] = {5, 6, 52, 36, 12, 10}
Explanation : Split from index 2 and first 
part {12, 10} add to the end .

Input : arr[] = {3, 1, 2}
           k = 1
Output : arr[] = {1, 2, 3}
Explanation : Split from index 1 and first
part add to the end.
Time Complexity is O(n2) & Space complexity is O(n)
 */
class splitarray
{
	static void split(int[] arr,int n,int k)
	{
		int[] temp = new int[n];
		int j=-1;
		for(int i=k;i<n;i++)
		{
			j++;
			temp[j]=arr[i];
		}
		for(int i=0; i<k; i++)
		{
			j++;
			temp[j]=arr[i];
		}
		for (int i=0; i<n; i++)
		{
			arr[i]=temp[i];
			System.out.print(arr[i]+ " ");
		}
	}
	public static void main(String[] args)
	{
		int[] arr = {12, 10, 5, 6, 52, 36};
		int k=2;
		split(arr,arr.length,k);
	}
}