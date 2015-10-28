package MyLeetcodePackage;
import java.util.LinkedList;
import java.util.List;


public class LetterCombinations {
	
	public static void main(String[] args){
//		String digits = "23";
		String digits = "";
		List<String> result = letterCombinations(digits);
		for(int id = 0; id<result.size(); id++){
			System.out.print(result.get(id)+'\t');
		}
		
	}
	
    public static List<String> letterCombinations(String digits) {
        //http://www.lifeincode.net/programming/leetcode-letter-combinations-of-a-phone-number-java/
        //Iterative
        //Assuming the average number of letters on every number is m, and the length of digits string is n, then the complexity is O(mn).
        LinkedList<String> list = new LinkedList<>();//result list
//    	if(digits == ""){
        if(digits.length()==0){
            return list;
        }
    	
    	String[] letters = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        list.add("");
        for(int i=0; i<digits.length(); i++){//for each digit in digits
            int num = digits.charAt(i) - '2';//Index corresponding to letters, '2'-'2'=0, which corresponds to "abc"
            int size = list.size();
            for(int k=0; k<size; k++){
                String tmp = list.pop();
                for(int j=0; j<letters[num].length();j++){
                    list.add(tmp + letters[num].charAt(j));
                }
            }
        }
        List<String> rec = new LinkedList<>();
        rec.addAll(list);
        return rec;
    }
}
