// Height Checker
/*
 * tudents are asked to stand in non-decreasing order of heights for an annual photo.

Return the minimum number of students that must move in order for all students to be standing in non-decreasing order of height.

Notice that when a group of students is selected they can reorder in any possible way between themselves and the non selected students remain on their seats.

 

Example 1:

Input: heights = [1,1,4,2,1,3]
Output: 3
Explanation: 
Current array : [1,1,4,2,1,3]
Target array  : [1,1,1,2,3,4]
On index 2 (0-based) we have 4 vs 1 so we have to move this student.
On index 4 (0-based) we have 1 vs 3 so we have to move this student.
On index 5 (0-based) we have 3 vs 4 so we have to move this student.
Example 2:

Input: heights = [5,1,2,3,4]
Output: 5
Example 3:

Input: heights = [1,2,3,4,5]
Output: 0
Link: https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3228/
 */
public class heightchecker {
	public int heightChecker(int[] heights) {
		int copy[] = new int[heights.length];
        int count=0;
        int temp;
        for(int i=0;i<heights.length;i++)
            copy[i]=heights[i];
        for(int i=0; i<heights.length -1; i++)
        {
            temp = heights[i];
            for(int j=i+1; j<heights.length; j++)
            {
                if(temp>heights[j])
                {
                    temp = heights[j];
                    heights[j] = heights[i];
                    heights[i] = temp;
                }
            }
        }
        for(int i=0; i<heights.length; i++)
        {
            if(copy[i]!=heights[i])
            {
                count++;
            }
        }
        return count;
    }
	public static void main(String[] args)
	{
		int[] heights = {5,1,2,3,4};
		heightchecker h = new heightchecker();
		System.out.print(h.heightChecker(heights));
	}
}
