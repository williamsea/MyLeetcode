import java.util.HashMap;


public class TwoSum {

	public static void main(String[] args){
		int[] numbers = new int[4];
		numbers[0]=2;
		numbers[1]=7;
		numbers[2]=11;
		numbers[3]=15;
		int target = 26;
		int[] result = new int[2];
		result = TwoSum(numbers, target);
		System.out.println(result[0]);
		System.out.println(result[1]);
	}
	
	public static int[] TwoSum(int[] numbers, int target){
		int[] result = new int[2];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i<numbers.length; i++){
			if(map.containsKey(numbers[i])){//Returns true if this map contains a mapping for the specified key.
				int index = map.get(numbers[i]);//Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
				result[0] = index+1;
				result[1] = i+1;
				break;
			}
			else{
				map.put(target-numbers[i],i);//Associates the specified value with the specified key in this map. If the map previously contained a mapping for the key, the old value is replaced.
			}
		}
		return result;
	}
}
