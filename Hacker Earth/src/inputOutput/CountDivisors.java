package inputOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountDivisors {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String numbers = br.readLine();
		int l = 0, r = 0, k = 1, numToAdd = 0;
		String[] nums = numbers.split("\\s");
		l = Integer.parseInt(nums[0]); r = Integer.parseInt(nums[1]); k = Integer.parseInt(nums[2]);

		if (r==l && (k!=r || k!= 1)) {
			System.out.println(0);
		} else {
			numToAdd = l%k;
			l+=numToAdd;
			System.out.println(r/k - l/k + 1);
		}
		br.close();
	}

}
