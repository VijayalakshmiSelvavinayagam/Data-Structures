// Merge Sorted Array
/*
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

The number of elements initialized in nums1 and nums2 are m and n respectively. You may assume that nums1 has a size equal to m + n such that it has enough space to hold additional elements from nums2.

 

Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Example 2:

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
 Link: https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3253/
 */
public class mergesort {
		public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int j=0;
        // Case for when num1 has 0 or more elements and num2 has 1 or more elements
        if(m>=0 && n>=1)
        {
            for(int i=m; i<nums1.length;i++)
            {
                nums1[i]=nums2[j];
                j++;
            }            
        }
        // Case for when num1 has 0 or 1 element and num2 has only 1 element
        else if(m==1 && n==1)
        {
            nums1[m] = nums2[0];
        }

        // To arrange after merging if nums1 has more than 1 elements
        if(nums1.length>1)
        {
            for(int i=0;i<nums1.length;i++)
            {
                for(int k=i+1; k<nums1.length; k++)
                {
                    if(nums1[i]>nums1[k])
                    {
                      int temp = nums1[i];
                      nums1[i] = nums1[k];
                      nums1[k] = temp;
                    }
                }
            }
        } 
        
        // Print the elements
        for(int i=0;i<nums1.length;i++)
        	System.out.print(nums1[i]+" ");
		}
		
		public static void main(String[] args)
		{
			int[] nums1= {0};
			int[] nums2= {1};
			mergesort ms = new mergesort();
			ms.merge(nums1, 0, nums2, 1);
		}
}
