package inputOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PalindromicString {

	public static void main(String[] args) throws Exception{
		PalindromicString ps = new PalindromicString();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		if (ps.isPalindome(input)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		br.close();
	}

	public boolean isPalindome(String input) {
		try {
			if(input.length() > 0){
				int size = input.length();
				for (int i=0; i < size/2; ++i) {
					if (input.charAt(i) != input.charAt(size - i - 1)) {
						return false;
				}
			}

		} else {
			return false;
		}
	} catch (Exception e){
		return false;
	}
	return true;
}

}
