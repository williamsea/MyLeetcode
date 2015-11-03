package MyLeetcodePackage;

import java.util.Arrays;

public class IsValidAnagram {
	
	public static void main(String args[]){
		String s = "";
		String t = "";
		boolean b = IsValidAnagram(s,t);
		System.out.print(b);
	}
	
    public static boolean IsValidAnagram(String s, String t) {
        // Sort in arrays
        
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();
        
        Arrays.sort(sarr);
        Arrays.sort(tarr);
        
        s = new String(sarr);
        t = new String(tarr);
        
        if(s.equals(t)){
            return true;
        }
        else{
            return false;
        }
        
    }
}
