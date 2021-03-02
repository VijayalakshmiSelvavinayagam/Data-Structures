// Sort Array By Parity II
/*
 * Given an array A of non-negative integers, half of the integers in A are odd, and half of the integers are even.

Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.

You may return any answer array that satisfies this condition.

 

Example 1:

Input: [4,2,5,7]
Output: [4,5,2,7]
Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
 Link: https://leetcode.com/problems/sort-array-by-parity-ii/
 */
class sortarray_byparity
{
	static int[] sortArrayByParityII(int[] A) {
        int[] temp = new int[A.length];
        int i=0;
        while(i<A.length-1)
        {
            for(int j=0; j<A.length; j++)
            {
                if(A[j]%2==0)
                {
                    temp[i]=A[j];
                    i=i+2;
                }                
            }
        }
        i=1;
        while(i-1<A.length-1)
        {
            for(int j=0; j<A.length; j++)
            {
                if(A[j]%2!=0)
                {
                    temp[i]=A[j];
                    i=i+2;
                }                
            }
        }
	return temp;
    	}
       
            
	public static void main(String[] args)
	{
		int[] arr={1,0};
		int[] res;
		res=sortArrayByParityII(arr);
		for(int i=0; i<res.length; i++)
			System.out.print(res[i]+" ");
	}
}
