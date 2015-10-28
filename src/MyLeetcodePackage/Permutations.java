package MyLeetcodePackage;
import java.util.ArrayList;
import java.util.List;


public class Permutations {

	public static void main(String args[]){
		int[] nums = new int[]{1,2,3};
		List<List<Integer>> result = new ArrayList<List<Integer>>(Permutations(nums));
		System.out.print(result);
	}
	public static List<List<Integer>> Permutations(int[] nums) {
        //https://leetcodenotes.wordpress.com/2013/08/07/leetcode-permutations-%E4%B8%80%E4%B8%AAarray%E7%9A%84%E6%89%80%E6%9C%89permutation/
// 每次取一个元素，对于之前（上一层循环的list结果）的每个permutation, 在能插的地方就插这个新元素，然后生成新的permutation，放入这一层的结果。这样代码相对简单，而且不用recursion。有几个要点：
// 最开始要传一个空的permutation进去，否则没处可insert第一个元素。
// 这种做法不能防止duplication（1212可能有好几种insert成它的方法）。
//http://gongxuns.blogspot.com/2012/12/leetcode-permutations.html

//The correct writing should be: List<List<Integer>> ret = new ArrayList<List<Integer>>(); Since in this way, you can add not only ArrayList but also LinkedList to ret
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        result.add(new ArrayList<Integer>());
        
        for(int i=0; i<nums.length; i++){
            List<List<Integer>> current = new ArrayList<List<Integer>>();
            for(List<Integer> temp: result){
                for(int j=0; j<temp.size()+1; j++){
                    temp.add(j,nums[i]);
                    ArrayList<Integer> temp2 = new ArrayList<Integer>(temp);
                    current.add(temp2);
                    temp.remove(j);
                }
            }
            result = new ArrayList<List<Integer>>(current);
        }
        return result;
    }
}
