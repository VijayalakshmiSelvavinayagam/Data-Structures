// Longest Mountain in an array
/*
 * You may recall that an array arr is a mountain array if and only if:

arr.length >= 3
There exists some index i (0-indexed) with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given an integer array arr, return the length of the longest subarray, which is a mountain. Return 0 if there is no mountain subarray.

 

Example 1:

Input: arr = [2,1,4,7,3,2,5]
Output: 5
Explanation: The largest mountain is [1,4,7,3,2] which has length 5.
Example 2:

Input: arr = [2,2,2]
Output: 0
Explanation: There is no mountain.
 Link: https://leetcode.com/problems/longest-mountain-in-array/
 */
class longestmountain
{
	static int longestMountain(int[] arr) {
        int count=0;
        int start = 0;
        if(arr.length<3)
            return 0;

        while(start<arr.length)
        {
            int end = start;
            if(end+1<arr.length && arr[end]<arr[end+1])
            {
                while(end+1<arr.length && arr[end]<arr[end+1])
                    end++;
                if(end+1<arr.length && arr[end]>arr[end+1])
                {
                while(end+1<arr.length && arr[end]>arr[end+1])
                    end++;
                count=Math.max(count,end-start+1);
                }
            }
            start=Math.max(end,start+1);
        }
        return count;
        }

	public static void main(String[] args)
	{
		int[] arr={1,2,3,5,4,3,2,8};
		System.out.println(longestMountain(arr));
	}
}
