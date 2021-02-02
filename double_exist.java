// Check If N and Its Double Exist

/*
 * Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).

More formally check if there exists two indices i and j such that :

i != j
0 <= i, j < arr.length
arr[i] == 2 * arr[j]
 

Example 1:

Input: arr = [10,2,5,3]
Output: true
Explanation: N = 10 is the double of M = 5,that is, 10 = 2 * 5.
Example 2:

Input: arr = [7,1,14,11]
Output: true
Explanation: N = 14 is the double of M = 7,that is, 14 = 2 * 7.
Link: https://leetcode.com/explore/learn/card/fun-with-arrays/527/searching-for-items-in-an-array/3250/
 */
public class double_exist {
	public boolean checkIfExist(int[] arr) {
        if(arr.length < 1)
            return false;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if((arr[i]/2==arr[j] && arr[i]%2==0) || (arr[i]== arr[j]/2 && arr[j]%2==0))
                    return true;
            }
        }
        return false;
    }
	public static void main(String[] args)
	{
		int[] arr = {8,2,5,3};
		double_exist d=new double_exist();
		System.out.println(d.checkIfExist(arr));
	}
}
