/*Let AB are the two parts of the input array where A = arr[0..d-1] and B = arr[d..n-1]. The idea of the algorithm is : 
 

Reverse A to get ArB, where Ar is reverse of A.
Reverse B to get ArBr, where Br is reverse of B.
Reverse all to get (ArBr) r = BA.
Example : 
Let the array be arr[] = [1, 2, 3, 4, 5, 6, 7], d =2 and n = 7 
A = [1, 2] and B = [3, 4, 5, 6, 7] 
 

Reverse A, we get ArB = [2, 1, 3, 4, 5, 6, 7]
Reverse B, we get ArBr = [2, 1, 7, 6, 5, 4, 3]
Reverse all, we get (ArBr)r = [3, 4, 5, 6, 7, 1, 2]
*/
import java.io.*;

public class rotatearray_method4
{
	public void rotate(int[] arr, int d, int n)
	{	
		if(d==0)
		{
			return;
		}
		d=d%n;
		reverse (arr, 0, d-1);
		reverse (arr,d,n-1);
		reverse (arr,0,n-1);
	
	}
	public void reverse (int[] arr, int s, int e)
	{
		int temp;
		while(s<e)
		{
			temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;
			s++;
			e--;
		}
	}	
	public void printarr(int[] arr, int s, int e)
	{
		for(int i=s; i<e; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6,7};
		int d=2;
		int n=arr.length;
		rotatearray_method4 obj1= new rotatearray_method4();
		obj1.rotate(arr,d,n);
		obj1.printarr(arr,0,n);
	}
}