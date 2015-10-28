package MyLeetcodePackage;

public class MajorityElement {

	public static void main(String[] args){
		int[] num = {1,2,2, 3,3,5};
		int res = majorityElement(num);
		System.out.print("res = " + res);
	}
	
	public static int majorityElement(int[] num){
		if(num.length == 1){
			return num[0];
		}
		int len = num.length/2;
		System.out.print("length = " +len + '\n');
		return num[num.length/2];
	}
}
