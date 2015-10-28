package MyLeetcodePackage;

import MyLeetcodeHelpers.ListNode;

public class PalindromeLinkedList {
	public static void main(String args[]){
		ListNode head = new ListNode(-1);
		head.next = new ListNode(-1);
		head.next.next = new ListNode(1);
		boolean isTrue = isPalindrome(head);
		System.out.print(isTrue);
	}
	
    public static boolean isPalindrome(ListNode head) {
        int len = 0;
        ListNode myhead = head; 
        while(head != null){
            head = head.next;
            len++;
        }
        int[] myArray = new int[len];
        int i=0;
        while(myhead != null){
        	myArray[i] = myhead.val;
        	i++;
        	myhead = myhead.next;
        }
        for(int j=0; j<Math.floor(len/2); j++){
            if(myArray[j] != myArray[len-j-1]){
                return false;
            }
        }
        return true;
    }
}
