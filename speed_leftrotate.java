// Print left rotation of array in O(n) time and O(1) space
/*Given an array of size n and multiple values around which we need to left rotate the array. 
 * How to quickly print multiple left rotations?
 * Input : 
arr[] = {1, 3, 5, 7, 9}
k1 = 1
k2 = 3
k3 = 4
k4 = 6
Output : 
3 5 7 9 1
7 9 1 3 5
9 1 3 5 7
3 5 7 9 1

Input : 
arr[] = {1, 3, 5, 7, 9}
k1 = 14 
Output : 
9 1 3 5 7
 */
class speed_leftrotate
{
	static void leftrotate(int[] arr,int k,int n)
	{
		int key=k%n;
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[(i+key)%n]+" ");
		}
	}
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5};
		int k=3;
		leftrotate(arr,k,arr.length);
	}
}