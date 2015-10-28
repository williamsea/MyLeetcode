package MyLeetcodePackage;

public class LargestNumber {

	public static void main(String[] args){
		
//		int[] nums = new int[5];
//		nums[0]=3;
		int[] nums = {3,30,34,5,9};
		String result = largestNumber(nums);
		System.out.print(result);
	}
	
	public static String largestNumber(int[] nums) {
        //This problem can be solve by simply sorting strings, not sorting integer. Define a comparator to compare strings by concat() right-to-left or left-to-right.
        String[] NUM = new String[nums.length];
        
        for(int i=0; i<nums.length;i++){
            NUM[i] = String.valueOf(nums[i]);
        }
        
        java.util.Arrays.sort(NUM,new java.util.Comparator<String>(){
            public int compare(String left, String right){
                String leftRight = left.concat(right);
                String rightLeft = right.concat(left);
                int temp = rightLeft.compareTo(leftRight);
                return temp;
            }
        });
        
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<NUM.length; i++){
            sb.append(NUM[i]);
        }
        
        java.math.BigInteger result = new java.math.BigInteger(sb.toString());
        
        return result.toString();
    }
}
