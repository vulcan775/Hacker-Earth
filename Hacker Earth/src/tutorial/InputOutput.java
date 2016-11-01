package tutorial;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputOutput {
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = 0;
		if (line.length() > 0) {
			N = Integer.parseInt(line);
		}
		System.out.println(N);
		Scanner s = new Scanner(System.in);
		line = s.nextLine();
		System.out.println(line);
		br.close();
		s.close();
	}

}
