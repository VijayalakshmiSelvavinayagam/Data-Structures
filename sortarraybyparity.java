// Sort Array By Parity
/*
 * Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.

You may return any answer array that satisfies this condition.

 

Example 1:

Input: [3,1,2,4]
Output: [2,4,3,1]
The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
Link: https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3260/
 */
public class sortarraybyparity {
	public int[] sortArrayByParity(int[] A) {
        int i=0;
        int j=A.length-1;
        while(i<j)
        {
            if(A[i]%2 == 0)
            {
                i++;
            }
            else
            {
                if(A[j]%2 == 0)
                {
                    int temp = A[j];
                    A[j]=A[i];
                    A[i]=temp;
                    i++;
                    j--;
                }
                else
                {
                    j--;
                }
                
            }
        }
        return A;
    }
	public static void print(int[] A)
	{
		for(int i = 0; i<A.length; i++)
			System.out.print(A[i]+" ");
	}
	public static void main(String[] args)
	{
		int[] A = {3,2,1,4,2};
		sortarraybyparity s = new sortarraybyparity();
		int[] res = s.sortArrayByParity(A);
		s.print(res);
	}
}
