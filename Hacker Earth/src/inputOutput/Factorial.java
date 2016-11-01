package inputOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Factorial {
	public static void main(String[] args) throws Exception {
		int N = 1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		double f = 1;
		for (;N>0;--N) {
			f*=N;
		}
		System.out.format("%.0f",f);
		br.close();
	}

}
