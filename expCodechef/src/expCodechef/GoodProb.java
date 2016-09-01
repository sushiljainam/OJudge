package expCodechef;
import java.util.Scanner;

class GoodProb {
	static int N;
	static int[] A = new int[100000];
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		N = cin.nextInt();cin.nextLine();

		for (int i = 0; i < N; i++) {
			A[i] = cin.nextInt();
			//System.out.println(A[i]);
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
		int max = A[p];
		for (int i = p+1; i <= q; i++) {
			if(max<A[i])
				max = A[i];
		}
		return max;
	}

	private static boolean F(int i, int j) {
		int t = A[i] & A[j];
		if(t==A[i]||t==A[j]){
			return true;
		}
		return false;
	}
}
