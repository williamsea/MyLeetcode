
public class ContainsDuplicateII {

	public static void main(String args[]){
//		int[] nums = new int[]{-1,-1};
//		int k = 1;
		int[] nums = new int[]{99,98,99,1, 99};
		int k = 2;
		boolean bool = containsNearbyDuplicate(nums,k);
		System.out.print(bool);
	}
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int len = nums.length;
        for(int i=0; i<len; i++){
            for(int j=i+1; j<=i+k && j<len; j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
