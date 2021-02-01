//Given a sorted and rotated array, find if there is a pair with a given sum

class searchsumrotational
{
	static void searchsum(int[] arr, int n, int sum)
	{
		int s = 0;
		int l = 0;
		int found = 0;
		for(int i=0; i<n-1; i++)
		{
			if(arr[i]<arr[i+1])
				continue;
			s=i+1;
			l=i;
		}
		while(l!=s)
		{
			if(arr[s]+arr[l]==sum)
			{
				found = 1;
				System.out.println("Sum of 2 elements are: "+arr[s]+","+arr[l]);
			}
			
			if(arr[s]+arr[l]>sum)
			{	if(l>0) //Check if larger element index comes to 0th or left most index
					l--;
				else 
					l=n-1;
			}
			else 
			{	if(s<n-1) //Check if smaller element index comes to nth or right most index
					s++;
				else
					s=0;
			}
		}
		if(found == 0)
			System.out.println("No elements are found");
	}
	public static void main(String[] args)
	{
		int[] arr={3,4,5,1,2};
		int n=arr.length;
		int sum=6;
		searchsum(arr,n,sum);
	}
}