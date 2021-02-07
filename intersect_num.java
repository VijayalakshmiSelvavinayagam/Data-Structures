// Intersection of Two Arrays II
/*
 * Given two arrays, write a function to compute their intersection.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Note:

Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.
Link: https://leetcode.com/problems/intersection-of-two-arrays-ii/
 */
class intersect_num
{
	static int[] intersect(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int found = 0;
        int count = 0;
        int[] res;
        int k=0;
        if(len1<len2)
        {
            for(int i=0; i<nums1.length; i++)
            {
                int element = nums1[i];
                for(int j=0; j<nums2.length; j++)
                {
                    if(element == nums2[j])
                    {
                        nums2[j]=-1;
                        found=1;
                        break;
                    }
                }
                if(found==0)
                {
                    nums1[i]=0;
                }
                else
                {
                    found=0;
                    count++;
                }
            }
       
            res=new int[count];
            for(int i=0; i<nums1.length; i++)
            {
                if(k<count)
                {
                    if(nums1[i]!=0)
                    {
                        res[k]=nums1[i];
                        k++;
                    }
                }
            }
        }
        else
        {
            int j;
            for(int i=0; i<nums2.length; i++)
            {
                int element = nums2[i];
                for(j=0; j<nums1.length; j++)
                {
                    if(element == nums1[j])
                    {
                        nums1[j]=-1;
                        found=1;
                        break;
                    }
                }
                if(found==0)
                {
                    nums2[i]=0;
                }
                else
                {
                    found=0;
                    count++;
                }
            }
            res=new int[count];
            for(int i=0; i<nums2.length; i++)
            {
                if(k<count)
                {if(nums2[i]!=0)
                {res[k]=nums2[i];
                k++;}
                }
            }
        }
        return res;
    	}
	public static void main(String[] args)
	{
		int[] arr1 = {-2147483648,1,2,3};
		int[] arr2 = {1,-2147483648,-2147483648};
		int[] res;
		res=intersect(arr1,arr2);
		for(int i=0; i<res.length; i++)
			System.out.print(res[i]+" ");
	}
}
