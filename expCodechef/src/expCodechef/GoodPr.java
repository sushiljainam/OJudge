package expCodechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class GoodPr {
	static int N;
	static List<Integer> A = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(cin.readLine());

		String line = cin.readLine(); // to read multiple integers line
		String[] strs = line.trim().split("\\s+");
		for (int i = 0; i < N; i++) {
		    A.add(Integer.parseInt(strs[i]));
		}
		cin.close();
		long sum = 0;
		for (int i = 0; i < N; i++) {
			for (int j = i+1; j < N; j++) {
				if(F(i,j)){
					sum += MAX(i,j);
				}
			}
		}
		System.out.println(sum);
		return;
	}

	private static int MAX(int p, int q) {
		int max = A.get(p);
		for (int i = p+1; i <= q; i++) {
			if(max<A.get(i))
				max = A.get(i);
		}
		return max;
	}

	private static boolean F(int i, int j) {
		int t = A.get(i) & A.get(j);
		if(t==A.get(i)||t==A.get(j)){
			return true;
		}
		return false;
	}
}
