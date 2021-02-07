// Intersection of Two Arrays
/*
 * Given two arrays, write a function to compute their intersection.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Link: https://leetcode.com/problems/intersection-of-two-arrays/
 */
import java.util.*;
class intersection_array
{
	static int[] intersection(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int found = 0;
        int count = 0;
        int[] res;
        int k=0;
        
        Arrays.sort(nums2);
        int p=0;
        for(int j=1; j<nums2.length; j++)
        {
            if(nums2[p]!=nums2[j])
            {
                p++;
                nums2[p]=nums2[j];
            }
        }
        p=p+1;
        for(int l=p;l<nums2.length;l++)
        nums2[l]=-1;
        
        Arrays.sort(nums1);
            
        p=0;
        for(int j=1; j<nums1.length; j++)
        {
            if(nums1[p]!=nums1[j])
            {
                p++;
                nums1[p]=nums1[j];
            }
        }
        p=p+1;
        for(int l=p;l<nums1.length;l++)
            nums1[l]=-1;
        
        
        if(len1<len2)
        {
            for(int i=0; i<nums1.length; i++)
            {
                int element = nums1[i];
                for(int j=0; j<nums2.length; j++)
                {
                    if(nums2[j]!=-1)
                    {
                    if(element == nums2[j])
                    {
                        nums2[j]=-1;
                        found=1;
                        break;
                    }
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
                    if(nums1[j]!=-1)
                    {
                    if(element == nums1[j])
                    {
                        nums1[j]=-1;
                        found=1;
                        break;
                    }
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
                {if(nums2[i]>0)
                {res[k]=nums2[i];
                k++;}
                }
            }
        }
        return res;
    	}       
            
	public static void main(String[] args)
	{
		int[] arr1={1,2,2,1};
		int[] arr2={2,2};
		int[] res;
		res=intersection(arr1,arr2);
		for(int i=0; i<res.length; i++)
			System.out.print(res[i]+" ");
	}
}
