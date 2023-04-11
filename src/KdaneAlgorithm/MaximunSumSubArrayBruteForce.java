package KdaneAlgorithm;

/*Given an integer array nums, find the 
subarray
 with the largest sum, and return its sum.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
 

Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104
 */
public class MaximunSumSubArrayBruteForce {
	
    public static int maxSubArray(int[] nums) {
        int localMax=0;
        int globalMax=Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++)
        { 
            localMax=Math.max(nums[i],localMax+nums[i]);
            globalMax=Math.max(localMax,globalMax);
            
        }

        return globalMax;
    }
    
    public static int maxSubArray2(int[] nums) {
    	int localMax=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            localMax=Math.max(localMax,sum);
            sum=Math.max(sum,0);
        }

        return localMax;
    }
    
    
    public static void main(String[] args) {
    	int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
    	int max=maxSubArray(nums);
    	
    	System.out.println("max sum: "+max);
    	System.out.println("max sum: "+maxSubArray2(nums));
	}

}
