package MyLeetcodePackage;
import java.util.Arrays;


public class MergeSortedArray {

	public static void main(String args[]){
		int[] nums1 = new int[]{0};
		int[] nums2 = new int[]{1};
		int m = 0;//nums1.length;
		int n = nums2.length;
		merge(nums1,m,nums2,n);
	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] A = new int[m+1];
        int[] B = new int[n+1];
       //copyOf(int[] original, int newLength)
       //Copies the specified array, truncating or padding with zeros (if              necessary) so the copy has the specified length.
        // A = Arrays.copyOf(nums1, m); Being truncated, not correct
        // B = Arrays.copyOf(nums2, n);
        for(int p = 0; p<m; p++){
            A[p] = nums1[p];
        }
        A[m] = Integer.MAX_VALUE;
        for(int q = 0; q<n; q++){
            B[q] = nums2[q];
        }
        B[n] = Integer.MAX_VALUE;
        
        int[] nums = new int[m+n];
        int i=0, j=0, k=0;
        while(i<m || j<n){
            if(A[i]<=B[j]){
                nums[k] = A[i];
                i++;
            }
            else{
                nums[k] = B[j];
                j++;
            }
            k++;
        }
        nums1 = Arrays.copyOf(nums,m+n);
    }
}
