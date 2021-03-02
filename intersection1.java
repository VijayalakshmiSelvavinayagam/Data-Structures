import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class intersection1 {
	static int[] intersection(int[] nums1, int[] nums2)
	{
		List<Integer> list = new ArrayList<Integer>();
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		
		if(nums1.length ==0 || nums2.length == 0)
			return new int[0];
		int i=nums2.length;
		
		for(int k=0; k<i; k++)
		{
			int l=0;
			while(l<nums1.length)
			{
				if(nums1[l]==nums2[k])
				{
					list.add(nums2[k]);
					k++;
					l++;
				}	
				else
					l++;
			}
		}
		int[] res = new int[list.size()];
		int n=0;
		for(Integer p:list)
		{
			res[n]=p;
			n++;
		}
		return res;
	}
	public static void main(String[] args)
	{
		int[] arr1={1,2,2,1,3,4};
		int[] arr2={2,2,4};
		int[] res;
		res=intersection(arr1,arr2);
		for(int i=0; i<res.length; i++)
			System.out.print(res[i]+" ");
	}
}
