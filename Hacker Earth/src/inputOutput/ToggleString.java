package inputOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ToggleString {

	public static void main(String[] args) throws Exception {
		ToggleString ts = new ToggleString();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String result = "";
		for (int i=0; i<line.length(); ++i) {
			char c = line.charAt(i);
			if (ts.isUpperCase(c)) {
				result = result + String.valueOf(c).toLowerCase();
			} else {
				result = result + String.valueOf(c).toUpperCase();
			}
		}
		System.out.println(result);
		br.close();
	}
	public boolean isUpperCase (char character) {
		try {
			if (character >= 'A' && character <= 'Z') {
				return true;
			} else 
				return false;
		} catch (Exception e) {
			return false;
		}
	}

}
