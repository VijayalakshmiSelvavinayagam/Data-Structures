// Move Zeros to the right
/*
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.
Link: https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3157/
 */
public class move_zeros {
	public void moveZeroes(int[] nums) {
        int i = 0; 
        int j = 1;
        while(j<nums.length)
        {
            if(nums[i]==0)
            {
                if(nums[j]!=0)
                {
                    nums[i] = nums[j];
                    nums[j] = 0;
                    i++;
                    j++;
                }
                else
                {
                    j++;
                }
            }
            else
            {
                i++;
                j++;
            }
        }
        for(int l=0; l<nums.length; l++)
        	System.out.print(nums[l]+" ");
    }
	public static void main(String[] args)
	{
		move_zeros m = new move_zeros();
		int[] nums = {0,1};
		m.moveZeroes(nums);
	}
}
