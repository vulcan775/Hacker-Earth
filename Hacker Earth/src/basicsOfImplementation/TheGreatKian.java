package basicsOfImplementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TheGreatKian {

	public static void main(String[] args) throws Exception {
		int n, start = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		double[] result = new double[3];
		String input = br.readLine();
		String[] nums = input.split("\\s");
		
		br.close();
		start = 0;
		while(start%3==0 && start<n) {
			result[0]+=Double.parseDouble(nums[start]);
			start+=3;
		}
		start = 1;
		while (start%3==1 && start<n) {
			result[1]+=Double.parseDouble(nums[start]);
			start+=3;
		}
		start = 2;
		while(start%3==2 && start<n) {
			result[2]+=Double.parseDouble(nums[start]);
			start+=3;
		}
		System.out.format("%.0f %.0f %.0f",result[0],result[1],result[2]);
	}

}
