package algorithms;

public class JumpGame {

	public static boolean canJump(int[] nums) {

        if(nums.length < 3){
            if(nums.length == 1 && (nums[0] == 0 || nums[0] == 1)) return true;
            else if(nums.length == 2 && (nums[0] == 1 || nums[1] == 0)) return true;
            else{
                return false;
            }
        }
        
        int len = nums.length;
        int lastIndex = nums.length - 1;
        int i = 0;
        
        while(i < len){
            if(lastIndex - i == nums[i]){
                return true;
            }else{
                if(i + nums[i] <= lastIndex && nums[i] != 0){
                    if( i + nums[i] == lastIndex) return true;
                	i += nums[i];
                }else{
                    return false;
                }
            }
        }
        return false;
    
	}
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		System.out.println(canJump(nums));
	}
}
