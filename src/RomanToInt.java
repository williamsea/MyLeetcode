
public class RomanToInt {

	public static void main(String[] args){
		String s = "DCXXI";
		int i = 0;
		i = romanToInt(s);
		System.out.print(i);
	}
	
	public static int romanToInt(String s) {
	    //基本字符      	I	V	X	L	C	D	M
	    //对应阿拉伯数字	1	5	10	50	100	500	1000
	    /*
	    -相同的数字连写，所表示的数等于这些数字相加得到的数，例如：III = 3
	    -小的数字在大的数字右边，所表示的数等于这些数字相加得到的数，例如：VIII = 8
	    -小的数字，限于（I、X和C）在大的数字左边，所表示的数等于大数减去小数所得的数，例如：IV = 4
	    -正常使用时，连续的数字重复不得超过三次
	    -在一个数的上面画横线，表示这个数扩大1000倍（本题只考虑3999以内的数，所以用不到这条规则）
	    */
	    if(s==null){
	        return 0;
	    }
	    
	    int len = s.length();
	     char[] r = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
	     int[] i =   {1,   5,  10,   50, 100, 500,1000};
//	    char[] r = {'M','D','C','L','X','V','I'};
//	    int[] i = {1000,500,100,50,10,5,1};
	    int result = 0;
	    int prev = 4000;
	    
	    for (int m = 0; m < len; m++){
	        for(int n = 0; n < r.length; n++){
	            if(r[n]==s.charAt(m)){
	                result  = result + i[n];//add in sequence for prev >= now
	                 if(prev < n) {//index comparison, if next letter is larger
//	                if(prev > n) {//index comparison, if prev letter is larger
	                    result = result - 2*i[prev];//result = result + i[n] - 2*i[n] = result - i[n]. IV = 4 = 1 + 5 - 2*1
	                }
	                prev = n;
	            }
	        }
	    }
	    
	    return result;
	
	}
}
