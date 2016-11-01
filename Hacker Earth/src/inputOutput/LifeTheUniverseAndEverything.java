package inputOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LifeTheUniverseAndEverything {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			int num = Integer.parseInt(br.readLine());
			if (num == 42)
				break;
			System.out.println(num);
		}
		br.close();
	}

}
