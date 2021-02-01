// Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
/* METHOD 1 (Using temp array)
Input arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2, n =7
1) Store the first d elements in a temp array
   temp[] = [1, 2]
2) Shift rest of the arr[]
   arr[] = [3, 4, 5, 6, 7, 6, 7]
3) Store back the d elements
   arr[] = [3, 4, 5, 6, 7, 1, 2]*/
public class rotate_method1
{
	public void rotate(int[] arr,int d,int n)
	{
		int[] temp = new int[d];
		int j = 0;
		for (int i=0;i<d;i++)	
		{
			temp[i]=arr[i];
		}
		for (int i=d;i>=d && i<n;i++)
		{
			arr[j] = arr[i];
			j+=1;
		}
		for (int i=0; i<temp.length; i++)
		{
			arr[j]=temp[i];
			j+=1;
		}
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main (String[] args)
	{
		int[] arr = {1,2,3,4,5,6,7};
		rotate_method1 obj = new rotate_method1();
		obj.rotate(arr,2,7);
	}
}
