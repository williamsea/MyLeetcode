import java.util.ArrayList;
import java.util.List;


public class GenerateParentheses {
	public static void main(String args[]){
		
		ArrayList<String> showSol = (ArrayList<String>) generateParentheses(3);
	}
	
	public static List<String> generateParentheses(int n) {
        //http://www.programcreek.com/2014/01/leetcode-generate-parentheses-java/
        //Use DFS, when left>right, there are more "(" than ")", not correct
        ArrayList<String> result = new ArrayList<String>();
        dfs(result, "", n, n);
        return result;
    }
    
    public static void dfs(ArrayList<String> result, String s, int left, int right){
        //we don't need a StringBuilder, s+"(" is OK
        // StringBuilder sb = new StringBuilder();
        // sb = s;
        if(left>right){
            return;
        }
        if(left == 0 && right == 0){
            result.add(s);
            return;
        }
        
        if(left>0){
            // dfs(result, s+"(", left - 1; right);
            dfs(result, s+"(", left - 1, right);
            // dfs(result, s+"(", left - 1; right);
        }
        
        if(right>0){
            dfs(result, s+")", left, right - 1);
        }
    }
}
