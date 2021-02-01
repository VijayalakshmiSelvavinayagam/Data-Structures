//Program to cyclically rotate an array by one

/*Given an array, cyclically rotate the array clockwise by one.

Examples:

Input:  arr[] = {1, 2, 3, 4, 5}
Output: arr[] = {5, 1, 2, 3, 4}
 * 
 * Following are steps.
1) Store last element in a variable say temp.
2) Shift all elements one position ahead.
3) Replace first element of array with temp.

filter_none
 */
import java.util.*;

public class cyclic_rotate
{
	public void rotate(int[] arr,int n)
	{
		int temp;
		temp = arr[n-1];
		for(int i=n-1; i>0; i--)
		{
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
	}
	public void print(int[] arr,int n)
	{
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args)
	{
		int arr[]= new int[] {1,2,3,4,5};
		cyclic_rotate obj1=new cyclic_rotate();
		obj1.rotate(arr,5);
		obj1.print(arr,5);
	}
}
