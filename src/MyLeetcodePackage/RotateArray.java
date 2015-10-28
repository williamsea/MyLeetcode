package MyLeetcodePackage;

public class RotateArray {

	public static void main(String args[]){
		int[] nums = new int[]{1,2};//,3,4,5,6,7};
		int k=3;
		rotate(nums,k);
	}
	
	public static void rotate(int[] nums, int k) {
        int len = nums.length;
        k%=len;
        int[] rotate = new int[len];
        for(int i=0; i<k; i++){
            rotate[i] = nums[len-k+i];
        }
        for(int i=k; i<len; i++){
            rotate[i] = nums[i-k];
        }
        nums = rotate;
    }
}
