
public class thirdmax {
	public int thirdMax(int[] nums) {
		int[] copy = new int[nums.length];
        int n = nums.length;
        int last_temp = 0;
        int temp = 0;
        int k=0;
        for(int i=0; i<n; i++)
        {
        	temp = nums[i];
            for(int j=i+1; j<n; j++)
            {
                if(temp<nums[j])
                {
                    temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                }
                
            }
            if(last_temp != temp)
            {copy[k]=temp;
            k++;}
            last_temp = temp;
        }
        for(int i=0; i<nums.length; i++)
        	System.out.print(copy[i]);
        
        if(k-1 >= 2)
        {
            return copy[2];            
        }
        else
            return copy[0];
    }
    
	public static void main(String[] args)
	{
		int[] nums = {1,2};
		thirdmax t = new thirdmax();
		System.out.println(t.thirdMax(nums));
		
	}
}
