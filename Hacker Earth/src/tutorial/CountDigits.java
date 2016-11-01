package tutorial;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountDigits {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int[] nums = new int[10];
		br.close();
		for(char c:input.toCharArray()){
			++nums[(int) (c-48)];
		}
		for (int i=0;i<10;++i) {
			System.out.println(i + " " + nums[i]);
		}
	}

}
