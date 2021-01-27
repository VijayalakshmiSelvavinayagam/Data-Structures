//Array Rotation
/* METHOD 2 (Rotate one by one) 
 leftRotate(arr[], d, n)
start
  For i = 0 to i < d
    Left rotate all elements of arr[] by one
end */
public class rotate_method2
{
	public void rotate(int[] arr,int d,int n)
	{
		int temp,k;
		for (int i=0; i<d; i++)
		{
			temp = arr[0];
			k=0;
			for(int j=1; j<arr.length; j++)
			{
				arr[k] = arr[j];
				k+=1;
			}
			arr[n-1]=temp;
		}
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	
	}
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6,7};
		rotate_method2 obj=new rotate_method2();
		obj.rotate(arr,2,arr.length);
	}
}
