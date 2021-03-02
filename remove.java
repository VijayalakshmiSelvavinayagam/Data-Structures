// Remove element
/*
 * Given an array nums and a value val, remove all instances of that value in-place and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Clarification:

Confused why the returned value is an integer but your answer is an array?

Note that the input array is passed in by reference, which means a modification to the input array will be known to the caller as well.

Internally you can think of this:

// nums is passed in by reference. (i.e., without making a copy)
int len = removeElement(nums, val);

// any modification to nums in your function would be known by the caller.
// using the length returned by your function, it prints the first len elements.
for (int i = 0; i < len; i++) {
    print(nums[i]);
}
Link: https://leetcode.com/explore/learn/card/fun-with-arrays/526/deleting-items-from-an-array/3247/
 */
public class remove {
	public int removeElement(int[] nums, int val) {
		int j=0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] != val)
            {
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
	public void print(int[] nums, int len)
	{
		for(int i=0; i<len; i++)
			System.out.print(nums[i]+" ");
	}
	public static void main(String[] args){
		int[] nums= {0,1,2,2,3,0,4,2};
		int len;
		remove r=new remove();
		len = r.removeElement(nums,2);
		r.print(nums,len);
	}
}
