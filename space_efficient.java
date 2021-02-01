// Quickly find multiple left rotations of an array | Set 1

/* Space Efficient */
class space_efficient
{
	static void leftrotate(int[] arr, int n, int key)
	{
		for(int i=key; i<key+n; i++)
		{
			System.out.print(arr[i%n]+" ");
		}
	}
	public static void main(String[] args)
	{
		int[] arr = {1,3,5,7,9};
		int key =3;
		int n = arr.length;
		leftrotate(arr,n,key);
	}
}
