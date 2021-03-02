// Squares of a Sorted Array
/*
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

 

Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 
 Link: https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3240/
 */
class square_array {
    public int[] sortedSquares(int[] nums) {
        int temp;
        for(int i=0; i<nums.length; i++)
            nums[i]=nums[i]*nums[i];
        for(int i=0; i<nums.length; i++)
        {
            temp = nums[i];
            for(int j=i+1; j<nums.length; j++)
            {
                if(temp>nums[j])
                {
                    nums[i]=nums[j];
                    nums[j]=temp;
                    temp = nums[i];
                }
            }
        }
        return nums;
    }
    public static void main(String[] args)
    {
        int[] nums = {-4,-1,0,3,10};
        square_array o = new square_array();
        int[] res = o.sortedSquares(nums);
        for(int i=0; i<nums.length; i++)
            System.out.print(nums[i]+" ");
    }
}