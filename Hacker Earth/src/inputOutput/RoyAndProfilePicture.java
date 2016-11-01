package inputOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RoyAndProfilePicture {
	public static void main(String[] args) throws Exception {
		RoyAndProfilePicture rapp = new RoyAndProfilePicture();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = 0, N = 0;
		String dims = "";
		L = Integer.parseInt(br.readLine());
		N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; ++i) {
			dims = br.readLine();
			rapp.promptUser(L, dims);
		}
		br.close();
	}
	
	public void promptUser(int L, String dimensions) {
		String[] dims = dimensions.split("\\s");
		int W = 0, H = 0;
		W = Integer.parseInt(dims[0]);
		H = Integer.parseInt(dims[1]);
		if (W < L || H < L ) {
			System.out.println("UPLOAD ANOTHER");
		} else if (W == H) {
			System.out.println("ACCEPTED");
		} else {
			System.out.println("CROP IT");
		}
	}
}
