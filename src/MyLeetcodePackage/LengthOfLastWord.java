package MyLeetcodePackage;

public class LengthOfLastWord {
	public static void main(String args[]){
		String s = "a";
		int len = lengthOfLastWord(s);
		System.out.print(len);
	}
	
	public static int lengthOfLastWord(String s) {
        //cannot simply do split, need to consider different cases
        if(s==null){
            return 0;
        }
        char[] c = s.toCharArray();//analysis each character
        
        int i=s.length()-1;//used to go through char array, start from end
        int j=i;//used to measure length of last word
        while(i>=0){
            while(i>=0 && !isLetter(c[i])){//when not a letter, skip
                i--;
            }
            if(i>=0){
                j=i;
                while(j>=0 && isLetter(c[j])){//go through the last word
                    j--;
                }
                if(j<0 || c[j]==' '){//regular case, found the whole last word
                    return i-j;//length of last word
                }
                i=j;//if the last word is illegal
                while(i>=0 && c[i]!=' '){
                    i--;
                }
            }
        }
        return 0;
    }
    
    public static boolean isLetter(char c){
        if(c>='a' && c<='z' || c>='A' && c<='Z'){//NOTE it should be "||" in the middle!!!
            return true;
        }
        else{
            return false;
        }
    }
}
