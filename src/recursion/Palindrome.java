package recursion;

public class Palindrome {
	
	static void checkPalindromeReverse(String[] input, int l, int r) {
		if(l >= r) {
			return;
		}
		String temp = input[l];
		input[l] = input[r];
		input[r] = temp;
		checkPalindromeReverse(input, l+1, r-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcdef gh";
		String[] input = str.split("");
		checkPalindromeReverse(input, 0, input.length-1);
		//String res = Stream.of(input).collect(Collectors.joining(","));
		StringBuilder sb = new StringBuilder();
		for(String s : input) {
			sb.append(s);
		}
		System.out.println(sb.toString());
		String inp1 = "abcd";
		String inp2 = "abba";
		System.out.println(checkPalindrome(inp1.split(""), 0, 3));
		System.out.println(checkPalindrome(inp2.split(""), 0, 3));
	}
	
	//approach2
	
	static boolean checkPalindrome(String[] input, int l, int r) {
		if(l >= r) {
			return true;
		}
		if(!input[l].equals(input[r])) {
			return false;
		}
		return checkPalindrome(input, l+1, r-1);
	}

}
