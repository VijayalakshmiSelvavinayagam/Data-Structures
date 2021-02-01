// Rearrange an array such that arr[i] = i
/*
 * 1. Nav­i­gate through the array. 
2. Check if a[i] = -1, if yes then ignore it. 
3. If a[i] != -1, Check if element a[i] is at its cor­rect posi­tion (i=A[i]). If yes then ignore it. 
4. If a[i] != -1 and ele­ment a[i] is not at its cor­rect posi­tion (i!=A[i]) then place it to its correct posi­tion, but there are two conditions:  

Either A[i] is vacate, means A[i] = -1, then just put A[i] = i .
OR A[i] is not vacate, means A[i] = x, then int y=x put A[i] = i. Now, we need to place y to its cor­rect place, so repeat from step 3.
 */
class rearrange_method2
{
	static void arrange(int[] arr, int n)
	{
		int x =0;
		int y = 0;
		for(int i=0; i<n; i++)
		{
			if(arr[i] != -1 && arr[i] != i)
			{
				x= arr[i];
				while (arr[x] != -1 && arr[x] != x)
				{
					y=arr[x];
					arr[x] = x;
					x = y;
				}
				arr[x] = y;
				if(arr[i]!= i)
					arr[i] = -1;
			}
		}
	}
	static void print(int[] arr, int n)
	{
			for(int i=0; i<n; i++)
					System.out.print(arr[i]+" ");
	}
	public static void main(String[] args)
	{
		int[] arr = {2,7,-1,3,-1,4,6,-1};
		arrange(arr,arr.length);
		print(arr,arr.length);
	}
}