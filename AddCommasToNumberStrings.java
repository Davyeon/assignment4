package week3;

import acm.program.ConsoleProgram;

public class AddCommasToNumberStrings extends ConsoleProgram {
	
	public void run() {
		while (true) {
			String digits = readLine ("Enter a number: " );
			if (digits.length() == 0) break;
			println(addCommasToNumericString(digits));
		}
		
	}
	
	private String addCommasToNumericString(String digits) {
		String res = "";
		int len = digits.length();
		int nDigits = 0;
		for (int i= len - 1; i >= 0; i--) {
			res = digits.charAt(i) + res;
			nDigits++;
			if ((nDigits % 3 == 0) && (i > 0)) {
				res = "," + res;
		}
	}
	return res;
	
	}

}
