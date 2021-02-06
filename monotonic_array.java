/*
 * An array is monotonic if it is either monotone increasing or monotone decreasing.

An array A is monotone increasing if for all i <= j, A[i] <= A[j].  An array A is monotone decreasing if for all i <= j, A[i] >= A[j].

Return true if and only if the given array A is monotonic.

 

Example 1:

Input: [1,2,2,3]
Output: true
Example 2:

Input: [6,5,4,4]
Output: true
Example 3:

Input: [1,3,2]
Output: false
Example 4:

Input: [1,2,4,5]
Output: true
Example 5:

Input: [1,1,1]
Output: true
Link: https://leetcode.com/problems/monotonic-array/
 */
public class monotonic_array {
	public boolean isMonotonic(int[] A) {
        int i=0;
        if(A.length==0)
            return false;
        if(A.length== 1)
            return true;
        while(A[i]==A[i+1] && i<A.length-1)
        {
            i++;
            if(i==A.length-1)
                return true;
        }
        if(A[i]>A[i+1])
        {
            for(int j=i+1; j<A.length-1; j++)
                if(A[j]<A[j+1] && A[j]!=A[j+1])
                    return false;
            return true;
        }
        else
        if(A[i]<A[i+1])
        {
            for(int j=i+1; j<A.length-1; j++)
                if(A[j]>A[j+1] && A[j]!=A[j+1])
                    return false;
            return true;
        }  
        return false;
    }
	public static void main(String[] args) {
		int[] arr= {0,0,2,3};
		monotonic_array o=new monotonic_array();
		System.out.println(o.isMonotonic(arr));
	}
}
