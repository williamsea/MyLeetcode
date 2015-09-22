
public class RemoveDuplicates {
	public static void main(String args[]){
		int[] nums = new int[]{1,2,2,3,4,4,5,6,7,7};
		int count = removeDuplicates(nums);
		System.out.print(count);
	}
	
    public static int removeDuplicates(int[] nums) {
        //sorted
        if(nums.length<=1){
            return nums.length;
        }
        int count = 1;//if length > 1, count is at least 1
        for(int i=1; i<nums.length;i++){//start from the second element, compare with its previous one, repeat until i is the last element
            if(nums[i]!=nums[i-1]){
                //Added for rearrange the array
                if(nums[count]!=nums[i]){//if the current count index is diff from the most forward index, update current count index element
                    nums[count] = nums[i];
                }
                count++;
            }
        }
        return count;
    }
}
