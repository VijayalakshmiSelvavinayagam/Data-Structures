// Duplicate Zeros
/*
 * Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.

Note that elements beyond the length of the original array are not written.

Do the above modifications to the input array in place, do not return anything from your function.

 

Example 1:

Input: [1,0,2,3,0,4,5,0]
Output: null
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
Example 2:

Input: [1,2,3]
Output: null
Explanation: After calling your function, the input array is modified to: [1,2,3]
Link: https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3245/
 */
public class duplicatezeros {
	public void duplicate(int[] arr) {
        for(int i=0; i<arr.length-1;)
        {
            if(arr[i]==0)
            {
                for(int j=arr.length-1; j>i; j--)
                {
                    arr[j]=arr[j-1];
                }
                arr[i+1]=0;
                i=i+2;
            }
            else
                i++;
        }
        for(int i=0; i<arr.length; i++)
        	System.out.print(arr[i]+" ");
    }
	public static void main(String[] args)
	{
		int[] arr= {0,1};
		duplicatezeros o=new duplicatezeros();
		o.duplicate(arr);
	}
}
