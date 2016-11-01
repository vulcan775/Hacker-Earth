package inputOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FindProduct {

	public static void main(String[] args) throws Exception {
		FindProduct fp = new FindProduct();
		double product = 1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String values = br.readLine();
		String[] nums = values.split("\\s");
		for (String s:nums) {
			product = fp.getNumber(product, Integer.parseInt(s));
		}
		System.out.format("%.0f", product);
		br.close();
	}

	public double getNumber (double product, int number) {
		try {
			product = (product * number) % (Math.pow(10, 9) + 7) ;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
		
		return product;
	}
}
