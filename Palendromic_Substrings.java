package personal.testing;

public class Solution {
	
	
	
	public int countSubstrings(String s) {
		
        int palindromeCount = 0;
        int stringLength = s.length();
        
        //Check all possible substrings
        for(int i=0; i<stringLength; i++) {
        	for(int j=i+1; j<=stringLength; j++) {
        		
        		String sub = s.substring(i, j);
        		if(isPalindrome(sub)) {
        			palindromeCount++;
        		}
        	}
        }
        
        return palindromeCount;
	}
	
	
	//Check if the given string/substring is Palindrome
    
    public static boolean isPalindrome(String s) {
    	
    	boolean isAPalindrome = true;
    	
    	for(int i=0; i<s.length()-1; i++) {
    		if(s.charAt(i) != s.charAt(s.length()-1-i)) {
    			isAPalindrome = false;
    		}
    	}
    	
    	return isAPalindrome;
    }

	
    
    //Testing My Code
    public static void main(String args[]) {
		Solution sol = new Solution();
		
		
		System.out.println(sol.countSubstrings("aaa"));
		
	}
}
